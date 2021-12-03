package pro.sky.skyprospringcalculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public static String sum(int num1, int num2) {
        int getSum = num1 + num2;
        return num1 + " + " + num2 + " = " + getSum;
    }

    public static String difference(int num1, int num2) {
        int getDifference = num1 - num2;
        return num1 + " - " + num2 + " = " + getDifference;
    }

    public static String multiply(int num1, int num2) {
        int getMultiply = num1 * num2;
        return num1 + " * " + num2 + " = " + getMultiply;
    }

    public static String divide(int num1, int num2) {
        int getDivide = num1 / num2;
        if (num2 == 0) {
            return "деление на 0 запрещено";
        } else {return num1 + " / " + num2 + " = " + getDivide;}
    }
}