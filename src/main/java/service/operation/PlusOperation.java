package service.operation;

import org.springframework.stereotype.Service;

@Service("+")
public class PlusOperation implements MathOperation {
    public float calc(float a, float b) {
        return a + b;
    }
}
