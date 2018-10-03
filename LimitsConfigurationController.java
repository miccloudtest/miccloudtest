package com.in28minutes.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.microservices.limitsservice.bean.LimitConfiguration;

@RestController
public class LimitsConfigurationController {
	@Autowired
	private Configuration config;
	@RequestMapping("limits")
	public LimitConfiguration retriveLimitFromCfg()
	{
		LimitConfiguration congiguration=new LimitConfiguration();
		congiguration.setMinimum(config.getMinimum());
		congiguration.setMaximum(config.getMaximum());;
		return congiguration;
	}
}
