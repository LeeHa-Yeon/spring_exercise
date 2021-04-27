package com.example.ex43;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DIApp3 {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new
                GenericXmlApplicationContext("classpath*:applicationContext.xml");
        OperatorBean operator = (OperatorBean)ctx.getBean("operatorBean2");
        int value = operator.calc();
        System.out.println("The result value: " + value);
        ctx.close();
    }
}