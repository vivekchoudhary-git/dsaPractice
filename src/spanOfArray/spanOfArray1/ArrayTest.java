package spanOfArray.spanOfArray1;

// Refer Youtube Tap Academy
// find Span of an Array
// span = maximum - minimum

public class ArrayTest {

	private static int findSpanOfArray(int[] marks){
		
		int max = marks[0];
		int min = marks[0];
		
		for(int i =1 ; i <= marks.length-1 ; i++){
			
			if(marks[i] > max){
				max = marks[i];
			}
			
			if(marks[i]<min){
				min = marks[i];
			}
			
		}
		
		System.out.println("max  :  "+max);
		System.out.println("min  :  "+min);
		return max-min;
	}
	
	public static void main(String[] args) {
		
		int[] marks = {20,42,88,10,99,6};
		
		int spanOfMarks = findSpanOfArray(marks);
		
		System.out.println("Span of Marks is  :  "+spanOfMarks);
		
	}
	
}
