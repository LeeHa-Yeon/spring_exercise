package com.example.ex57;

import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloApp {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new
                GenericXmlApplicationContext("classpath*:applicationContext.xml");
        MessageBean bean = (MessageBean)ctx.getBean("messageBean");
        bean.sayHello("Mr.kim");
        ctx.close();
    }
}
