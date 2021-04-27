package com.example.ex33;

public class MinusOp implements OperatorBean{
    int operand1;
    int operand2;
    public void setOperand1(int value) { operand1 = value;}
    public void setOperand2(int value) { operand2 = value;}

    public int calc() { return operand1 - operand2; }
}