package com.abhi.brms.drools.demo.facts.execution;

/**
 * The Class TranEligibility.
 */
public class TransEligibility {

	/** The promotion id. */
	private String promotionId;

	/** The transaction id. */
	private String transactionId;

	/** The start date rule. */
	private ConditionStatus startDateRule;

	/** The end date rule. */
	private ConditionStatus endDateRule;

	/** The card type rule. */
	private ConditionStatus cardTypeRule;

	/** The se rule. */
	private ConditionStatus seRule;

	/** The min threshold rule. */
	private ConditionStatus minThresholdRule;

	public TransEligibility() {
		super();
		this.startDateRule = new ConditionStatus();
		this.endDateRule = new ConditionStatus();
		this.cardTypeRule = new ConditionStatus();
		this.seRule = new ConditionStatus();
		this.minThresholdRule = new ConditionStatus();

	}

	public TransEligibility(String promotionId, String transactionId) {
		super();
		this.promotionId = promotionId;
		this.transactionId = transactionId;
		this.startDateRule = new ConditionStatus();
		this.endDateRule = new ConditionStatus();
		this.cardTypeRule = new ConditionStatus();
		this.seRule = new ConditionStatus();
		this.minThresholdRule = new ConditionStatus();
	}

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
	 * Gets the transaction id.
	 *
	 * @return the transaction id
	 */
	public String getTransactionId() {
		return transactionId;
	}

	/**
	 * Sets the transaction id.
	 *
	 * @param transactionId the new transaction id
	 */
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	/**
	 * Gets the start date rule.
	 *
	 * @return the start date rule
	 */
	public ConditionStatus getStartDateRule() {
		return startDateRule;
	}

	/**
	 * Sets the start date rule.
	 *
	 * @param startDateRule the new start date rule
	 */
	public void setStartDateRule(ConditionStatus startDateRule) {
		this.startDateRule = startDateRule;
	}

	/**
	 * Gets the end date rule.
	 *
	 * @return the end date rule
	 */
	public ConditionStatus getEndDateRule() {
		return endDateRule;
	}

	/**
	 * Sets the end date rule.
	 *
	 * @param endDateRule the new end date rule
	 */
	public void setEndDateRule(ConditionStatus endDateRule) {
		this.endDateRule = endDateRule;
	}

	/**
	 * Gets the card type rule.
	 *
	 * @return the card type rule
	 */
	public ConditionStatus getCardTypeRule() {
		return cardTypeRule;
	}

	/**
	 * Sets the card type rule.
	 *
	 * @param cardTypeRule the new card type rule
	 */
	public void setCardTypeRule(ConditionStatus cardTypeRule) {
		this.cardTypeRule = cardTypeRule;
	}

	/**
	 * Gets the se rule.
	 *
	 * @return the se rule
	 */
	public ConditionStatus getSeRule() {
		return seRule;
	}

	/**
	 * Sets the se rule.
	 *
	 * @param seRule the new se rule
	 */
	public void setSeRule(ConditionStatus seRule) {
		this.seRule = seRule;
	}

	/**
	 * Gets the min threshold rule.
	 *
	 * @return the min threshold rule
	 */
	public ConditionStatus getMinThresholdRule() {
		return minThresholdRule;
	}

	/**
	 * Sets the min threshold rule.
	 *
	 * @param minThresholdRule the new min threshold rule
	 */
	public void setMinThresholdRule(ConditionStatus minThresholdRule) {
		this.minThresholdRule = minThresholdRule;
	}

	@Override
	public String toString() {
		return "TransEligibility [promotionId=" + promotionId + ", transactionId=" + transactionId + ", startDateRule="
				+ startDateRule + ", endDateRule=" + endDateRule + ", cardTypeRule=" + cardTypeRule + ", seRule="
				+ seRule + ", minThresholdRule=" + minThresholdRule + "]";
	}



}
