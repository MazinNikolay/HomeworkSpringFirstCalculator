package pro.sky.HomeworksSpringFirstProgram;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String hello() {
        return calculatorService.hello();
    }

    @GetMapping(path = "/plus")
    public String plus(
            @RequestParam(required = false) Integer num1,
            @RequestParam(required = false) Integer num2) {
        if (calculatorService.checkEmpty(num1, num2)) {
            return "Какой-то из двух параметров (или оба) не поданы, исправте ввод";
        } else {
            return calculatorService.plus(num1, num2);
        }
    }

    @GetMapping(path = "/minus")
    public String minus(
            @RequestParam(required = false) Integer num1,
            @RequestParam(required = false) Integer num2) {
        if (calculatorService.checkEmpty(num1, num2)) {
            return "Какой-то из двух параметров (или оба) не поданы, исправте ввод";
        } else {
            return calculatorService.minus(num1, num2);
        }
    }

    @GetMapping(path = "/multiply")
    public String multiply(
            @RequestParam(required = false) Integer num1,
            @RequestParam(required = false) Integer num2) {
        if (calculatorService.checkEmpty(num1, num2)) {
            return "Какой-то из двух параметров (или оба) не поданы, исправте ввод";
        } else {
            return calculatorService.multiply(num1, num2);
        }
    }

    @GetMapping(path = "/divide")
    public String divide(
            @RequestParam(required = false) Integer num1,
            @RequestParam(required = false) Integer num2) {
        if (calculatorService.checkEmpty(num1, num2) || num2 == 0) {
            return "Какой-то из двух параметров (или оба) не поданы, или второе значение равно \"0\", исправте ввод";
        } else {
            return calculatorService.divide(num1, num2);
        }
    }
}
