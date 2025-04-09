package moveZeroesToEndOfAnArray;

import java.util.Arrays;

public class ArrayTest {

	private static void moveZeroes(int[] marks){
		
		// use 2 pointer approach
		
		int nz = 0;                              // nz= non zero is our 1st pointer
		int z = 0;                                // z = zero is our 2nd pointer
		
		while(nz < marks.length){
			
			if(marks[nz] != 0 ){
				
				// do swapping
				int temp = marks[nz];
				marks[nz] = marks[z];
				marks[z] = temp;
				nz++;
				z++;
				
			}else{
				nz++;
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
//		int[] marks = {0,10,22,8,0,5,0};                                                             // Test Case
		int[] marks = {5,11,1,0,22,4,0,83,0,0,91,69};                                       // Test Case
		
		System.out.println("Original Array Before moving zeroes to end of the Array");
		System.out.println(Arrays.toString(marks));
		
		moveZeroes(marks);
		
		System.out.println("Array After moving zeroes to end of the Array");
		System.out.println(Arrays.toString(marks));
		
	}
	
	
	
}
