package service.operation;

import org.springframework.stereotype.Service;

@Service("/")
public class DivideOperation implements MathOperation {
    public float calc(float a, float b) {
        return a / b;
    }
}