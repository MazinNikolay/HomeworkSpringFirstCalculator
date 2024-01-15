package pro.sky.HomeworksSpringFirstProgram;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calculator")
public class CalculateController {
    private final CalculateService calculateService;

    public CalculateController(CalculateService calculateService) {
        this.calculateService = calculateService;
    }

    @GetMapping
    public String hello() {
        return calculateService.hello();
    }

    @GetMapping(path = "/plus")
    public String plus(
            @RequestParam(required = false) Integer num1,
            @RequestParam(required = false) Integer num2) {
        if (calculateService.checkEmpty(num1, num2)) {
            return "Какой-то из двух параметров (или оба) не поданы, исправте ввод";
        } else {
            return calculateService.plus(num1, num2);
        }
    }

    @GetMapping(path = "/minus")
    public String minus(
            @RequestParam(required = false) Integer num1,
            @RequestParam(required = false) Integer num2) {
        if (calculateService.checkEmpty(num1, num2)) {
            return "Какой-то из двух параметров (или оба) не поданы, исправте ввод";
        } else {
            return calculateService.minus(num1, num2);
        }
    }

    @GetMapping(path = "/multiply")
    public String multiply(
            @RequestParam(required = false) Integer num1,
            @RequestParam(required = false) Integer num2) {
        if (calculateService.checkEmpty(num1, num2)) {
            return "Какой-то из двух параметров (или оба) не поданы, исправте ввод";
        } else {
            return calculateService.multiply(num1, num2);
        }
    }

    @GetMapping(path = "/divide")
    public String divide(
            @RequestParam(required = false) Integer num1,
            @RequestParam(required = false) Integer num2) {
        if (calculateService.checkEmpty(num1, num2) || num2 == 0) {
            return "Какой-то из двух параметров (или оба) не поданы, или второе значение равно \"0\", исправте ввод";
        } else {
            return calculateService.divide(num1, num2);
        }
    }
}
