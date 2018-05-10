package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import service.operation.MathOperation;

import java.util.HashMap;
import java.util.Map;

@Service
public class CalculatorService {
    private Map<String, MathOperation> operationMap;

    @Autowired
    private ParseService parseService;

    public CalculatorService(ApplicationContext context) {
        operationMap = new HashMap<String, MathOperation>();

        String[] operations = new String[] {"+", "-", "/", "*"};
        for(String opName: operations) {
            MathOperation operation = (MathOperation) context.getBean(opName);
            operationMap.put(opName, operation);
        }
    }

    public float calc(float a, float b, String operation) {
        return operationMap.get(operation).calc(a, b);
    }

    public float calc(String expression) {
        parseService.parse(expression);

        return calc(parseService.getA(), parseService.getB(), parseService.getOperation());
    }
}
