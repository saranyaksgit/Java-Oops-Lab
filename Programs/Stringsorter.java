import java.util.Arrays;
import java.util.Scanner;

public class Stringsorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of strings to sort
        System.out.print("Enter the number of strings to sort: ");
        int numStrings = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        // Create an array to store the strings
        String[] strings = new String[numStrings];

        // Input the strings from the user
        for (int i = 0; i < numStrings; i++) {
            System.out.print("Enter string #" + (i + 1) + ": ");
            strings[i] = scanner.nextLine();
        }

        // Sort the array of strings
        Arrays.sort(strings);

        // Display the sorted strings
        System.out.println("Sorted Strings:");
        for (String str : strings) {
            System.out.println(str);
        }

        scanner.close();
    }
}

