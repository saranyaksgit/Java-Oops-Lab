import java.util.Scanner;

class Persons
{
	protected String name;
	protected String gender;
	protected String address;
	protected int age;

	public Persons(String name, String gender, String address, int age)
	{
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.age = age;
    	}
}

class Employee extends Persons
{
	protected String empid;
	protected String company_name;
	protected String qualification;
	protected double salary;

	public Employee(String name, String gender, String address, int age, String empid, String company_name, String qualification, double salary)
	{
		super(name, gender, address, age);
		this.empid = empid;
		this.company_name = company_name;
		this.qualification = qualification;
		this.salary = salary;
	}
}

class Teacher extends Employee
{
	protected String subject;
	protected String department;
	protected String teacherid;

	public Teacher(String name, String gender, String address, int age, String empid, String company_name, String qualification, double salary, String subject, String department, String teacherid)
	{
		super(name, gender, address, age, empid, company_name, qualification, salary);
		this.subject = subject;
		this.department = department;
		this.teacherid = teacherid;
	}

	public void displayDetails()
	{
		System.out.println("Name: " + name);
		System.out.println("Gender: " + gender);
		System.out.println("Address: " + address);
		System.out.println("Age: " + age);
		System.out.println("Employee ID: " + empid);
		System.out.println("Company Name: " + company_name);
		System.out.println("Qualification: " + qualification);
		System.out.println("Salary: " + salary);
		System.out.println("Subject: " + subject);
		System.out.println("Department: " + department);
		System.out.println("Teacher ID: " + teacherid);
	}
}

public class person
{
	public static void main(String[] args)
	{
        	Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of teachers: ");
		int numTeachers = input.nextInt();

		Teacher[] teachers = new Teacher[numTeachers];

		for (int i = 0; i < numTeachers; i++)
		{
			System.out.println("Enter details for Teacher " + (i + 1));

			System.out.print("Name: ");
			String name = input.next();

			System.out.print("Gender: ");
			String gender = input.next();

			System.out.print("Address: ");
			String address = input.next();

			System.out.print("Age: ");
			int age = input.nextInt();

			System.out.print("Employee ID: ");
			String empid = input.next();

			System.out.print("Company Name: ");
			String company_name = input.next();

			System.out.print("Qualification: ");
			String qualification = input.next();

			System.out.print("Salary: ");
			double salary = input.nextDouble();

			System.out.print("Subject: ");
			String subject = input.next();

			System.out.print("Department: ");
			String department = input.next();

			System.out.print("Teacher ID: ");
			String teacherid = input.next();

			teachers[i] = new Teacher(name, gender, address, age, empid, company_name, qualification, salary, subject, department, teacherid);
			System.out.println();
		}

		System.out.println("Teacher Details:");
        	for (Teacher teacher : teachers)
		{
			teacher.displayDetails();
			System.out.println();
		}
	}
}

