package pro.sky.skyprospringcalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "/calculator")
    public String hello() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }

    @GetMapping(path = "/calculator/plus")
    public String sum(@RequestParam("num1") int num1,@RequestParam("num2") int num2) {
        return calculatorService.sum(num1,num2);
    }

    @GetMapping(path = "/calculator/minus")
    public String difference(@RequestParam("num1") int num1,@RequestParam("num2") int num2) {
        return calculatorService.difference(num1,num2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String multiply(@RequestParam("num1") int num1,@RequestParam("num2") int num2) {
        return calculatorService.multiply(num1,num2);
    }

    @GetMapping(path = "/calculator/divide")
    public String divide(@RequestParam("num1") int num1,@RequestParam("num2") int num2) {
        return calculatorService.divide(num1,num2);
    }
}