package FrequencyOfElementsInArray;

// This code is suggested by ChatGPT
// This code is working for all test cases.

public class ArrayTest1 {

	 private static void frequencyOfElements(int[] marks) {
	        if (marks.length == 0) {
	            System.out.println("Array is empty!");
	            return;
	        }

	        int frequency = 1;
	        int i = 1;

	        while (i < marks.length) {
	            if (marks[i] == marks[i - 1]) {
	                frequency++;
	            } else {
	                System.out.println(marks[i - 1] + "   frequency is  " + frequency);
	                frequency = 1;  // Reset frequency
	            }
	            i++;
	        }

	        // Print the last element frequency
	        System.out.println(marks[i - 1] + "   frequency is  " + frequency);
	    }

	    public static void main(String[] args) {
			int[] marks = {20,20,30,30,30,40};                       // test cases
//			int[] marks = {20,20,30,30,30};                           // test cases
//			int[] marks = {20};   
	        
	        frequencyOfElements(marks);
	    }
	
}
