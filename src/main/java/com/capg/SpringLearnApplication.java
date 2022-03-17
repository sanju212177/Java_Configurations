package com.capg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SpringLearnApplication {
    public static void main(String[] args){
        //displayDate();
        displayCountry();
    }

    public static void displayCountry(){
        ApplicationContext container = new ClassPathXmlApplicationContext("country.xml");
        Country c = container.getBean("beanId", Country.class);
        System.out.println(c);
        System.out.println("Name:"+c.getName());
        System.out.println("Code:"+c.getCode());
    }

    public static void displayDate(){
        ApplicationContext container = new ClassPathXmlApplicationContext("date-format.xml");
        SimpleDateFormat format = container.getBean("dateFormat", SimpleDateFormat.class);
        Date date = new Date("2022/12/31");
        System.out.println(format.format(date));
    }
}
