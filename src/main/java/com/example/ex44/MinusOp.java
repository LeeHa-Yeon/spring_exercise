package com.example.ex44;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

public class MinusOp implements OperatorBean {

    @Resource(name = "op3")
    Operand operand1;

    @Resource(name = "op4")
    Operand operand2;


    public void setOperand1(Operand value) { operand1 = value;}
    public void setOperand2(Operand value) { operand2 = value;}

    public int calc() { return operand1.getValue() - operand2.getValue(); }
}