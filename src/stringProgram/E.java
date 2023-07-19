package stringProgram;

public class E {

	public static void main(String[] args) {

		String s="ABcdefghijKL";
		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.charAt(2));
		System.out.println(s.endsWith(s));
		System.out.println(s.lastIndexOf("b"));
		System.out.println(s.substring(2,10));
		int x = s.lastIndexOf("j");
		System.out.println(x);
		


	}

}
