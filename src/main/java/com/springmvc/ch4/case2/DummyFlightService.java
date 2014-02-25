package com.springmvc.ch4.case2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.springmvc.ch4.case1.Airport;
import com.springmvc.ch4.case1.SpecialDeal;

public class DummyFlightService implements FlightService {
	List<Flight> mFlightSample;
	List<SpecialDeal> mSpecial;

	public DummyFlightService() {
		super();
		Airport shanghai = new Airport("shanghai", "021");
		Airport beijing = new Airport("beijing", "010");
		Airport nanjin = new Airport("nanjin", "020");
		Calendar cal=Calendar.getInstance();
		cal.set(Calendar.YEAR,2014);
		cal.set(Calendar.MONTH,0);  // Jan
		cal.set(Calendar.DAY_OF_MONTH, 0);  // 1st		
		Date d1 = cal.getTime();

		cal.set(Calendar.DAY_OF_MONTH, 1);  // 2nd
		Date d2 = cal.getTime();
		
		cal.set(Calendar.DAY_OF_MONTH, 2);  // 3rd
		Date d3 = cal.getTime();
		
		FlightLeg fl1 = new FlightLeg(shanghai, nanjin, d1, d2);
		FlightLeg fl2 = new FlightLeg(nanjin, beijing, d2, d3);
		ArrayList<FlightLeg> afl = new ArrayList<FlightLeg>();
		afl.add(fl1);
		afl.add(fl2);
		Flight f1 = new Flight(afl, new BigDecimal(4000));
		
		mFlightSample = new ArrayList<Flight>();
		mFlightSample.add(f1);
		
		SpecialDeal sd = new SpecialDeal(nanjin, beijing, new BigDecimal(2000), d2, d3);
		mSpecial = new ArrayList<SpecialDeal>();
		mSpecial.add(sd);		
	}

	@Override
	public List<Flight> findFlightInfo(SearchFlights search) {
		return mFlightSample;
	}

	@Override
	public List<SpecialDeal> findSpecialDeals() {
		return mSpecial;
	}
	
}