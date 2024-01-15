package pro.sky.HomeworksSpringFirstProgram;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculateController {
    private final CalculateService calculateService;

    public CalculateController(CalculateService calculateService) {
        this.calculateService = calculateService;
    }

    @GetMapping
    public String hello() {
        return calculateService.hello();
    }

    @GetMapping(path = "/hello")
    public String helloToo(@RequestParam("name") String userName) {
        return calculateService.helloToo(userName);
    }
}
