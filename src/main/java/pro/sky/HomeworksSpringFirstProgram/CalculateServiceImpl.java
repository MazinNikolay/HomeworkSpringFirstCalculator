package pro.sky.HomeworksSpringFirstProgram;

import org.springframework.stereotype.Service;

@Service
public class CalculateServiceImpl implements CalculateService {
    public String hello() {
        return "<b>Добро пожаловать</b> в калькулятор";
    }

    public String plus(int num1, int num2) {
        int res = num1 + num2;
        return num1 + " + " + num2 + " = " + res;
    }

    public String minus(int num1, int num2) {
        int res = num1 - num2;
        return num1 + " - " + num2 + " = " + res;
    }

    public String multiply(int num1, int num2) {
        int res = num1 * num2;
        return num1 + " * " + num2 + " = " + res;
    }

    public String divide(int num1, int num2) {
        int res = num1 / num2;
        return num1 + " / " + num2 + " = " + res;
    }

    public Boolean checkEmpty(Integer num1, Integer num2) {
        boolean emptyValue = num1 == null || num2 == null;
        if (emptyValue) {
            return true;
        } else {
            return false;
        }
    }
}
