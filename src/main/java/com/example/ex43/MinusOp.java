package com.example.ex43;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MinusOp implements OperatorBean {

    @Autowired
    @Qualifier("value10")
    Operand operand1;

    @Autowired
    @Qualifier("value20")
    Operand operand2;


    public void setOperand1(Operand value) { operand1 = value;}
    public void setOperand2(Operand value) { operand2 = value;}

    public int calc() { return operand1.getValue() - operand2.getValue(); }
}