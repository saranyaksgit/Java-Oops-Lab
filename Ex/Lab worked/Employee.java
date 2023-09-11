import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class Employees 
{
	private int emp_id;
	private String name;
	private double salary;
	private String address;

	public Employees(int emp_id, String name, double salary, String address)
	{
		this.emp_id = emp_id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}

	public int getEmp_id()
	{
		return emp_id;
	}

	public String getName()
	{
		return name;
	}

	public double getSalary()
	{
		return salary;
	}

	public String getAddress()
	{
		return address;
	}
}

class Teacher extends Employees
{
	private String department;
	private String subjectTaught;

	public Teacher(int emp_id, String name, double salary, String address, String department, String subjectTaught)
	{
		super(emp_id, name, salary, address);
		this.department = department;
		this.subjectTaught = subjectTaught;
	}

	public String getDepartment()
	{
		return department;
	}

	public String getSubjectTaught()
	{
		return subjectTaught;
	}
}

public class Employee
{
	public static void main(String[] args)
	{
		ArrayList<Teacher> teachers = new ArrayList<>();

		Scanner scanner = new Scanner(System.in);
		int numTeachers = 0;

		while (true)
		{
			try
			{
				System.out.print("Enter the number of teachers: ");
				numTeachers = scanner.nextInt();
				scanner.nextLine();
				break;
			}
			catch (InputMismatchException e)
			{
				System.out.println("Invalid input. Please enter a valid integer.");
				scanner.nextLine();
			}
		}

	for (int i = 1; i <= numTeachers; i++)
	{
		System.out.println("Enter details for Teacher " + i + ":");

		System.out.print("Employee ID: ");
		int emp_id = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Name: ");
		String name = scanner.nextLine();

		System.out.print("Salary: ");
		double salary = 0;

		while (true)
		{
			try
			{
				salary = scanner.nextDouble();
				scanner.nextLine();
				break;
			}
			catch (InputMismatchException e)
			{
				System.out.println("Invalid input. Please enter a valid number.");
				scanner.nextLine();
			}
		}

		System.out.print("Address: ");
		String address = scanner.nextLine();

		System.out.print("Department: ");
		String department = scanner.nextLine();

		System.out.print("Subject Taught: ");
		String subjectTaught = scanner.nextLine();

		teachers.add(new Teacher(emp_id, name, salary, address, department, subjectTaught));

		System.out.println();
	}
		scanner.close();

		displayTeachers(teachers);
}

	public static void displayTeachers(ArrayList<Teacher> teachers)
	{
		System.out.println("List of Teachers:");
		for (Teacher teacher : teachers)
		{
			System.out.println("Employee ID: " + teacher.getEmp_id());
			System.out.println("Name: " + teacher.getName());
			System.out.println("Salary: $" + teacher.getSalary());
			System.out.println("Address: " + teacher.getAddress());
			System.out.println("Department: " + teacher.getDepartment());
			System.out.println("Subject Taught: " + teacher.getSubjectTaught());
			System.out.println();
		}
	}
}

