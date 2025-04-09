package CountOfSmallerOrEqualElementsInArray;

// Refer Youtube Tap Academy Playlist DSA episode 55/109
// Concept :  Count Of Smaller Or Equal Elements In An Array

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {

	
	private static int countSmallAndEqualElement(int[] marks,int key){
		
		int low = 0;
		int high = marks.length-1;
		int mid = 0;
		
		    while(low <= high)
		   {
			mid = (low+high)/2;
			
			if(key == marks[mid])
			{
				break;
			}else if(key < marks[mid])
			{
				high = mid-1;
				low = low;                                                      // not required to write this
			}else
			{
				low = mid+1;
				high = high;                                                      // not required to write this
			}
			 
		}
		
		while(mid+1 < marks.length && key == marks[mid+1])                            // This logic is to handle duplicate elements in the Array
		{
			mid++;
		}
		
		if(marks[mid] > key)                              // This logic is to handle condition when element is not present in the Array.
		{
			return mid;
		}
		
		return mid+1;
		
	}
	
	public static void main(String[] args) {
		
//		int[] marks = {2,6,12,18,21,26,33,42};                    // Test Case 1 : No Duplicate Elements are present in an Array
//		int[] marks = {2,6,12,18,21,26,26,26};                      // Test Case 2 : Duplicate Elements are present in an Array
//		int[] marks = {2,6,12,24,26,26,28,30};                   // Test Case 3 : When Element is not present in an Array     
		int[] marks = {3,4,4,4,4,4,4,6};                           //   Test Case 4 :  Duplicate Elements are present in an Array
		
		System.out.println("Given Array is   :  "+Arrays.toString(marks));
		
		System.out.println("------------------- Enter Key ----------------");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		
		int result = countSmallAndEqualElement(marks,key);
		
		System.out.println("Count of Small and Equal Elements in the given Array for Key  "+key+"  is   :  "+result);
		
		
	}
	
}
