package FrequencyOfElementsInArray;

//Refer Youttube Tap Academy Playlist DSA  Playlist - 73/109
// Below code gets failed for the Test Case     int[] marks = {20,20,30,30,30};  

public class ArrayTest {

	private static void frequencyOfElements(int[] marks){
		
		int frequency = 1;
		int i = 1;
		
		while(i < marks.length){
			
			while(i < marks.length && marks[i] == marks[i-1]){
				
				frequency++;
				i++;
			}
			
			System.out.println(marks[i-1]+"   frequency is  "+frequency);
			frequency = 1;
			i++;
		}
		
		if(  marks.length == 1 || marks[i-1] != marks[i-2]){                                            // NOTE : The sequence of  OR condition
			
			System.out.println(marks[i-1]+"   frequency is  "+frequency);
		}
		
		
	}
	
	public static void main(String[] args) {
		
//		int[] marks = {20,20,30,30,30,40};                       // test cases
		int[] marks = {20,20,30,30,30};                           // test cases
//		int[] marks = {20};                                                   // test cases
		
		
		frequencyOfElements(marks);
		
	}
	
}
