package recursion.sumOfDigits;

import java.util.Scanner;

public class Test {

	private static int sumOfDigits(int n){
		
		// base Condition
		if(n == 0){
			
			return 0;
		}
		
	return	sumOfDigits(n/10) + (n%10);
		
	}
	
	public static void main(String[] args) {
		
//		int n = 5251;
		
		System.out.println("------ Enter Number ------");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int result = sumOfDigits(n);
		
		System.out.println("Sum digits of Number  :  "+n+"  is  :  "+result);
		
	}
	
}
