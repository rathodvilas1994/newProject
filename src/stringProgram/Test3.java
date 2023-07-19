package stringProgram;

public class Test3 {

	public static void main(String[] args) {
		
	/*	String s1="a";        //sky value a=97   b=65   97-65=32
		String s2="A";
		System.out.println(s1.compareTo(s2));   //32 
		System.out.println(s1.compareToIgnoreCase(s2));  // 0
		
		System.out.println(s1+s2);         //aA
		System.out.println(s1.concat(s2)); //aA       */
          
		String s1="deepak java";
		System.out.println(s1.substring(3));  //pak java
		System.out.println(s1.substring(3,8));  //pak j
		System.out.println(s1.subSequence(3, 8));  //pak j
	}

}
