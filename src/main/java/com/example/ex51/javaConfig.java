package com.example.ex51;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class javaConfig{

    @Bean
    public OperatorBean operatorBean(){
        OperatorBean op = new PlusOp();
        op.setOperand1(op1());
        op.setOperand2(op2());

        return op;
    }

    @Bean
    public Operand op1(){
        Operand operand = new Operand();
        operand.setValue(10);

        return operand;
    }

    @Bean
    public Operand op2(){
        Operand operand = new Operand();
        operand.setValue(20);

        return operand;
    }
}
