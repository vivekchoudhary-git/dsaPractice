package subArrayOfAnArray;

public class SubArrayTest {

	private static void allSubArrays(int[] marks){
		
		int i = 0;
		int j = i;
		
		for(i = 0 ; i < marks.length ; i++){
			
			for(j = i ; j < marks.length ; j++){
				
				for(int k = i ; k <= j ; k++){
					
					System.out.print(marks[k]+" ");
				}
				System.out.println();                                                           // for spacing 
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		int[] marks = {1,2,3,4,5};
		
		allSubArrays(marks);
		
	}
	
}
