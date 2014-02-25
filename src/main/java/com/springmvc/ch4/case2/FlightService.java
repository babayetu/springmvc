package com.springmvc.ch4.case2;

import java.util.List;

import com.springmvc.ch4.case1.SpecialDeal;

public interface FlightService {
	List<Flight>   findFlightInfo(SearchFlights search);
	List<SpecialDeal>   findSpecialDeals();
}