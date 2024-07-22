package ArrayQuestions;

import java.util.Arrays;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3, 8, 1, 2, 9, 11, 4, 19, 7};
		int len = arr.length;
		
		int[] output = Q2.reverseArr(arr, len);
		
		
		System.out.println("The reverses array is "+ Arrays.toString(output));
		
		
		
		
	}
	
	public static int[] reverseArr(int[] A, int len) {
		
		int[] out = new int[len];
		int index = 0;
		
		for(int i=len-1; i>=0; i--) {
			out[index] = A[i];
			index++;
		}
		return out;
	}

}
