package com.example.ex53;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class javaConfig{


    @Bean
    @Scope("prototype")
    public OperatorBean operatorBean(){
        return new MinusOp();
    }

    @Bean
    @Scope("prototype")
    public Operand op1(){
        Operand operand = new Operand();
        operand.setValue(10);

        return operand;
    }

    @Bean
    @Scope("prototype")
    public Operand op2(){
        Operand operand = new Operand();
        operand.setValue(20);

        return operand;
    }
}
