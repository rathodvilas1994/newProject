package conditionalsmt;  //Q..WAP to create simple calculator using switch statement

public class Calculator {

	public static void main(String[] args) {
		
		int no1=10,no2=20;
		char c='*';
		
		switch(c) 
		{
		case '+' :System.out.println("result is :"+(no1+no2));
		          break;
		case '-' :System.out.println("result is :"+(no1-no2));
                  break;
		case '*' :System.out.println("result is :"+(no1*no2));
                  break;
		case '/' :System.out.println("result is :"+(no1/no2));
                  break;
        default :System.out.println("invalid");   
                  break;



		
		}

	}

}
