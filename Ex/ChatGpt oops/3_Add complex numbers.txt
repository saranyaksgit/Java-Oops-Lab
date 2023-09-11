import java.util.Scanner;

class ComplexNumber {
    double real;
    double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber add(ComplexNumber other) {
        double sumReal = this.real + other.real;
        double sumImaginary = this.imaginary + other.imaginary;
        return new ComplexNumber(sumReal, sumImaginary);
    }
}

public class ComplexNumberAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the real and imaginary parts of the first complex number:");
        double real1 = scanner.nextDouble();
        double imaginary1 = scanner.nextDouble();
        ComplexNumber complex1 = new ComplexNumber(real1, imaginary1);

        System.out.println("Enter the real and imaginary parts of the second complex number:");
        double real2 = scanner.nextDouble();
        double imaginary2 = scanner.nextDouble();
        ComplexNumber complex2 = new ComplexNumber(real2, imaginary2);

        ComplexNumber sum = complex1.add(complex2);
        System.out.println("Sum of the complex numbers: " + sum.real + " + " + sum.imaginary + "i");
    }
}

