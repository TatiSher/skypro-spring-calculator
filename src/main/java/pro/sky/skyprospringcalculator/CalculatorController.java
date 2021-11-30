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
        return calculatorService.hello();
    }

    @GetMapping(path = "/calculator/plus")
    public String sum(@RequestParam("num1") int getSum) {
        return calculatorService.sum(getSum);
    }

    @GetMapping(path = "/calculator/minus")
    public String difference(@RequestParam("num1") int getDifference) {
        return calculatorService.difference(getDifference);
    }

    @GetMapping(path = "/calculator/multiply")
    public String multiply(@RequestParam("num1") int getMultiply) {
        return calculatorService.multiply(getMultiply);
    }

    @GetMapping(path = "/calculator/divide")
    public String divide(@RequestParam("num1") int getDivide) {
        return calculatorService.divide(getDivide);
    }
}