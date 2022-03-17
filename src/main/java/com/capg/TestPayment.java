package com.capg;

import com.capg.email.AppConfig;
import com.capg.payment.Payconfig;
import com.capg.payment.PaymentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestPayment {
    public static void main(String[] args){
        ApplicationContext container = new AnnotationConfigApplicationContext(Payconfig.class);
        PaymentService pay = (PaymentService)container.getBean("paymentService");
        pay.doPayment();
    }
}
