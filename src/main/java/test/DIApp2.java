package test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DIApp2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
        OperatorBean operator1 = (OperatorBean) ctx.getBean("defaultOperator");
        // OperatorBean operator2 = (OperatorBean) ctx.getBean("defaultOperator");

        operator1.getOperand1().setValue(10);
        operator1.getOperand2().setValue(20);
        int value = operator1.calc();
        System.out.println("The result is "+ value);

        ctx.close();
    }
}
