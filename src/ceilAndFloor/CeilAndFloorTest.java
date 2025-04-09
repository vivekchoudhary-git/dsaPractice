package ceilAndFloor;

// Refer Youtube Tap Academy
// Array must be sorted if you want to use Binary Search

import java.util.Scanner;

//  	int[] marks = {19,23,56,61,72,88,92}; 

public class CeilAndFloorTest {

	private static int findCeil(int[] marks , int key){
		
		int n = marks.length;
		
		int low= 0;
		int high= n-1;
		
		while( low <= high){
			
			int mid = (low+high)/2;                           // this must be inside loop
			
			if(key == marks[mid]){
				
				return marks[mid];
				
			}else if(key < marks[mid]){
				
				high = mid-1;
				low = low;
				
			}else{
				
				low = mid+1;
				high = high;
			}
			
		}
		
		if(low > n-1){                                                     // this is done to avoid ArrayIndexOutOfBoundsException
			
			return -1;
		}
		
		return marks[low];
	}
	
	
	private static int findFloor(int[] marks , int key){
		
		int n = marks.length;
		
		int low= 0;
		int high= n-1;
		
		while( low <= high){
			
			int mid = (low+high)/2;           // this must be inside loop
			
			if(key == marks[mid]){
				
				return marks[mid];
				
			}else if(key < marks[mid]){
				
				high = mid-1;
				low = low;
				
			}else{
				
				low = mid+1;
				high = high;
			}
			
		}
		
       if(high < 0){                                                     // this is done to avoid ArrayIndexOutOfBoundsException
			
			return -1;
		}
		
		return marks[high];
	}
	
	public static void main(String[] args) {
		
		int[] marks = {19,23,56,61,72,88,92}; 
		
		System.out.println("------ Enter Key ----------");
		
	        Scanner sc = new Scanner(System.in);
	        
	        int key = sc.nextInt();
	        
	        int ceil = findCeil(marks,key);
	        
	        System.out.println("Ceil of  key  "+key+"  is  "+ceil);
	        
             int floor = findFloor(marks,key);
	        
	        System.out.println("Floor of  key  "+key+"  is  "+floor);
		
	}
	
}
