class Animal
{
        String name;
        public void sleep()
        {
                System.out.println("sleeping...");
        }
}

class Dog extends Animal
{
        public void display()
        {
                System.out.println("My name is "+name);
        }
}

class test
{
        public static void main(String args[])
        {
                Dog d = new Dog();
                d.name = "Adarsh";
                d.display();
                d.sleep();
        }
} 
