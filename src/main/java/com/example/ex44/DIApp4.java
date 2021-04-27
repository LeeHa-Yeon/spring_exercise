package com.example.ex44;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DIApp4 {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new
                GenericXmlApplicationContext("classpath*:applicationContext.xml");
        OperatorBean operator = (OperatorBean)ctx.getBean("operatorBean3");
        int value = operator.calc();
        System.out.println("The result value: " + value);
        ctx.close();
    }
}