package recursion.printNumbers;

// Print first N natural numbers
// e.g for n=5         print 1,2,3,4,5

import java.util.Scanner;

public class PrintNumbersTest {

	public static void print(int n){
		
		if(n < 1){
			return;
		}
		
		print(n-1);
		System.out.println(n);
		
	}
	
// e.g for n=5         print 5,4,3,2,1
	public static void printOtherWay(int n){
		
		if(n < 1){
			return;
		}
		
		System.out.println(n);
		printOtherWay(n-1);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("-------- Enter Number ---------");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		print(n);
		
		System.out.println("=================================");
		
		printOtherWay(n);
		
	}
	
}
