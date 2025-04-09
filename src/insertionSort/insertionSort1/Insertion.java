package insertionSort.insertionSort1;

// int[] marks = {7,8,3,1,2};

public class Insertion {

	public int[] insertionSortAscending(int[] marks){
		
		int n = marks.length;
		
		for(int i=1 ; i < n ; i++){
			
			int current = marks[i];
			int j = i-1;
			
			while(j>=0 && current < marks[j]){
				
				marks[j+1] = marks[j];
				j-- ;
			}
			
			marks[j+1] = current;
		}
		
		return marks;
	}
	
	
public int[] insertionSortDescending(int[] marks){
		
		int n = marks.length;
		
		for(int i=1 ; i < n ; i++){
			
			int current = marks[i];
			int j = i-1;
			
			while(j>=0 && current > marks[j]){
				
				marks[j+1] = marks[j];
				j-- ;
			}
			
			marks[j+1] = current;
		}
		
		return marks;
	}
	
}
