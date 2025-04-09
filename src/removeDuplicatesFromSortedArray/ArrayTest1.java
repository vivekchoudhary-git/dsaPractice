package removeDuplicatesFromSortedArray;

//Refer Youtube Tap Academy Playlist- DSA Ep - 67 / 109
//This is method-2 of removing duplicacy from a sorted array but this is very efficient method.
//Note : Array must be sorted.

import java.util.Arrays;

public class ArrayTest1 {

	private static int removeDuplicates(int[] marks){
		
		int rd = 0;
		
		for(int i=1 ; i < marks.length ; i++){
			
			if(marks[rd] != marks[i]){
				
				rd++;
				marks[rd] = marks[i];
			}
			
		}
		return rd+1;                                             // upto rd index the array is fully sorted.All duplicates has been removed.
		
	}
	
	
	public static void main(String[] args) {
		
//	int[] marks = {2,2,3,3,4,6,6};
	
	int[] marks = {11,22,33,33,55,66,71,71};
		
		System.out.println("------ Before Removing Duplicates --------");
		System.out.println(Arrays.toString(marks));
		
         int rd = removeDuplicates(marks);
		
		System.out.println("------ After Removing Duplicates --------");
		
		for(int i = 0 ; i < rd ; i++)
			
			System.out.print(marks[i]+"  ");
			
	}
	
}
