package com.example.ex55;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("defaultOperator")
public class MinusOp implements OperatorBean {

    Operand operand1;
    Operand operand2;

    @Autowired
    public void setOperand1(Operand op1) { operand1 = op1;}
    @Autowired
    public void setOperand2(Operand op2) { operand2 = op2;}

    public int calc() { return operand1.getValue() - operand2.getValue(); }
}