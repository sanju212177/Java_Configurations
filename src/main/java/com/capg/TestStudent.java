package com.capg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {
    public static void main(String[] args){
        ApplicationContext container = new ClassPathXmlApplicationContext("student.xml");
        Student s1 = container.getBean("std", Student.class);
        System.out.println(s1);
    }
}
