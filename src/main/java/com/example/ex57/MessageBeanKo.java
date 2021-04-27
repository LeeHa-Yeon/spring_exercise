package com.example.ex57;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component("default")
public class MessageBeanKo implements MessageBean, InitializingBean, DisposableBean {
    public void sayHello(String name) {
    System.out.println("안녕하세요," + name);
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet()실행");
    }
    public void destroy() throws Exception {
        System.out.println("destroy()실행");
    }
}