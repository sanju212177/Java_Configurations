package com.capg.payment;

//import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

//@Aspect
@Component
public class TxMgtAspect {
    //@Before("execution(* PaymentServiceImpl.*(..))")
    public void beforeTx(){
        System.out.println("...Before Tx Code Applied...");
    }



    //@After("execution(* PaymentServiceImpl.doPayment())")
    public void afterTx(){
        System.out.println("...After Tx Code Applied...");
    }
}
