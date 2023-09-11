import java.util.Scanner;
interface Printable
{
	void print();
}

class Printer implements Printable
{
	public void print()
	{
		System.out.println("Printing from printer class");
	}
}

public class InterfaceExampleWithInput
{
	public static void main(String[] args)
	{
		Printer printer=new Printer();
		printer.print();
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter your name :");
		String name=scanner.nextLine();
		System.out.println("Hello, "+ name + "!");
	}
}
