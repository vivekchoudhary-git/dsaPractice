package recursion.sumOfElementsInArray;

import java.util.Arrays;

public class Test {

	private static int sumOfElements(int[] marks,int i){
		
		// this is the base condition
		if(i == marks.length){
			return 0;
		}
		
		return sumOfElements(marks,(i+1)) + marks[i];
		
	}
	
	public static void main(String[] args) {
		
		int[] marks = {1,2,3,4,5};
		
		int result = sumOfElements(marks,0);
		
		System.out.println("Array "+Arrays.toString(marks)+" sum of elements is  :  "+result);
		
	}
	
}
