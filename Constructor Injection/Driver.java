package com.spring.app;
import java.util.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.app.*;

public class Driver {
	
public static void main(String[] args)
{
    ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    //Customer ct=(Customer) context.getBean(Customer.class);
    MemberShip ms=(MemberShip) context.getBean(MemberShip.class);
    
	Scanner in=new Scanner(System.in);
	Customer c=ms.getCustomer();
	System.out.println("customer inputs are");
	c.setCustId(in.nextInt());
	c.setCustName(in.nextLine());
	c.setEmailId(in.nextLine());
	c.setContactNo(in.nextLong());
	//System.out.println(c.getCustId());
//	System.out.println(c.getCustName());
//	System.out.println(c.getEmailId());
//	System.out.println(c.getContactNo());
System.out.println("membership inputs are");
ms.setMembershipId(in.nextInt());
ms.setMembershipType(in.nextLine());
ms.setVisitsPerYear(in.nextInt());
System.out.println("outputs are:");
	System.out.println(ms.getMembershipId());
	System.out.println(ms.getMembershipType());
	System.out.println(ms.getVisitsPerYear());
	System.out.println(ms.getCustomer().getCustId());
	//System.out.println(ms.getVisitsPerYear());
	System.out.println(ms.getCustomer().getCustName());
	System.out.println(ms.getCustomer().getEmailId());
	

	
}

}
