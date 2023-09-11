import java.util.Scanner;

public class Elementsearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of elements in the array
        System.out.print("Enter the size of the array: ");
        int numElements = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        // Create an array of integers with the specified number of elements
        int[] array = new int[numElements];

        // Input the elements of the array from the user
        for (int i = 0; i < numElements; i++) {
            System.out.print("Enter element #" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Prompt the user for the element to search for
        System.out.print("Enter the element to search for: ");
        int target = scanner.nextInt();

        // Perform the search
        boolean found = false;
        for (int i = 0; i < numElements; i++) {
            if (array[i] == target) {
                found = true;
                System.out.println("Element found at index " + (i + 1));
                break; // Element found, exit the loop
            }
        }

        // If the element is not found
        if (!found) {
            System.out.println("Element not found in the array.");
        }

        scanner.close();
    }
}

