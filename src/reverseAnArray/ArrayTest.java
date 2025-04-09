package reverseAnArray;

import java.util.Arrays;

public class ArrayTest {

	private static void reverseArray(int[] marks){
		
		int i = 0;
		int j = marks.length-1;
		
		while(i <= j){
			
			int temp = marks[i];
			marks[i] = marks[j];
			marks[j] = temp;
			i++;
			j--;
			
		}
		
	}
	
	public static void main(String[] args) {
		
//		int[] marks = {2,4,6,8,10,12,14};
		
		int[] marks = {4,5,6,7,8,9};
		
		System.out.println("------------ Before Reversing the Array -----------");
		System.out.println(Arrays.toString(marks));
		
		reverseArray(marks);
		
		System.out.println("------------ After Reversing the Array -----------");
		System.out.println(Arrays.toString(marks));
		
	}
	
}
