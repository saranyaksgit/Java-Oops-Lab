class Animal
{
        String name,food;
        public void eat()
        {
                System.out.println("I likes to eat "+ food + ".");
        }
}

class Dog extends Animal
{
        public void display()
        {
                System.out.println("My name is "+ name +".");
        }
}

class Species extends Dog
{
        String family;
        public void details()
        {
                System.out.println("iam from "+ family +" Species.");
        }
}

class multi_lvl
{
        public static void main(String args[])
        {
                Species d = new Species();
                d.name = "Jack";
                d.family = "dobber";
                d.food = "chicken";
                d.display();
                d.eat();
                d.details();
        }
}
