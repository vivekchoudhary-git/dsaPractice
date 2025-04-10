package recursion.recursionCountNoOfDigitsInNumber;

import java.util.Scanner;

// Refer Youtube Tap Academy playlist DSA series 34/109
// Count The Number Of Digits In A Number Using Recursion

public class Test {

	private static int countDigit(int n){
		
	// this is base condition
		if(n == 0){
			return 0;
		}
		
		return countDigit(n/10)+1;          
	}
	
	public static void main(String[] args) {
		
		System.out.println("---- Enter the Number -----");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int result = countDigit(n);
		
		System.out.println(" Number  :  "+n+"  no. of digits  :  "+result);
		
	}
	
}
