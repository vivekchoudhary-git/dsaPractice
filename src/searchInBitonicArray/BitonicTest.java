package searchInBitonicArray;

import java.util.Scanner;

public class BitonicTest {

	public static void main(String[] args) {
		
		int[] marks = {5,6,7,8,9,10,3,2,1};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--------- Enter Key ---------------");
		
		int key = sc.nextInt();
		
		Bitonic bitonic = new Bitonic();
		
		int bitIndex = bitonic.findBitonicIndex(marks);
		
		System.out.println("bitonic index is  :  "+bitIndex);
		
		int keyIndex = bitonic.searchBitonic(marks, key, bitIndex);
		
		System.out.println("The key is present in the Array at Index  :   "+keyIndex);
		
	}
	
}
