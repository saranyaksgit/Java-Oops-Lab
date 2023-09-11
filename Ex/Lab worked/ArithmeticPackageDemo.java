// Import the arithmetic package and its classes/interfaces
import arithmetic.*;

public class ArithmeticPackageDemo {
    public static void main(String[] args) {
        double num1 = 10.0;
        double num2 = 5.0;

        // Perform addition
        ArithmeticOperation addition = new AdditionOperation();
        System.out.println("Addition: " + addition.calculate(num1, num2));

        // Perform subtraction
        ArithmeticOperation subtraction = new SubtractionOperation();
        System.out.println("Subtraction: " + subtraction.calculate(num1, num2));

        // Perform multiplication
        ArithmeticOperation multiplication = new MultiplicationOperation();
        System.out.println("Multiplication: " + multiplication.calculate(num1, num2));

        // Perform division
        ArithmeticOperation division = new DivisionOperation();
        System.out.println("Division: " + division.calculate(num1, num2));
    }
}

// ArithmeticOperation.java - Interface
package arithmetic;

public interface ArithmeticOperation {
    double calculate(double num1, double num2);
}

// AdditionOperation.java
package arithmetic;

public class AdditionOperation implements ArithmeticOperation {
    @Override
    public double calculate(double num1, double num2) {
        return num1 + num2;
    }
}

// SubtractionOperation.java
package arithmetic;

public class SubtractionOperation implements ArithmeticOperation {
    @Override
    public double calculate(double num1, double num2) {
        return num1 - num2;
    }
}

// MultiplicationOperation.java
package arithmetic;

public class MultiplicationOperation implements ArithmeticOperation {
    @Override
    public double calculate(double num1, double num2) {
        return num1 * num2;
    }
}

// DivisionOperation.java
package arithmetic;

public class DivisionOperation implements ArithmeticOperation {
    @Override
    public double calculate(double num1, double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return num1 / num2;
    }
}

