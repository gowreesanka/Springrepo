package com.sathya.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	//Start the container
        ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
        
        System.out.println("******");
        //get the bean
        GreetingImpl greetingImpl=context.getBean("greet", GreetingImpl.class);
        greetingImpl.greet();
        
       
        
        
    }
}
