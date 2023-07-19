package oops;          //CONSRTUCTORS

class Animal3 {
	
          int age;
          String color;
          
          Animal3(int age1,String color1)
          {
        	  age=age1;
        	  color=color1;
          }
          void eat() 
          {
        	  System.out.println("i am eating");
          }
          void run() 
          {
        	  System.out.println("i am running");
          }
          
       
          
          public static void main(String[] args) {
			
        	  Animal3 buzo=new Animal3(10, "brown");
        	  System.out.println("age :"+buzo.age);
        	  System.out.println("color :"+buzo.color);
        	  buzo.eat();
        	  buzo.run();
        	  System.out.println("------------------------");
        	  
        	  Animal3 cat=new Animal3(5,"black");
        	  System.out.println("age :"+cat.age);
        	  System.out.println("color :"+cat.color);
        	  cat.eat();
        	  cat.run();
		}
}

