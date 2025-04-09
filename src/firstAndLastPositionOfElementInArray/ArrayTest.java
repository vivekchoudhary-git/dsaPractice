package firstAndLastPositionOfElementInArray;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {

	private static int[] searchRange(int[] marks,int key){
		
		int low =0;
		int high = marks.length-1;
		
		int[] result = {-1,-1};                                             // initially we have set value to -1 of first and last position of the element
		
		// Using this loop to find the First position of Element in the Array
		
		while(low <= high){
			
			int mid = (low+high)/2;
			
			if(key == marks[mid]){
				
				result[0] = mid;
				high = mid-1;
			}else if(key < marks[mid]){
				
				high = mid-1;
				low = low;                                     //  not required to write this line 
			}else{
				low = mid+1;
				high = high;                                  // not required to write this line 
			}
			
		}
		
		// Again using this loop to find the Last position of Element in the Array
		
		 low =0;
		 high = marks.length-1;
		
while(low <= high){
			
			int mid = (low+high)/2;
			
			if(key == marks[mid]){
				
				result[1] = mid;
				low = mid+1;
			}else if(key < marks[mid]){
				
				high = mid-1;
				low = low;                                     //  not required to write this line 
			}else{
				low = mid+1;
				high = high;                                  // not required to write this line 
			}
			
		}
return result;
		
	}
	
	public static void main(String[] args) {
		
//		int[] marks = {3,4,4,4,4,4,4,4,4,6};
		int[] marks = {2,5,5,9,9,9,11,13,22,22};                          // Test Case
		
		System.out.println("Existing Array  :  "+Arrays.toString(marks));
		
		System.out.println("---------------- Enter Key ------------------");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		
	int[] result	= searchRange(marks,key);
	
	System.out.println("First position of Element is  :  "+result[0]);
	System.out.println("Last position of Element is  :  "+result[1]);
		
	}
	
}
