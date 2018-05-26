package com.utdemo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:property-source.properties")
//@ConfigurationProperties("classpath:property-source.properties")
public class PropertySourceConfig {
	
	@Autowired
    private Environment env;
	
	
}
