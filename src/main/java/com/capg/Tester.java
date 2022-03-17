package com.capg;
import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {
    public static void main(String[] args){
        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");
        Doctor doc = container.getBean(Doctor.class);

        /*System.out.println("Doctor Name: "+doc.getDocName()) ;
        System.out.println("Doctor's Id: "+doc.getDocId());
        System.out.println("Doctor's Patient Details: "+doc.getPatient()) ;*/

    }
}
