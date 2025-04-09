package rotateArray;

// This method is not  very efficient for rotating the array.

// int[] marks = {1,2,3,4,5};

public class RotateTechnique1 {

	// in this method all elements will shift only once.
	public void rotationMethod1(int[] marks){
		
		int temp = marks[0];
		
		for(int i = 1 ; i < marks.length ; i++){
			
			marks[i-1] = marks[i];
		}
		
		marks[marks.length-1] = temp;
		
	}
	
	
	public int[] rotateArray(int[] marks,int k){
		
		if(k > marks.length){                            
			
			 k = k%marks.length;
		}else if(k < 0){                                    // logic to handle clockwise rotation (-ve)
			
			k = marks.length+k;
		}
		
		for(int i = 1 ; i  <= k ; i++){
			
			rotationMethod1(marks);
		}
		
		return marks;
	}
	
}
