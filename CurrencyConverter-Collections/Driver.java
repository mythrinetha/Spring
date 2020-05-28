package com.spring.app;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Scanner;

public class Driver {
	
public static void main(String[] args)
{
    Scanner sc =  new Scanner(System.in);
	ApplicationContext apc=new ClassPathXmlApplicationContext("beans.xml");
    CurrencyConverter cc=(CurrencyConverter)apc.getBean("currency");
    String val = sc.nextLine();
    System.out.println(cc.getTotalCurrencyValue(val));
	
}

}
