package pro.sky.HomeworksSpringFirstProgram;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String hello() {
        return "<b>Добро пожаловать</b>".toUpperCase();
    }

    public int plus(int num1, int num2) {
        int res = num1 + num2;
        return res;
    }

    public int minus(int num1, int num2) {
        int res = num1 - num2;
        return res;
    }

    public int multiply(int num1, int num2) {
        int res = num1 * num2;
        return res;
    }

    public int divide(int num1, int num2) {
        int res = num1 / num2;
        return res;
    }
}
