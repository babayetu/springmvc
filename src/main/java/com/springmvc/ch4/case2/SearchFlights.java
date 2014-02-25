package com.springmvc.ch4.case2;

import java.util.Date;

public class SearchFlights {
	private String departFrom;
	private String arriveAt;
	private Date beginOn;
	private Date endOn;
	/**
	 * @return the departFrom
	 */
	public String getDepartFrom() {
		return departFrom;
	}
	/**
	 * @param departFrom the departFrom to set
	 */
	public void setDepartFrom(String departFrom) {
		this.departFrom = departFrom;
	}
	/**
	 * @return the arriveAt
	 */
	public String getArriveAt() {
		return arriveAt;
	}
	/**
	 * @param arriveAt the arriveAt to set
	 */
	public void setArriveAt(String arriveAt) {
		this.arriveAt = arriveAt;
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