package com.abhi.brms.drools.demo.service;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.abhi.brms.drools.demo.configuration.RulesConfiguration;
import com.abhi.brms.drools.demo.facts.promotion.CalculationType;
import com.abhi.brms.drools.demo.facts.promotion.Promotion;
import com.abhi.brms.drools.demo.facts.transaction.Transaction;
import com.abhi.brms.drools.demo.services.DroolsService;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = RulesConfiguration.class)
public class DroolsServiceImplTest {

	@Autowired
	private DroolsService droolsService;

	private static SimpleDateFormat sdf;

	@BeforeAll
	public static void setup() {
		sdf = new SimpleDateFormat("YYYY-MM-DD");
	}

	@Test
	public void demoTestFixed() throws ParseException {
		Transaction trans = new Transaction();
		trans.setTransactionDate(sdf.parse("2020-01-01"));
		trans.setTransactionId("T1234");
		trans.setCardType("C1");
		trans.setServiceEstablishment("SE2");
		trans.setTransactionAmount(new BigDecimal(500.0));

		
		List<Transaction> resultingTrans = droolsService.calculateBonus(getPromotions(), Arrays.asList(trans));

		Assertions.assertNotNull(resultingTrans);
		Assertions.assertFalse(resultingTrans.isEmpty());
		Assertions.assertTrue(resultingTrans.size() == 1);
		
		Assertions.assertNotNull(resultingTrans.get(0).getPromoBonusAmount());
		Assertions.assertNotNull(resultingTrans.get(0).getPromoBonusAmount().get("Promo2"));
		Assertions.assertTrue(resultingTrans.get(0).getPromoBonusAmount().get("Promo2").equals(new BigDecimal(100.0)));
	}
	
	
	@Test
	public void demoTestMultiplier() throws ParseException {
		Transaction trans = new Transaction();
		trans.setTransactionDate(sdf.parse("2020-01-01"));
		trans.setTransactionId("T1234");
		trans.setCardType("C1");
		trans.setServiceEstablishment("SE1");
		trans.setTransactionAmount(new BigDecimal(500.0));

		

		List<Transaction> resultingTrans = droolsService.calculateBonus(getPromotions(), Arrays.asList(trans));

		Assertions.assertNotNull(resultingTrans);
		Assertions.assertFalse(resultingTrans.isEmpty());
		Assertions.assertTrue(resultingTrans.size() == 1);
		
		Assertions.assertNotNull(resultingTrans.get(0).getPromoBonusAmount());
		Assertions.assertNotNull(resultingTrans.get(0).getPromoBonusAmount().get("Promo1"));
		Assertions.assertTrue(resultingTrans.get(0).getPromoBonusAmount().get("Promo1").equals(new BigDecimal(10.0)));
	}
	
	@Test
	public void demoMultiTransaction() throws ParseException {
		Transaction trans1 = new Transaction();
		trans1.setTransactionDate(sdf.parse("2020-01-01"));
		trans1.setTransactionId("T1");
		trans1.setCardType("C1");
		trans1.setServiceEstablishment("SE1");
		trans1.setTransactionAmount(new BigDecimal(500.0));
		
		Transaction trans2 = new Transaction();
		trans2.setTransactionDate(sdf.parse("2020-01-01"));
		trans2.setTransactionId("T2");
		trans2.setCardType("C1");
		trans2.setServiceEstablishment("SE2");
		trans2.setTransactionAmount(new BigDecimal(500.0));

		

		List<Transaction> resultingTrans = droolsService.calculateBonus(getPromotions(), Arrays.asList(trans1, trans2));

		Assertions.assertNotNull(resultingTrans);
		Assertions.assertFalse(resultingTrans.isEmpty());
		Assertions.assertTrue(resultingTrans.size() == 2);
		
		System.out.println(resultingTrans);
		
		Optional<Transaction> resultTransOpt1 = resultingTrans.stream().filter(t -> t.getTransactionId().equals("T1")).findFirst();
		Optional<Transaction> resultTransOpt2 = resultingTrans.stream().filter(t -> t.getTransactionId().equals("T2")).findFirst();
		
		Assertions.assertTrue(resultTransOpt1.isPresent());
		Assertions.assertTrue(resultTransOpt2.isPresent());
		
		Assertions.assertNotNull(resultTransOpt1.get().getPromoBonusAmount());
		Assertions.assertNotNull(resultTransOpt1.get().getPromoBonusAmount().get("Promo1"));
		Assertions.assertTrue(resultTransOpt1.get().getPromoBonusAmount().get("Promo1").equals(new BigDecimal(10.0)));
		
		Assertions.assertNotNull(resultTransOpt2.get().getPromoBonusAmount());
		Assertions.assertNotNull(resultTransOpt2.get().getPromoBonusAmount().get("Promo2"));
		Assertions.assertTrue(resultTransOpt2.get().getPromoBonusAmount().get("Promo2").equals(new BigDecimal(100.0)));
	}
	
	
	private List<Promotion> getPromotions() throws ParseException {
		
		Promotion promo1 = new Promotion();
		promo1.setPromotionId("Promo1");
		promo1.setStartDate(sdf.parse("2019-12-31"));
		promo1.setEndDate(sdf.parse("2021-01-01"));
		promo1.setCardTypes(Arrays.asList("C1", "D1", "C2"));
		promo1.setServiceEstablishments(Arrays.asList("SE5", "SE4", "SE6", "SE1"));
		promo1.setMinAmount(new BigDecimal(467.0));
		promo1.setCalcType(CalculationType.MULTIPLIER);
		promo1.setMultiplier(new BigDecimal(0.02));
		
		
		Promotion promo2 = new Promotion();
		promo2.setPromotionId("Promo2");
		promo2.setStartDate(sdf.parse("2019-12-31"));
		promo2.setEndDate(sdf.parse("2021-01-01"));
		promo2.setCardTypes(Arrays.asList("C1", "D1", "C2"));
		promo2.setServiceEstablishments(Arrays.asList("SE5", "SE4", "SE6", "SE2"));
		promo2.setMinAmount(new BigDecimal(500.0));
		promo2.setCalcType(CalculationType.FIXED);
		promo2.setFixedAmount(new BigDecimal(100.0));
		
		return Arrays.asList(promo1, promo2);
	}

}
