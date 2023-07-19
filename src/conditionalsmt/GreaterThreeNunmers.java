package conditionalsmt;   //Q..WAP to find greater number btn 3 numbers

public class GreaterThreeNunmers {

	public static void main(String[] args) {
		
		int no1=100;
		int no2=20; 
		int no3=50;
		
		if(no1>no2 && no1>no3) 
		{
			System.out.println("no1 is greter");
		}
		else if(no2>no1 && no2>no3) 
		{
			System.out.println("no2 is greater");
		}
		else 
		{
			System.out.println("no3 is greater");
		}

	}

}
