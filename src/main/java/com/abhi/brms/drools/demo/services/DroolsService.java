package com.abhi.brms.drools.demo.services;

import java.util.List;

import com.abhi.brms.drools.demo.facts.promotion.Promotion;
import com.abhi.brms.drools.demo.facts.transaction.Transaction;

public interface DroolsService {
	
	Transaction calculateBonus(List<Promotion> promotions, Transaction transaction);
}
