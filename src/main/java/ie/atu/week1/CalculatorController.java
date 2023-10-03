package ie.atu.week1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CalculatorController {
    @GetMapping("/calculate/{num1}/{num2}/{operation}")
    public String calculate(@PathVariable int num1, @PathVariable int num2, @PathVariable String operation) {
        int total = 0;
        switch(operation) {
            case "add":
                total = num1 + num2;
                break;
            case "subtract":
                total = num1 - num2;
                break;
            case "multiply":
                total = num1 * num2;
                break;
            case "divide":
                total = num1 / num2;
                break;
        }
        return "operation: " + operation + ", total: " + total;
    }
}
