package com.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.springmvc.ch4.case2.FlightService;

public class HomeController extends AbstractController {
	private static final int FIVE_MINUTES = 5 * 60;
	private FlightService flightService;
	
	public HomeController() {
		setSupportedMethods(new String[]{METHOD_GET});
		// this cache is for customer's browser, not GET server again for new content
		setCacheSeconds(FIVE_MINUTES);
	}

	/**
	 * @return the flightService
	 */
	public FlightService getFlightService() {
		return flightService;
	}

	/**
	 * @param flightService the flightService to set
	 */
	public void setFlightService(FlightService flightService) {
		this.flightService = flightService;
	}

	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.mvc.AbstractController#handleRequestInternal(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView("home");
		mav.addObject("specials", flightService.findSpecialDeals());
		return mav;
	}
	
}