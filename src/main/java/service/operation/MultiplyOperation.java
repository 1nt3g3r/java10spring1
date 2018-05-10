package service.operation;

import org.springframework.stereotype.Service;

@Service("*")
public class MultiplyOperation implements MathOperation {
    public float calc(float a, float b) {
        return a * b;
    }
}
