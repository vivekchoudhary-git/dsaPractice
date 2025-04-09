package rotateArray;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayTest {

	public static void main(String[] args) {
		
		int[] marks = {1,2,3,4,5};
		
        System.out.println("--------- Array before Rotation ----------");
        System.out.println(Arrays.toString(marks));
        
        System.out.println("--------- Define K value ----------");
        
        Scanner sc = new Scanner(System.in);
         int k = sc.nextInt();
        
 //       RotateTechnique1 rt1 = new RotateTechnique1();
     
//        rt1.rotateArray(marks, k);
		
//        System.out.println("--------- Array after Rotation Technique 1 ----------");
 //       System.out.println(Arrays.toString(marks));
        
        RotateTechnique2 rt2 = new RotateTechnique2();
        
        rt2.rotateArray2(marks, k);
        
        System.out.println("--------- Array after Rotation Technique 2----------");
        System.out.println(Arrays.toString(marks));
        
	}
	
}
