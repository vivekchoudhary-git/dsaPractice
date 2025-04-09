package inverseOfArray;

// Refer Youtube Tap Academy DSA Playlist 69/109
// Inverse of Array means
// int[] a = {2,3,1,0,4};             a[0] =2 ,a[1] =3 ,a[2] =1 ,a[3] =0 ,a[4] =4 
// int[] b = {3,2,0,1,4};             b[0] =3 ,b[1] =2 ,b[2] =0 ,b[3] =1 ,b[4] =4 

import java.util.Arrays;

public class ArrayTest {

	private static int[] inverseArray(int[] a){
		
		// create new Array
		int[] b = new int[a.length];
		
		for(int i=0 ; i < a.length ; i++){
			
			int temp = a[i];
			b[temp] = i;
			
		}
		return b;
	}
	
	
	public static void main(String[] args) {
		
		int[] a = {2,3,1,0,4};
		
		System.out.println("---- Array Before Inverse");
		System.out.println(Arrays.toString(a));
		
		int[] b = inverseArray(a);
		
		System.out.println("---- Array After Inverse");
		System.out.println(Arrays.toString(b));
		
	}
	
}
