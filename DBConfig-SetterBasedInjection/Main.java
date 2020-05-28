package com.app.driver;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.app.*;
//import org.springframework.beans.factory.BeanFactory;  
//import org.springframework.beans.factory.xml.XmlBeanFactory;  
//import org.springframework.core.io.*;  

 
public class Main {
 
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	    ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
	   
        //Resource r=new ClassPathResource("beans.xml");  
        //BeanFactory factory=new XmlBeanFactory(r);  
         EmployeeDAO edao=(EmployeeDAO) context.getBean(EmployeeDAO.class);;
	   //DBConfig dbc=(DBConfig) vontext.getBean(DBConfig.class);
	    System.out.println(edao.getDbConfig().getDriverName());
	    System.out.println(edao.getDbConfig().getUrl());
	    System.out.println(edao.getDbConfig().getUserName());
	    System.out.println(edao.getDbConfig().getPassword());
	    //System.out.println(edao.getDbConfig().getDriverName());
	    
 
 
 
		
	}
}
