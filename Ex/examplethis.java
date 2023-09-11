class student
{
	int rollno;
	String name;
	
	student(int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;
	}

	void display()
	{
		System.out.println(rollno+" "+name);
	}

}

class examplethis
{
public static void main(String args[])
{
student s1=new student(10, "anu");
student s2=new student(11, "minu");
s1.display();
s2.display();
}
}
