package service;

import org.springframework.stereotype.Service;

@Service
public class ParseService {
    private float a, b;
    private String operation;

    public void parse(String expression) {
        String divider = "";

        if (expression.contains("+")) {
            divider = "\\+";
            operation = "+";
        } else if (expression.contains("-")) {
            divider = "-";
            operation = "-";
        } else if (expression.contains("/")) {
            operation="/";
            divider = "/";
        } else if (expression.contains("*")) {
            operation = "*";
            divider = "\\*";
        }

        String[] parts = expression.split(divider);

        a = Float.parseFloat(parts[0]);
        b = Float.parseFloat(parts[1]);
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public String getOperation() {
        return operation;
    }
}
