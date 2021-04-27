package com.example.ex58;

import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloApp {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath*:applicationContext.xml");
        MessageBean bean = (MessageBean)ctx.getBean("messageBean2");
        bean.sayHello("spring");
        ctx.close();
    }
}
