package rotateArray;

// This method is more efficient for rotating the Array

// int[] marks = {1,2,3,4,5};

public class RotateTechnique2 {

	private static void reverseArray(int[] marks,int start,int end){
		
		int i = start;
		int j = end;
		
		while(i <= j){
			
			int temp = marks[i];
			marks[i] = marks[j];
			marks[j] = temp;
			i++;
			j--;
		}
		
	}
	
	public void rotateArray2(int[] marks,int k){
		
		reverseArray(marks,0,k-1);
		reverseArray(marks,k,marks.length-1);
		reverseArray(marks,0,marks.length-1);

	}
	
}
