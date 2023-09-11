import java.util.Scanner;

class Publisher {
    String publisherName;

    Publisher(String publisherName) {
        this.publisherName = publisherName;
    }
}

class Book {
    String bookTitle;
    Publisher publisher;
    double price;

    Book(String bookTitle, Publisher publisher, double price) {
        this.bookTitle = bookTitle;
        this.publisher = publisher;
        this.price = price;
    }

    void display() {
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Publisher: " + publisher.publisherName);
        System.out.println("Price: $" + price);
    }
}

class Literature extends Book {
    Literature(String bookTitle, Publisher publisher, double price) {
        super(bookTitle, publisher, price);
    }
}

class Fiction extends Book {
    Fiction(String bookTitle, Publisher publisher, double price) {
        super(bookTitle, publisher, price);
    }
}

public class BookStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Input for the publisher
            System.out.print("Enter Publisher Name: ");
            String publisherName = sc.nextLine();
            Publisher publisher = new Publisher(publisherName);

            // Input for Literature book
            System.out.print("Enter Literature Book Title: ");
            String litTitle = sc.nextLine();
            System.out.print("Enter Literature Book Price: ");
            double litPrice = sc.nextDouble();
            sc.nextLine(); // Consume the newline character
            Literature literatureBook = new Literature(litTitle, publisher, litPrice);

            // Input for Fiction book
            System.out.print("Enter Fiction Book Title: ");
            String fictionTitle = sc.nextLine();
            System.out.print("Enter Fiction Book Price: ");
            double fictionPrice = sc.nextDouble();
            sc.nextLine(); // Consume the newline character
            Fiction fictionBook = new Fiction(fictionTitle, publisher, fictionPrice);

            // Display book details
            System.out.println("\nLiterature Book Details:");
            literatureBook.display();

            System.out.println("\nFiction Book Details:");
            fictionBook.display();
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}

