package com.in28minutes.microservices.limitsservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.microservices.limitsservice.beans.LimitConfiguration;
import com.in28minutes.microservices.limitsservice.configuration.LimitsConfiguration;

@RestController
public class LimitsConfigurationController {

	@Autowired
	private LimitsConfiguration limitsConfiguration;
	
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfiguration() {
		return new LimitConfiguration(limitsConfiguration.getMaximum(), limitsConfiguration.getMinimum());
	}
}
