package programP;

import java.util.Arrays;

public class Q1 {

	public static void main(String[] args) {
		
		//find largest number from array
		
		int num[]= {11,12,13,33,44,55,21,40};
		Arrays.sort(num);
		System.out.println(num[num.length-1]);
		System.out.println(num[0]);

	}

}
