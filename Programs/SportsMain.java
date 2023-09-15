import java.util.Scanner;

class Student {
    private String name;
    private int rollNumber;
    private double academicScore;

    public Student(String name, int rollNumber, double academicScore) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.academicScore = academicScore;
    }

    public void displayAcademicScore() {
        System.out.println(name + "'s academic score: " + academicScore);
    }
}

class Sports {
    private String sportName;
    private double sportsScore;

    public Sports(String sportName, double sportsScore) {
        this.sportName = sportName;
        this.sportsScore = sportsScore;
    }

    public void displaySportsScore() {
        System.out.println(sportName + " score: " + sportsScore);
    }
}

class Result {
    private Student student;
    private Sports sports;

    public Result(String name, int rollNumber, double academicScore, String sportName, double sportsScore) {
        student = new Student(name, rollNumber, academicScore);
        sports = new Sports(sportName, sportsScore);
    }

    public void displayResult() {
        student.displayAcademicScore();
        sports.displaySportsScore();
    }
}

public class SportsMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Result student1 = null;

        while (true) {
            try {
                System.out.println("Menu:");
                System.out.println("1. Enter student data");
                System.out.println("2. Display student data");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        scanner.nextLine(); 
                        System.out.print("Enter student's name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter student's roll number: ");
                        int rollNumber = scanner.nextInt();
                        System.out.print("Enter academic score: ");
                        double academicScore = scanner.nextDouble();
                        scanner.nextLine(); 
                        System.out.print("Enter sport name: ");
                        String sportName = scanner.nextLine();
                        System.out.print("Enter sports score: ");
                        double sportsScore = scanner.nextDouble();
                        student1 = new Result(name, rollNumber, academicScore, sportName, sportsScore);
                        System.out.println();
                        break;

                    case 2:
                        if (student1 != null) {
                            student1.displayResult();
                            System.out.println();
                        } else {
                            System.out.println("No student data entered yet.");
                        }
                        break;

                    case 3:
                        System.out.println("Exiting the program.");
                        System.out.println();
                        scanner.close();
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice. Please try again.");
                        System.out.println();
                        break;
                }
            } catch (Exception e) {
                System.out.println("An error occurred. Please check your input and try again.");
                System.out.println();
                scanner.nextLine();
            }
        }
    }
}

