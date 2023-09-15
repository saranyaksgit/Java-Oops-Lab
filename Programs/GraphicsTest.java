import graphics.*;
import java.util.Scanner;

public class GraphicsTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape shape = null;

        while (true) {
            System.out.println("Choose a shape to calculate its area:");
            System.out.println("1. Rectangle");
            System.out.println("2. Triangle");
            System.out.println("3. Square");
            System.out.println("4. Circle");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the length of the rectangle: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter the width of the rectangle: ");
                    double width = scanner.nextDouble();
                    shape = new Rectangle(length, width);
                    break;

                case 2:
                    System.out.print("Enter the base of the triangle: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter the height of the triangle: ");
                    double height = scanner.nextDouble();
                    shape = new Triangle(base, height);
                    break;

                case 3:
                    System.out.print("Enter the side length of the square: ");
                    double side = scanner.nextDouble();
                    shape = new Square(side);
                    break;

                case 4:
                    System.out.print("Enter the radius of the circle: ");
                    double radius = scanner.nextDouble();
                    shape = new Circle(radius);
                    break;

                case 5:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            if (shape != null) {
                double area = shape.calculateArea();
                System.out.println("Area: " + area);
                System.out.println();
            }
        }
    }
}

