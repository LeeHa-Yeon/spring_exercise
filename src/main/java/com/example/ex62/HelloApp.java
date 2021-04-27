package com.example.ex62;

import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloApp {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath*:appctx.xml");
        MessageBean msgBean = (MessageBean)ctx.getBean("proxy");
        msgBean.sayHello();
        ctx.close();
    }
}

