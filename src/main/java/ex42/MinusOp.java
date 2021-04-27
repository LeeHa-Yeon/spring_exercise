package ex42;


import org.springframework.beans.factory.annotation.Autowired;

public class MinusOp implements OperatorBean {
    Operand operand1;
    Operand operand2;

    @Autowired
    public void setOperand1(Operand value) { operand1 = value;}

    @Autowired
    public void setOperand2(Operand value) { operand2 = value;}

    public int calc() { return operand1.getValue() - operand2.getValue(); }
}