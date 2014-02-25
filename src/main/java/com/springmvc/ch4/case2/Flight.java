package com.springmvc.ch4.case2;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.util.Assert;

public class Flight {
	private List<FlightLeg> flightLegs;
	private BigDecimal totalCost;
	
	
	public Flight(List<FlightLeg> flightLegs, BigDecimal totalCost) {
		Assert.notNull(flightLegs);
		Assert.isTrue(flightLegs.size() >=1, "flight should have at least one flight leg");
		this.flightLegs = flightLegs;
		this.totalCost = totalCost;
	}
	
	public boolean isNonStop()
	{
		return flightLegs.size() == 1;
	}
	
	public FlightLeg getFirstLeg()
	{
		return flightLegs.get(0);
	}
	
	public FlightLeg getLastLeg()
	{
		return flightLegs.get(flightLegs.size()-1);
	}	
	
	public int getNumberOfLegs()
	{
		return flightLegs.size();
	}
	
	public long getTotalTravelTime()
	{
		Date start = getFirstLeg().getDepartOn();
		Date end = getLastLeg().getArriveOn();
		Assert.isTrue(start.before(end),"start date should be earlier than end date");
		return (end.getTime() - start.getTime());
	}
	
	/**
	 * @return the flightLegs
	 */
	public List<FlightLeg> getFlightLegs() {
		return flightLegs;
	}
	/**
	 * @param flightLegs the flightLegs to set
	 */
	public void setFlightLegs(List<FlightLeg> flightLegs) {
		this.flightLegs = flightLegs;
	}
	/**
	 * @return the totalCost
	 */
	public BigDecimal getTotalCost() {
		return totalCost;
	}
	/**
	 * @param totalCost the totalCost to set
	 */
	public void setTotalCost(BigDecimal totalCost) {
		this.totalCost = totalCost;
	}
	
	
}