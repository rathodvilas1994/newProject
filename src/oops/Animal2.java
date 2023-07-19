package oops;

public class Animal2 {
	
	int age;
	String color;
	
	void eat() 
	{
		System.out.println("i am eating");
	}
	void run() 
	{
		System.out.println("i am running");
	}
	
	public static void main(String[] args) {
		
		Animal2 buzo=new Animal2();
		buzo.age=10;
		buzo.color="brown";
		
		System.out.println("Age :"+buzo.age);
		System.out.println("color :"+buzo.color);
		
		buzo.eat();
		buzo.run();
		
      System.out.println("---------------------------");
		
		Animal2 cat=new Animal2();
		cat.age=5;
		cat.color="black";
		
		System.out.println("Age :"+cat.age);
		System.out.println("color :"+cat.color);
		
		cat.eat();
		cat.run();
	}
}
