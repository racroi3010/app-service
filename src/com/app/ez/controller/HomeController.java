package com.app.ez.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.ez.service.HomeService;

@Controller
public class HomeController {
	private Logger mLogger = LoggerFactory.getLogger(HomeController.class);
	private HomeService mService;
	
	@Autowired
	public HomeController(HomeService mService) {
		super();
		this.mService = mService;
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index(){
		mLogger.debug("Index page is executed");
		return "index";
	}
}
