package com.example.ex57;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public interface MessageBean { void sayHello(String name); }

