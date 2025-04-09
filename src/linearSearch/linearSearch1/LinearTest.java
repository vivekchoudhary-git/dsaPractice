package linearSearch.linearSearch1;

// Refer Youtube- Tap Academy
// Performing Linear Search

public class LinearTest {

	public static void main(String[] args) {
		
		int[] marks = {7,15,74,28,56,32,41,8,89,1};
		
		System.out.println("marks length   "+marks.length);
		
		Linear linear = new Linear();
		
		int a= 32;
		int result = linear.searchArray(marks, a);
		
		System.out.println(a+ "   is found at index  =   "+result);
		
	}
	
}
