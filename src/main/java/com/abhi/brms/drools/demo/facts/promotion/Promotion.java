package com.abhi.brms.drools.demo.facts.promotion;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * The Class Promotion.
 */
public class Promotion {

	/** The promotion id. */
	private String promotionId;

	/** The card types. */
	private List<String> cardTypes;
	
	/** The start date. */
	private Date startDate;
	
	/** The end date. */
	private Date endDate;
	
	/** The service establishments. */
	private List<String> serviceEstablishments;
	
	/** The calc type. */
	private String calcType;
	
	/** The fixed amount. */
	private BigDecimal fixedAmount;
	
	/** The multiplier. */
	private BigDecimal multiplier;
	
	/** The fulfillment type. */
	private FulFillmentType fulfillmentType;
	
	/** The min amount. */
	private BigDecimal minAmount;

	/**
	 * Gets the promotion id.
	 *
	 * @return the promotion id
	 */
	public String getPromotionId() {
		return promotionId;
	}

	/**
	 * Sets the promotion id.
	 *
	 * @param promotionId the new promotion id
	 */
	public void setPromotionId(String promotionId) {
		this.promotionId = promotionId;
	}

	/**
	 * Gets the card types.
	 *
	 * @return the card types
	 */
	public List<String> getCardTypes() {
		return cardTypes;
	}

	/**
	 * Sets the card types.
	 *
	 * @param cardTypes the new card types
	 */
	public void setCardTypes(List<String> cardTypes) {
		this.cardTypes = cardTypes;
	}

	/**
	 * Gets the start date.
	 *
	 * @return the start date
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * Sets the start date.
	 *
	 * @param startDate the new start date
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * Gets the end date.
	 *
	 * @return the end date
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * Sets the end date.
	 *
	 * @param endDate the new end date
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * Gets the service establishments.
	 *
	 * @return the service establishments
	 */
	public List<String> getServiceEstablishments() {
		return serviceEstablishments;
	}

	/**
	 * Sets the service establishments.
	 *
	 * @param serviceEstablishments the new service establishments
	 */
	public void setServiceEstablishments(List<String> serviceEstablishments) {
		this.serviceEstablishments = serviceEstablishments;
	}

	/**
	 * Gets the calc type.
	 *
	 * @return the calc type
	 */
	public String getCalcType() {
		return calcType;
	}

	/**
	 * Sets the calc type.
	 *
	 * @param calcType the new calc type
	 */
	public void setCalcType(String calcType) {
		this.calcType = calcType;
	}

	/**
	 * Gets the fixed amount.
	 *
	 * @return the fixed amount
	 */
	public BigDecimal getFixedAmount() {
		return fixedAmount;
	}

	/**
	 * Sets the fixed amount.
	 *
	 * @param fixedAmount the new fixed amount
	 */
	public void setFixedAmount(BigDecimal fixedAmount) {
		this.fixedAmount = fixedAmount;
	}

	/**
	 * Gets the multiplier.
	 *
	 * @return the multiplier
	 */
	public BigDecimal getMultiplier() {
		return multiplier;
	}

	/**
	 * Sets the multiplier.
	 *
	 * @param multiplier the new multiplier
	 */
	public void setMultiplier(BigDecimal multiplier) {
		this.multiplier = multiplier;
	}

	/**
	 * Gets the fulfillment type.
	 *
	 * @return the fulfillment type
	 */
	public FulFillmentType getFulfillmentType() {
		return fulfillmentType;
	}

	/**
	 * Sets the fulfillment type.
	 *
	 * @param fulfillmentType the new fulfillment type
	 */
	public void setFulfillmentType(FulFillmentType fulfillmentType) {
		this.fulfillmentType = fulfillmentType;
	}

	/**
	 * Gets the min amount.
	 *
	 * @return the min amount
	 */
	public BigDecimal getMinAmount() {
		return minAmount;
	}

	/**
	 * Sets the min amount.
	 *
	 * @param minAmount the new min amount
	 */
	public void setMinAmount(BigDecimal minAmount) {
		this.minAmount = minAmount;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Promotion [promotionId=" + promotionId + ", cardTypes=" + cardTypes + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", serviceEstablishments=" + serviceEstablishments + ", calcType=" + calcType
				+ ", fixedAmount=" + fixedAmount + ", multiplier=" + multiplier + ", fulfillmentType=" + fulfillmentType
				+ ", minAmount=" + minAmount + "]";
	}

	
}
