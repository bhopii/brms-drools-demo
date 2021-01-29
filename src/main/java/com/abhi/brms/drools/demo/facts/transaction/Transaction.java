package com.abhi.brms.drools.demo.facts.transaction;

import java.math.BigDecimal;
import java.util.Date;

/**
 * The Class Transaction.
 */
public class Transaction {
	
	/** The transaction amount. */
	private BigDecimal transactionAmount;
	
	/** The card type. */
	private String cardType;
	
	/** The service establishment. */
	private String serviceEstablishment;

	/** The transaction date. */
	private Date transactionDate;
	
	private BigDecimal bonusAmount;

	/**
	 * Gets the transaction amount.
	 *
	 * @return the transaction amount
	 */
	public BigDecimal getTransactionAmount() {
		return transactionAmount;
	}

	/**
	 * Sets the transaction amount.
	 *
	 * @param transactionAmount the new transaction amount
	 */
	public void setTransactionAmount(BigDecimal transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	/**
	 * Gets the card type.
	 *
	 * @return the card type
	 */
	public String getCardType() {
		return cardType;
	}

	/**
	 * Sets the card type.
	 *
	 * @param cardType the new card type
	 */
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	/**
	 * Gets the service establishment.
	 *
	 * @return the service establishment
	 */
	public String getServiceEstablishment() {
		return serviceEstablishment;
	}

	/**
	 * Sets the service establishment.
	 *
	 * @param serviceEstablishment the new service establishment
	 */
	public void setServiceEstablishment(String serviceEstablishment) {
		this.serviceEstablishment = serviceEstablishment;
	}

	/**
	 * Gets the transaction date.
	 *
	 * @return the transaction date
	 */
	public Date getTransactionDate() {
		return transactionDate;
	}

	/**
	 * Sets the transaction date.
	 *
	 * @param transactionDate the new transaction date
	 */
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public BigDecimal getBonusAmount() {
		return bonusAmount;
	}

	public void setBonusAmount(BigDecimal bonusAmount) {
		this.bonusAmount = bonusAmount;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Transaction [transactionAmount=" + transactionAmount + ", cardType=" + cardType
				+ ", serviceEstablishment=" + serviceEstablishment + ", transactionDate=" + transactionDate + "]";
	}

}
