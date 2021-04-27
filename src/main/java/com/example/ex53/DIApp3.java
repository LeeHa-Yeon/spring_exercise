package com.example.ex53;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class DIApp3 {
    public static void main(String[] args) {
        GenericApplicationContext ctx = new AnnotationConfigApplicationContext(javaConfig.class);
        OperatorBean operator1 = (OperatorBean)ctx.getBean("operatorBean");
        OperatorBean operator2 = (OperatorBean)ctx.getBean("operatorBean");
        System.out.println("operator1 : " + operator1 +",operator2 : "+ operator2 );
        int value = operator1.calc();
        System.out.println("The result value: " + value);
        ctx.close();
    }
}