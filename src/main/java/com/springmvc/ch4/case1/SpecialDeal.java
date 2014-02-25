package com.springmvc.ch4.case1;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.util.Assert;


public class SpecialDeal {
	private Airport departFrom;
	private Airport arriveAt;
	private BigDecimal cost;
	private Date beginOn;
	private Date endOn;
	
	
	public SpecialDeal(Airport departFrom, Airport arriveAt, BigDecimal cost,
			Date beginOn, Date endOn) {
		this.departFrom = departFrom;
		this.arriveAt = arriveAt;
		this.cost = cost;
		this.beginOn = beginOn;
		this.endOn = endOn;
	}
	
	public boolean isValidNow()
	{
		return isValid(new Date());
	}
	
	public boolean isValid(Date aDate) {
		Assert.notNull(aDate);		
		Date backupDate = new Date(aDate.getTime());
		return (backupDate.equals(beginOn) || backupDate.after(beginOn)) && 
				(backupDate.equals(endOn) || backupDate.before(endOn));
	}
	
	/**
	 * @return the departFrom
	 */
	public Airport getDepartFrom() {
		return departFrom;
	}
	/**
	 * @param departFrom the departFrom to set
	 */
	public void setDepartFrom(Airport departFrom) {
		this.departFrom = departFrom;
	}
	/**
	 * @return the arriveAt
	 */
	public Airport getArriveAt() {
		return arriveAt;
	}
	/**
	 * @param arriveAt the arriveAt to set
	 */
	public void setArriveAt(Airport arriveAt) {
		this.arriveAt = arriveAt;
	}
	/**
	 * @return the cost
	 */
	public BigDecimal getCost() {
		return cost;
	}
	/**
	 * @param cost the cost to set
	 */
	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}
	/**
	 * @return the beginOn
	 */
	public Date getBeginOn() {
		return beginOn;
	}
	/**
	 * @param beginOn the beginOn to set
	 */
	public void setBeginOn(Date beginOn) {
		this.beginOn = beginOn;
	}
	/**
	 * @return the endOn
	 */
	public Date getEndOn() {
		return endOn;
	}
	/**
	 * @param endOn the endOn to set
	 */
	public void setEndOn(Date endOn) {
		this.endOn = endOn;
	}
	
	
}