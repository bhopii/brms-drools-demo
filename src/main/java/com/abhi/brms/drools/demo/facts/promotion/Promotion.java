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
	
	/** The min amount. */
	private BigDecimal minAmount;
	
	/** The calc type. */
	private CalculationType calcType;
	
	/** The fixed amount. */
	private BigDecimal fixedAmount;
	
	/** The multiplier. */
	private BigDecimal multiplier;
	
	/** The fulfillment type. */
	private FulFillmentType fulfillmentType;
	


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
	public CalculationType getCalcType() {
		return calcType;
	}

	/**
	 * Sets the calc type.
	 *
	 * @param calcType the new calc type
	 */
	public void setCalcType(CalculationType calcType) {
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((calcType == null) ? 0 : calcType.hashCode());
		result = prime * result + ((cardTypes == null) ? 0 : cardTypes.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + ((fixedAmount == null) ? 0 : fixedAmount.hashCode());
		result = prime * result + ((fulfillmentType == null) ? 0 : fulfillmentType.hashCode());
		result = prime * result + ((minAmount == null) ? 0 : minAmount.hashCode());
		result = prime * result + ((multiplier == null) ? 0 : multiplier.hashCode());
		result = prime * result + ((promotionId == null) ? 0 : promotionId.hashCode());
		result = prime * result + ((serviceEstablishments == null) ? 0 : serviceEstablishments.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Promotion other = (Promotion) obj;
		if (calcType != other.calcType)
			return false;
		if (cardTypes == null) {
			if (other.cardTypes != null)
				return false;
		} else if (!cardTypes.equals(other.cardTypes))
			return false;
		if (endDate == null) {
			if (other.endDate != null)
				return false;
		} else if (!endDate.equals(other.endDate))
			return false;
		if (fixedAmount == null) {
			if (other.fixedAmount != null)
				return false;
		} else if (!fixedAmount.equals(other.fixedAmount))
			return false;
		if (fulfillmentType != other.fulfillmentType)
			return false;
		if (minAmount == null) {
			if (other.minAmount != null)
				return false;
		} else if (!minAmount.equals(other.minAmount))
			return false;
		if (multiplier == null) {
			if (other.multiplier != null)
				return false;
		} else if (!multiplier.equals(other.multiplier))
			return false;
		if (promotionId == null) {
			if (other.promotionId != null)
				return false;
		} else if (!promotionId.equals(other.promotionId))
			return false;
		if (serviceEstablishments == null) {
			if (other.serviceEstablishments != null)
				return false;
		} else if (!serviceEstablishments.equals(other.serviceEstablishments))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		return true;
	}

	
}
