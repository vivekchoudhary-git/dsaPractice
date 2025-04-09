package bubbleSort.bubbleSort1;

// Refer Youtube- Tap Academy
// Sort Array in Ascending order

import java.util.Arrays;

public class BubbleTest {

	 public static void main(String[] args) {
		
//		 int[] marks= {7,3,5,9,2};
		 
		 int[] marks= {7,3,7,5,9,2,2,19,45,7,9};                 // includes duplicate values
		 
		 System.out.println("Array Before Sorting   :   "+Arrays.toString(marks));
		 
		Bubble bubble= new Bubble();
		 
		 int[] sortedMarksAsc = bubble.bubbleSortingAscending(marks);
		 
		 System.out.println("sortedMarks In Ascending Order  :  "+Arrays.toString(sortedMarksAsc));
		 
         int[] sortedMarksDsc = bubble.bubbleSortingDescending(marks);
		 
		 System.out.println("sortedMarks In Descending Order  :  "+Arrays.toString(sortedMarksDsc));
		 
	}
	 
}
