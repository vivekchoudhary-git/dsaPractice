package selectionSort.selectionSort1;

// int[] marks= {4,1,5,2,3};

public class Selection {

	public int[] selectionSortAsc(int[] marks){
		
		int n = marks.length;
		
		for(int i=0 ; i < n-1 ; i++){
			
			int smallestIndex = i;
			
			for(int j = i+1 ; j < n ; j++){
				
				if(marks[j] < marks[smallestIndex]){
					
					smallestIndex = j;
				}
				
			}
			// swap values
			int temp = marks[i];
			marks[i] = marks[smallestIndex];
			marks[smallestIndex] = temp;
		}
		
		return marks;
	}
	
	
public int[] selectionSortDesc(int[] marks){
		
		int n = marks.length;
		
		for(int i=0 ; i < n-1 ; i++){
			
			int highestIndex = i;
			
			for(int j = i+1 ; j < n ; j++){
				
				if(marks[j] > marks[highestIndex]){
					
					highestIndex = j;
				}
				
			}
			// swap values
			int temp = marks[i];
			marks[i] = marks[highestIndex];
			marks[highestIndex] = temp;
		}
		
		return marks;
	}
	
	
	
	
}
