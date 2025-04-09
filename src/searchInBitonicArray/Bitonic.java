package searchInBitonicArray;

// int[] marks = {5,6,7,8,9,10,3,2,1};

public class Bitonic {

	public int findBitonicIndex(int[] marks){
		
		int n = marks.length;
		int low = 0;
		int high= n-1;
		
		while(low <=high){
			
			int mid= (low+high)/2;
			
			if(marks[mid] > marks[mid-1] && marks[mid] > marks[mid+1]){
				
				return mid;
			}else if (marks[mid] <marks[mid+1]){
				low = mid;
				high =high;
			}else
			{
				high= mid;
				low=low;
			}
			
		}
		
		return -1;
	}

	
	public static int acendingBinarySearch(int[] marks,int key, int bitIndex){
		
		int low=0;
		int high= bitIndex-1;
		
		while(low<=high){
			
			int mid = (low+high)/2;
			
			if(key==marks[mid]){
				
				return mid;
			}else if(key < marks[mid]){
			
				high= mid-1;
			    low= low;
		}else{
			low = mid+1;
			high=high;
		}
		
	}
	
		return -1;
}
	
    public static int descendingBinarySearch(int[] marks,int key, int bitIndex){
		
		int low=bitIndex+1;
		int high= marks.length-1;
		
		while(low<=high){
			
			int mid = (low+high)/2;
			
			if(key==marks[mid]){
				
				return mid;
			}else if(key < marks[mid]){
			
				low= mid+1;
				high= high;
		}else{
			
			high=mid-1;
			low=low;
		}
		
	}
	
		return -1;
}
	
    
    public int searchBitonic(int[] marks, int key, int bitIndex){
    	
    	if(key == marks[bitIndex]){
    		
    		return bitIndex;
    	}else if (key > marks[bitIndex]){
    		
    		return -1;
    	}
    	
    	int keyIndex = acendingBinarySearch(marks, key, bitIndex);
    	if(keyIndex != -1){
    		return keyIndex;
    	}else
    	{
    		 keyIndex = descendingBinarySearch(marks, key, bitIndex);
    		return keyIndex;
    	}
    	
    }
    
    
} 