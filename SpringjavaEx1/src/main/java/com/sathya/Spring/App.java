package com.sathya.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	//Start the IoC container
       ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
       
       //get the bean
      Person person= context.getBean("person1", Person.class);
      person.personInfo();
       
    }
}
