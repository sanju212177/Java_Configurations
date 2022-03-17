package com.capg.payment;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class Payconfig {
    @Bean
    public PaymentService paymentService(){
        return new PaymentServiceImpl();
    }
    @Bean
    public TxMgtAspect logAspect(){
        return new TxMgtAspect();
    }
}
