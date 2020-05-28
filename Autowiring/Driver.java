package com.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
public static void main(String[] args)
{
    ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
    
    ApplicationConfig ac=(ApplicationConfig) ctx.getBean("applicationConfig");
    System.out.println(ac.emp.getEmpId());
	
}
	
}
