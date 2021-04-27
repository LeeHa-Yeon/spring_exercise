package com.example.ex58;


public class MessageBeanKo implements MessageBean{
    public void sayHello(String name) {
    System.out.println("안녕하세요," + name);
    }

    private void initialize() {
        System.out.println("initMessage()실행");
    }

    private void close() {
        System.out.println("finishMessage()실행");
    }
}