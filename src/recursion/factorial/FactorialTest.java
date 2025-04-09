package recursion.factorial;

import java.util.Scanner;

public class FactorialTest {

	private static int factorial(int n){
		
		if(n == 0 || n == 1){
			return 1;
		}
		
		return n*factorial(n-1);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("-------  Enter Number -------");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int result = factorial(n);
		
		System.out.println(result);
		
	}
	
}
