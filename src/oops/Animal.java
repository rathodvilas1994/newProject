package oops;

public class Animal {
	
	int age=10;
	String color="black";
	
	void eat() 
	{
		System.out.println("i am eating");
	}
	void run() 
	{
		System.out.println("i am running");
	}
	
	public static void main(String[] args) {
		
		Animal buzo=new Animal();
		
		System.out.println("Age :"+buzo.age);
		System.out.println("color :"+buzo.color);
		
		buzo.eat();
		buzo.run();
	}
	
	
	
	

}
