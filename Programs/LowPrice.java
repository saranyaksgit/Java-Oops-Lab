import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Product implements Comparable<Product> {
    int pcode;
    String pname;
    double price;

    public Product(int pcode, String pname, double price) {
        this.pcode = pcode;
        this.pname = pname;
        this.price = price;
    }

    @Override
    public int compareTo(Product other) {
        return Double.compare(this.price, other.price);
    }
}

public class LowPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> products = new ArrayList<>();

        // Input the number of products to enter
        System.out.print("Enter the number of products to enter: ");
        int numProducts = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Input product details for the specified number of products
        for (int i = 1; i <= numProducts; i++) {
            System.out.println("Enter details for Product " + i + ":");
            System.out.print("Product Code: ");
            int pcode = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Product Name: ");
            String pname = scanner.nextLine();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character

            Product product = new Product(pcode, pname, price);
            products.add(product);
        }

        // Find the product with the lowest price
        if (!products.isEmpty()) {
            Collections.sort(products);
            Product lowestPriceProduct = products.get(0);

            // Print the details of the product with the lowest price
            System.out.println("Product with the lowest price:");
            System.out.println("Product Code: " + lowestPriceProduct.pcode);
            System.out.println("Product Name: " + lowestPriceProduct.pname);
            System.out.println("Price: " + lowestPriceProduct.price);
        } else {
            System.out.println("No products entered.");
        }

        // Close the scanner
        scanner.close();
    }
}

