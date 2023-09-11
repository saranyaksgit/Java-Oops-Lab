import Arithmetic.*;
import java.util.Scanner;

public class ArithmeticTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArithmeticOperation addition = new Addition();
        ArithmeticOperation subtraction = new Subtraction();
        ArithmeticOperation multiplication = new Multiplication();
        ArithmeticOperation division = new Division();

        int continueCalculation = 1; // 1 for "yes", 0 for "no"

        while (true) {
            System.out.print("Enter the first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = sc.nextDouble();

            while (true) {
                System.out.println("Choose an operation:");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Exit");

                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        double resultAdd = addition.calculate(num1, num2);
                        System.out.println("Result (Addition): " + resultAdd);
                        break;
                    case 2:
                        double resultSub = subtraction.calculate(num1, num2);
                        System.out.println("Result (Subtraction): " + resultSub);
                        break;
                    case 3:
                        double resultMul = multiplication.calculate(num1, num2);
                        System.out.println("Result (Multiplication): " + resultMul);
                        break;
                    case 4:
                        try {
                            double resultDiv = division.calculate(num1, num2);
                            System.out.println("Result (Division): " + resultDiv);
                        } catch (ArithmeticException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;
                    case 5:
                        System.out.print("Do you want to continue with new numbers (1 for yes, 0 for no)? ");
                        int continueChoice = sc.nextInt();
                        if (continueChoice == 0) {
                            sc.close();
                            System.exit(0);
                        } else if (continueChoice == 1) {
                            continueCalculation = 1;
                            break;
                        }
                    default:
                        System.out.println("Invalid choice");
                        break;
                }

                if (choice == 5 || continueCalculation == 0) {
                    break;
                }
            }
        }
    }
}

