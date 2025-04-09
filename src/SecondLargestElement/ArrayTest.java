package SecondLargestElement;

//Refer Youtube Tap Academy
//Find 2nd Largest Element of an Array

import java.util.Arrays;

public class ArrayTest {

	private static void secondLargestElement(int[] marks){
		
		int max1 = 0;
		int max2= 0;
		
		if(marks[0] > marks[1]){
			
			max1 = marks[0];
			max2= marks[1];
		}
		
        if(marks[1] > marks[0]){
			
			max1 = marks[1];
			max2= marks[0];
		}
		
        for(int i = 2 ; i < marks.length ; i++){
        	
        	if(marks[i] > max1){
        		
        		max2 = max1;
        		max1 = marks[i];
        		
        		
        	}else if (marks[i] > max2){
        		
        		max2 = marks[i];
        	}
        	
        }
    
        System.out.println("maximum is   :  "+max1+"    "+"2nd Largest is    :    "+max2);
    
	}
	
	
	public static void main(String[] args) {
		
		int[] marks = {20,42,6,25,30,88};
		
		System.out.println("marks are   :   "+Arrays.toString(marks));
		
		secondLargestElement(marks);
		
	}
	
}
