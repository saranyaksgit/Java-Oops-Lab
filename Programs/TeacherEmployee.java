import java.util.Scanner;
class Employee
{
	int empId;
	String name;
	double salary;
	String address;

	Employee(int empId, String name, double salary, String address)
	{
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}
}

class Teacher extends Employee
{
	String department;
	String subjectsTaught;

	Teacher(int empId, String name, double salary, String address, String department, String subjectsTaught)
	{
		super(empId, name, salary, address);
		this.department = department;
		this.subjectsTaught = subjectsTaught;
	}


	void display()
	{
		System.out.println("Employee ID: " + empId);
		System.out.println("Name is " + name);
		System.out.println("Salary: $" + salary);
		System.out.println("Address is " + address);
		System.out.println("Department is " + department);
		System.out.println("Subjects Taught is " + subjectsTaught);
	}
}

public class TeacherEmployee
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of Teachers: ");
		int n = sc.nextInt();

		Teacher[] teachers = new Teacher[n];

		for (int i = 0; i < n; i++)
		{
			System.out.println("Enter details for Teacher " + (i + 1) + ":");
			System.out.print("Employee ID: ");
			int empId = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			sc.nextLine();
			System.out.print("Address: ");
			String address = sc.nextLine();
			System.out.print("Department: ");
			String department = sc.nextLine();
			System.out.print("Subjects Taught: ");
			String subjectsTaught = sc.nextLine();

			teachers[i] = new Teacher(empId, name, salary, address, department, subjectsTaught);
		}

		System.out.println("\n\n....... Printing Details of Teachers! .......");
		for (Teacher teacher : teachers)
		{
			teacher.display();
			System.out.println();
		}

		sc.close();
	}
}

