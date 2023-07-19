package stringProgram;

public class C {

	public static void main(String[] args) {
		
		String s1="javaselenium";
		
		System.out.println(s1.toUpperCase());  //JAVASELENIUM
		System.out.println(s1.toLowerCase());   // javaselenium
		System.out.println(s1.indexOf("u"));    //10
		System.out.println(s1.lastIndexOf("a"));  //3
		System.out.println(s1.startsWith("ja"));   //true
		System.out.println(s1.endsWith("um"));      //true
		System.out.println(s1.charAt(11));          //m
		System.out.println(s1.length());          //12
		System.out.println(s1.isEmpty());         //false
		
		System.out.println(s1.substring(5));    //elenium
		System.out.println(s1.substring(2,7));   //vasel
		
		

	}

}
