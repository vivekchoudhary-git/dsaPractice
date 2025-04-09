package insertionSort.insertionSort1;

//Refer Youtube Apna College

import java.util.Arrays;

public class InsertionTest {

	public static void main(String[] args) {
		
		int[] marks = {7,8,3,1,2};
		
		System.out.println("Unsorted marks   :   "+Arrays.toString(marks));
		
		Insertion insertion = new Insertion();
		
		int[] sortedMarksAsc = insertion.insertionSortAscending(marks);
		
		System.out.println("sorted marks in ascending order  :  "+Arrays.toString(sortedMarksAsc));
		
	     int[] sortedMarksDesc = insertion.insertionSortDescending(marks);
		
		System.out.println("sorted marks in descending order  :  "+Arrays.toString(sortedMarksDesc));
		
	}
	
}
