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
        return calculatorService.hello() + " в калькулятор";
    }

    @GetMapping(path = "/plus")
    public String plus(
            @RequestParam(required = false) Integer num1,
            @RequestParam(required = false) Integer num2) {
        if (checkInputEmpty(num1, num2)) {
            return "Какой-то из двух параметров (или оба) не поданы, исправьте ввод";
        } else {
            return num1 + " + " + num2 + " = " + calculatorService.plus(num1, num2);
        }
    }

    @GetMapping(path = "/minus")
    public String minus(
            @RequestParam(required = false) Integer num1,
            @RequestParam(required = false) Integer num2) {
        if (checkInputEmpty(num1, num2)) {
            return "Какой-то из двух параметров (или оба) не поданы, исправьте ввод";
        } else {
            return num1 + " - " + num2 + " = " + calculatorService.minus(num1, num2);
        }
    }

    @GetMapping(path = "/multiply")
    public String multiply(
            @RequestParam(required = false) Integer num1,
            @RequestParam(required = false) Integer num2) {
        if (checkInputEmpty(num1, num2)) {
            return "Какой-то из двух параметров (или оба) не поданы, исправьте ввод";
        } else {
            return num1 + " * " + num2 + " = " + calculatorService.multiply(num1, num2);
        }
    }

    @GetMapping(path = "/divide")
    public String divide(
            @RequestParam(required = false) Integer num1,
            @RequestParam(required = false) Integer num2) {
        if (checkInputEmpty(num1, num2)) {
            return "Какой-то из двух параметров (или оба) не поданы, исправьте ввод";
        } else if (checkZero(num2)) {
            return "Значение второго параметра равно \"0\", исправьте ввод";
        } else {
            return num1 + " / " + num2 + " = " + calculatorService.divide(num1, num2);
        }
    }

    public Boolean checkInputEmpty(Integer num1, Integer num2) {
        boolean emptyValue = num1 == null || num2 == null;
        return emptyValue;
    }

    public Boolean checkZero(int val) {
        boolean zeroValue = val == 0;
        return zeroValue;
    }
}
