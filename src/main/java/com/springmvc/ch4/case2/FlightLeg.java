package com.springmvc.ch4.case2;

import java.util.Date;

import com.springmvc.ch4.case1.Airport;

public class FlightLeg {
	private Airport departFrom;
	private Airport arriveAt;
	private Date departOn;
	private Date arriveOn;
	
	
	public FlightLeg(Airport departFrom, Airport arriveAt, Date departOn,
			Date arriveOn) {
		this.departFrom = departFrom;
		this.arriveAt = arriveAt;
		this.departOn = departOn;
		this.arriveOn = arriveOn;
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
	 * @return the departOn
	 */
	public Date getDepartOn() {
		return departOn;
	}
	/**
	 * @param departOn the departOn to set
	 */
	public void setDepartOn(Date departOn) {
		this.departOn = departOn;
	}
	/**
	 * @return the arriveOn
	 */
	public Date getArriveOn() {
		return arriveOn;
	}
	/**
	 * @param arriveOn the arriveOn to set
	 */
	public void setArriveOn(Date arriveOn) {
		this.arriveOn = arriveOn;
	}
	
	
}