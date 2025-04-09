package removeDuplicatesFromSortedArray;

// Refer Youtube Tap Academy Playlist- DSA Ep - 67 / 109
// This is method-1 of removing duplicacy from a sorted array but this is not very efficient method.
//Note : Array must be sorted.

import java.util.Arrays;

public class ArrayTest {

	private static int[] removeDuplicates(int[] marks){
		
		int[] temp = new int[marks.length];
		
		int rd = 0;
		
		temp[rd] = marks[0];                                    
		
		for(int i=1; i < marks.length ; i++){
			
			if(temp[rd] != marks[i] ){
				
				rd++;
				temp[rd] = marks[i];
			}
		}
		return temp;
		
	}
	
	public static void main(String[] args) {
		
		int[] marks = {2,2,3,3,4,6,6};
		
		System.out.println("------ Before Removing Duplicates --------");
		System.out.println(Arrays.toString(marks));
		
		int[] rdMarks = removeDuplicates(marks);
		
		System.out.println("------ After Removing Duplicates --------");
		System.out.println(Arrays.toString(rdMarks));
		
	}
	
}
