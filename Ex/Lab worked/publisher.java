import java.util.Scanner;

class Publishers {
    private String name;

    public Publishers(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Book {
    private String title;
    private Publishers publishers;

    public Book(String title, Publishers publishers) {
        this.title = title;
        this.publishers = publishers;
    }

    public String getTitle() {
        return title;
    }

    public Publishers getPublishers() {
        return publishers;
    }
}

class Literature extends Book {
    private String author;

    public Literature(String title, Publishers publishers, String author) {
        super(title, publishers);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

class Fiction extends Book {
    private String genre;

    public Fiction(String title, Publishers publishers, String genre) {
        super(title, publishers);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }
}

public class publisher {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of books: ");
        int numBooks = input.nextInt();
        input.nextLine(); // Consume the newline character

        Book[] books = new Book[numBooks];

        for (int i = 0; i < numBooks; i++) {
            System.out.println("Enter details for Book " + (i + 1));

            System.out.print("Title: ");
            String title = input.nextLine();

            System.out.print("Publisher: ");
            String publisherName = input.nextLine();
            Publishers publishers = new Publishers(publisherName);

            System.out.print("Category (L for Literature, F for Fiction): ");
            String category = input.nextLine();

            if (category.equalsIgnoreCase("L")) {
                System.out.print("Author: ");
                String author = input.nextLine();
                books[i] = new Literature(title, publishers, author);
            } else if (category.equalsIgnoreCase("F")) {
                System.out.print("Genre: ");
                String genre = input.nextLine();
                books[i] = new Fiction(title, publishers, genre);
            } else {
                System.out.println("Invalid category. Skipping book...");
                continue;
            }

            System.out.println();
        }

        System.out.println("Book Details:");
        for (Book book : books) {
            if (book != null) {
                System.out.println("Title: " + book.getTitle());
                System.out.println("Publishers: " + book.getPublishers().getName());

                if (book instanceof Literature) {
                    Literature literatureBook = (Literature) book;
                    System.out.println("Author: " + literatureBook.getAuthor());
                } else if (book instanceof Fiction) {
                    Fiction fictionBook = (Fiction) book;
                    System.out.println("Genre: " + fictionBook.getGenre());
                }

                System.out.println();
            }
        }
    }
}

