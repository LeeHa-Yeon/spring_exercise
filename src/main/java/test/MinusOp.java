package test;


import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

@Component("defaultOperator")
public class MinusOp implements OperatorBean, InitializingBean, DisposableBean {

    Operand operand1;
    Operand operand2;

    public Operand getOperand1(){ return operand1; }
    public Operand getOperand2(){ return operand2; }

    @Autowired
    public void setOperand1(Operand op1) { operand1 = op1;}
    @Autowired
    public void setOperand2(Operand op2) { operand2 = op2;}

    public int calc() {
        System.out.println("calc()호출");
        return operand1.getValue() - operand2.getValue();
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("MinusOp.afterPropertiesSet() 실행");
    }

    public void destroy() throws Exception {
        System.out.println("MinusOp.destroy() 실행");
    }
}