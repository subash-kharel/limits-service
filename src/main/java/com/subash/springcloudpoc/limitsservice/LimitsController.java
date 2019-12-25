package com.subash.springcloudpoc.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public LimitsConfiguration retrieveConfig() {
		return new LimitsConfiguration(configuration.getMinimum(),configuration.getMaximum());
	}

}
