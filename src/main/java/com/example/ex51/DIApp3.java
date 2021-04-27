package com.example.ex51;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class DIApp3 {
    public static void main(String[] args) {
        GenericApplicationContext ctx = new AnnotationConfigApplicationContext(javaConfig.class);
        OperatorBean operator = (OperatorBean)ctx.getBean("operatorBean");
        int value = operator.calc();
        System.out.println("The result value: " + value);
        ctx.close();
    }
}