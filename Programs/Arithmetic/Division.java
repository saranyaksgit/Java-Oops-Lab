package Arithmetic;

public class Division implements ArithmeticOperation {
    @Override
    public double calculate(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return num1 / num2;
    }
}

