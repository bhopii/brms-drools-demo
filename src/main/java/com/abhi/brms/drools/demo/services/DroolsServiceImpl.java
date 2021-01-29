package com.abhi.brms.drools.demo.services;

import java.util.List;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhi.brms.drools.demo.facts.promotion.Promotion;
import com.abhi.brms.drools.demo.facts.transaction.Transaction;

@Service
public class DroolsServiceImpl implements DroolsService {

	@Autowired
	private KieContainer kieContainer;

	@Override
	public List<Transaction> calculateBonus(List<Promotion> promotions, List<Transaction> transactions) {
		KieSession kieSession = kieContainer.newKieSession();
		promotions.stream().forEach(promotion -> {
			kieSession.insert(promotion);
		});
		transactions.stream().forEach(transaction -> {
			kieSession.insert(transaction);
		});
		
		kieSession.fireAllRules();
		kieSession.dispose();
		return transactions;
//		return null;
	}

}
