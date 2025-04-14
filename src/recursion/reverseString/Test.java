package recursion.reverseString;

import java.util.Scanner;

public class Test {

	private static String reverseString(String s,String r,int i){
		
		// this is the base condition
		if(i < 0){
			return r;
		}
		
		return reverseString(s, r+s.charAt(i), i-1);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("----- Enter String -----");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();                                            // input String
		String r ="";                                                           // created empty String for concatination
		int i = s.length()-1;
		
		String result = reverseString(s,r,i);
		
		System.out.println("reversed String  :  "+result);
		
	}
	
}
