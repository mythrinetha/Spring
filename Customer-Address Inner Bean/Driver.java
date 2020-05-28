package com.spring.ui;

import com.spring.app.*;
import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	
	
	public static AddressBook loadAddressBook()
	{
	    ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
        AddressBook ad=(AddressBook)context.getBean("AB");
		return ad;
	}
	
	public static void main(String[] args)
	{
		//invoke the loadAddressBook() method from main retrieve the AddressBook object, get the details from the user set the values and display the values
        AddressBook ab=loadAddressBook();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the temporary address");
        System.out.println("Enter the house name");
        ab.getTempAddress().setHouseName(sc.nextLine());
        System.out.println("Enter the street");
        ab.getTempAddress().setStreet(sc.nextLine());
        System.out.println("Enter the city");
        ab.getTempAddress().setCity(sc.nextLine());
        System.out.println("Enter the state");
        ab.getTempAddress().setState(sc.nextLine());
        System.out.println("Enter the phone number");
        ab.setPhoneNumber(sc.nextLine());
        
        System.out.println("Temporary address");
        System.out.println("House name:"+ab.getTempAddress().getHouseName());
        System.out.println("Street:"+ab.getTempAddress().getStreet());
        System.out.println("City:"+ab.getTempAddress().getCity());
        System.out.println("State:"+ab.getTempAddress().getState());
        System.out.println("Phone number :"+ab.getPhoneNumber());
	}

}
