package com.example.ex52;


public class MinusOp implements OperatorBean {
    Operand operand1;
    Operand operand2;

    public Operand getOperand1(){ return operand1; }
    public Operand getOperand2(){ return operand2; }

    public void setOperand1(Operand value) { operand1 = value;}
    public void setOperand2(Operand value) { operand2 = value;}

    public int calc() { return operand1.getValue() - operand2.getValue(); }
}