import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.CalculatorService;
import service.MessageService;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        CalculatorService calc = context.getBean(CalculatorService.class);

        Scanner scanner = new Scanner(System.in);
        String line = null;
        while((line = scanner.nextLine()) != null) {
            if (line.equals("exit")) {
                System.exit(0);
            }

            System.out.println(line + "=" + calc.calc(line));
        }
    }
}
