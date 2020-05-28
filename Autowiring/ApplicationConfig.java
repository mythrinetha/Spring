package com.spring.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = "com.spring.app")
public class ApplicationConfig {
	@Autowired
    public Employee emp;
	@Autowired
    public Passport pass;
}
