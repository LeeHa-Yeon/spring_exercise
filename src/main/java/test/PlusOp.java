package test;

import org.springframework.stereotype.Component;

@Component
public class PlusOp implements OperatorBean {

    Operand operand1;
    Operand operand2;

    public Operand getOperand1(){ return operand1; }
    public Operand getOperand2(){ return operand2; }

    public void setOperand1(Operand operand) {
        this.operand1 = operand;
    }
    public void setOperand2(Operand operand) {
        this.operand2 = operand;
    }
    public int calc(){
        return operand1.getValue() + operand2.getValue();
    }
}