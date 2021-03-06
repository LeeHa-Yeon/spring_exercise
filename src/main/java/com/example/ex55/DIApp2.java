package com.example.ex55;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DIApp2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
        OperatorBean operator1 = (OperatorBean) ctx.getBean("defaultOperator");
        OperatorBean operator2 = (OperatorBean) ctx.getBean("defaultOperator");
        System.out.println("The result is "+ operator1.calc());
        System.out.println("op1:"+operator1+", op2:"+operator2);
        ctx.close();
    }
}
