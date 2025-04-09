package linearSearch.linearSearch1;

public class Linear {

	public int searchArray(int[] marks, int a){
		
		for(int i=0 ; i<=marks.length-1 ; i++){
			
			if(a == marks[i]){
				
				return i;
			}
		}
		
		return -1;
	}
	
}
