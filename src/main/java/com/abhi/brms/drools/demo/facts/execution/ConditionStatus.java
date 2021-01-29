package com.abhi.brms.drools.demo.facts.execution;

/**
 * The Class ConditionStatus.
 */
public class ConditionStatus {

	/** The checked. */
	private boolean checked = false;
	
	/** The passed. */
	private boolean passed = true;

	/**
	 * Checks if is checked.
	 *
	 * @return true, if is checked
	 */
	public boolean isChecked() {
		return checked;
	}

	/**
	 * Sets the checked.
	 *
	 * @param checked the new checked
	 */
	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	/**
	 * Checks if is passed.
	 *
	 * @return true, if is passed
	 */
	public boolean isPassed() {
		return passed;
	}

	/**
	 * Sets the passed.
	 *
	 * @param passed the new passed
	 */
	public void setPassed(boolean passed) {
		this.passed = passed;
	}

	@Override
	public String toString() {
		return "ConditionStatus [checked=" + checked + ", passed=" + passed + "]";
	}

}
