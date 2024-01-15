package pro.sky.HomeworksSpringFirstProgram;

import org.springframework.stereotype.Service;

@Service
public class CalculateServiceImpl implements CalculateService {
    public String hello() {
        return "<b>Hello</b>";
    }

    public String helloToo(String userName) {
        return "<b>Hello</b>" + userName;
    }
}
