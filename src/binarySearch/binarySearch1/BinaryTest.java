package binarySearch.binarySearch1;

import java.io.InputStream;
import java.util.Scanner;

// Refer Youtube Tap Academy

public class BinaryTest {

	public static void main(String[] args) {
		
		int[] marks = {7,15,74,28,56,32,41,8,89,1};
		
	// sort this array in ascending or descending order using any sorting technique like Bubble Sort,Selection Sort or Insertion Sort.
		
		// Array after sorting 
		
		int[] sortedMarks = {1,7,8,15,28,32,41,56,74,89};
		
		System.out.println("-------- Define Key to Find -------------");
		
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		
		Binary binary = new Binary();
		
		int indexOfKey = binary.searchByBinary(sortedMarks, key);
		
		System.out.println(key+"  is present in sortedMarks Array at Index  =   "+indexOfKey);
		
	}
	
}
