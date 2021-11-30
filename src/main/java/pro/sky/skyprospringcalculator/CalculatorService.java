package pro.sky.skyprospringcalculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public String hello() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }

    public static String sum(int getSum) {
        int num1 = 5;
        int num2 = 5;
        getSum = num1 + num2;
        return num1 + " + " + num2 + " = " + getSum;
    }

    public static String difference(int getDifference) {
        int num1 = 5;
        int num2 = 5;
        getDifference = num1 - num2;
        return num1 + " - " + num2 + " = " + getDifference;
    }

    public static String multiply(int getMultiply) {
        int num1 = 5;
        int num2 = 5;
        getMultiply = num1 * num2;
        return num1 + " * " + num2 + " = " + getMultiply;
    }

    public static String divide(int getDivide) {
        int num1 = 5;
        int num2 = 5;
        getDivide = num1 / num2;
        return num1 + " / " + num2 + " = " + getDivide;
    }
}

