package oops;

public class Student {
	
	int rollno;
	String name;
	
	Student(int rollno1,String name1)
	{
		rollno=rollno1;
		name=name1;
	}
	void show() 
	{
		System.out.println("Rollno :"+rollno+"& Name :"+name);
	}
	
	public static void main(String[] args)
	{
		 Student s1=new Student(57,"Sumit Lanjewar");  
		 Student s2=new Student(58,"Vilas Rathod");
		 Student s3=new Student(59,"Akshay Bagul");
		 Student s4=new Student(60,"Durga koli");
		 Student s5=new Student(61,"Arti Deshmukh");
		 
		 s1.show();
		 s2.show();
		 s3.show();
		 s4.show();
		 s5.show();
		 
	}
	

}

