package checkArraySortedOrNot;

// Refer Youtube Tap Academy and ChatGPT  

public class SortTest {

	public static String checkArraySortedStatus(int[] marks){
		
		boolean isAscending = true;
		boolean isDescending = true;
		  
		// int[] marks3 = {1,7,88,19,35,42,3};
		
		for(int i = 1; i < marks.length ; i++){
			
			if(marks[i] < marks[i-1]){
				
				isAscending = false;                                         // Note : only false logic would work , true logic will fail
			}else if(marks[i] > marks[i-1]){
				
				isDescending = false;                                          // Note : only false logic would work , true logic will fail
			}
			
		}
		
		if(isAscending){
			return "Array is sorted in Ascending Order";
		}else if(isDescending){
			return "Array is sorted in Descending Order";
		}
		
		return "Array is not sorted";
		
	}
	
	
	public static void main(String[] args) {
		
		int[] marks1 = {1,2,3,4,5,6,7};
		int[] marks2 = {7,6,5,4,3,2,1};
		int[] marks3 = {1,7,88,19,35,42};
		
		String sortingStatus = checkArraySortedStatus(marks3);
		
		System.out.println(sortingStatus);
		
	}
	
}
