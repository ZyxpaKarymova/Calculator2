package pro.sky.calculator;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final CalculatorService calculatorService;

    public Controller(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "/calculator")
    public String answerWelcome() {
        return calculatorService.answerWelcome();
    }
    @GetMapping(path = "/calculator/plus")
    public String addition(@RequestParam(value = "num1",required = false) int num1, @RequestParam(value="num2",required = false) int num2) {
        return calculatorService.addition(num1, num2);
    }
    @GetMapping(path = "/calculator/minus")
    public String substraction(@RequestParam(value = "num1",required = false) int num1, @RequestParam(value = "num2",required = false) int num2){
        return calculatorService.substraction(num1, num2);
    }
    @GetMapping(path = "/calculator/multiply")
    public String multiplication(@RequestParam(value = "num1",required = false) int num1, @RequestParam(value = "num2",required = false) int num2){
        return calculatorService.multiplication(num1, num2);
    }
    @GetMapping(path = "/calculator/divide")
    public String division (@RequestParam(value = "num1",required = false) int num1, @RequestParam(value = "num2",required = false) int num2){
        return calculatorService.division(num1, num2);
    }
}

