package test;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Operand {

    int value;

    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }

}