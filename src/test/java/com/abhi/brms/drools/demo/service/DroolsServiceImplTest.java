package com.abhi.brms.drools.demo.service;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.abhi.brms.drools.demo.configuration.RulesConfiguration;
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
	public void demoTest() throws ParseException {
		Transaction trans = new Transaction();
		trans.setTransactionDate(sdf.parse("2020-01-01"));

		Promotion promo1 = new Promotion();
		promo1.setStartDate(sdf.parse("2019-12-31"));

		List<Promotion> promotions = Arrays.asList(promo1);

		Transaction resultingTrans = droolsService.calculateBonus(promotions, trans);

		Assertions.assertNotNull(resultingTrans);
		Assertions.assertTrue(resultingTrans.getBonusAmount().equals(new BigDecimal(100.0)));
	}
	


}
