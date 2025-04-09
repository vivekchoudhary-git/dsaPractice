package bubbleSort.bubbleSort1;

import java.util.Arrays;

public class Bubble {

 public int[] bubbleSortingAscending(int[] marks){
		 
		 int n = marks.length;
		 
		 for(int i=0 ;i<n-1 ; i++){ 
			 
			 for(int j=0; j<n-i-1; j++){                               // here we can also write  j<n-1 but it is less efficient as it will go to every index from o to 3 everytime.
				                                                                // j < n-i-1 is more efficient as it will go 3rd index first time then 2nd index, and so on.
				 if(marks[j] > marks[j+1]){
					 
					 int temp = marks[j];
					 marks[j] = marks[j+1];
					 marks[j+1]= temp;
				 }
				 
			 }
			 
		 }
//		 System.out.println("after sorting in Bubble Class marks  :  "+Arrays.toString(marks));
		 return marks;
	 }
	
 public int[] bubbleSortingDescending(int[] marks){
	 
	 int n = marks.length;
	 
	 for(int i=0 ;i<n-1 ; i++){ 
		 
		 for(int j=0; j<n-i-1; j++){                               // here we can also write  j<n-1 but it is less efficient as it will go to every index from o to 3 everytime.
			                                                                // j < n-i-1 is more efficient as it will go 3rd index first time then 2nd index, and so on.
			 if(marks[j] < marks[j+1]){
				 
				 int temp = marks[j];
				 marks[j] = marks[j+1];
				 marks[j+1]= temp;
			 }
			 
		 }
		 
	 }
//	 System.out.println("after sorting in Bubble Class marks  :  "+Arrays.toString(marks));
	 return marks;
 }
 
}
