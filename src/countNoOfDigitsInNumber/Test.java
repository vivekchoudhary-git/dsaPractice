package countNoOfDigitsInNumber;

import java.util.Scanner;

// Refer Youtube Tap Academy Playlist DSA 8/109
// How To Count The Number Of Digits In A Number?

public class Test {

	private static int countDigits(int n){
		
		int count = 0;
		
		while(n > 0){
		n = n/10;                                       // return quotient.
		count++;
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		
		System.out.println("----- Enter Number -----");
		
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		
	int count = countDigits(n);
	
	System.out.println("No is  :  "+n+"  digits count  :   "+count);
		
	}
	
}
