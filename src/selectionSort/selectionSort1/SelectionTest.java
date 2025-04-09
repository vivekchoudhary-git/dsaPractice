package selectionSort.selectionSort1;

//Refer Yoututbe- Apna College

import java.util.Arrays;

public class SelectionTest {

	public static void main(String[] args) {
		
		int[] marks= {4,1,5,2,3};
		
		System.out.println("Unsorted Marks  :  "+Arrays.toString(marks));
		
		Selection selection = new Selection();
		
		// sorting in ascending order
		int[] sortedMarksAsc = selection.selectionSortAsc(marks);
		
		System.out.println("sorted marks in ascending order   :    "+Arrays.toString(sortedMarksAsc));
		
		// sorting in descending order
       int[] sortedMarksDsc = selection.selectionSortDesc(marks);
		
		System.out.println("sorted marks in descending order   :    "+Arrays.toString(sortedMarksDsc));
		
	}
	
}
