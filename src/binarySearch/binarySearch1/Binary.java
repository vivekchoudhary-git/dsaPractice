package binarySearch.binarySearch1;

// int[] sortedMarks = {1,7,8,15,28,32,41,56,74,89};

public class Binary {

	public int searchByBinary(int[] sortedMarks, int key){
		
	    int n= sortedMarks.length;
		
	    int low = 0; 
	    int high = n-1;
	    int mid = 0;
		
	    while(low <= high){
	    	
	    	mid = (low+high)/2;
	    	
	    	if(key == sortedMarks[mid]){
	    		
	    		return  mid;
	    		
	    	}else if(key < sortedMarks[mid]){
	    		
	    		high= mid-1;
	    		low = low;
	    		
	    	}else
	    	{
	    		low= mid+1;
	    		high=high;
	    	}
	    
	    }
		return -1;
	    
	}
	
}
