package com.excelr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        // IOC Starts here
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        // calling 1sttime car getbean
        Car c1 = context.getBean("car1", Car.class);
        System.out.println(c1.hashCode());
        
        
        // calling 2ndtime car getbean
        Car c2 = context.getBean("car1", Car.class);
        System.out.println(c2.hashCode());
        
        
        
        
        System.out.println("======================================================");
        
        
        // calling 1sttime Motor getbean
        
        Motor m1 = context.getBean("motor1", Motor.class);
        System.out.println(m1.hashCode());
        
        
        // calling 2ndtime Motor getbean
        
        Motor m2 = context.getBean("motor1", Motor.class);
        System.out.println(m2.hashCode());
        
        System.out.println("bye bue");
       
    }
}
