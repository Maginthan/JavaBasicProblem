package ArrayQuestions;

import java.util.Arrays;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		
		System.out.println("The array elements before rotation is: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		
		//Function to call the rotate operation
		Q10.rotateRight(arr, 4);
		
		System.out.println();
	
		System.out.println("The array elements after rotation is: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	
	public static void rotateRight(int[] arr, int k) {
		for(int i=0; i<k; i++) {
			int temp = arr[arr.length-1];
			for(int j= arr.length-1; j>0; j--) {
				arr[j] = arr[j-1];
			}
			arr[0] = temp;
		}	
	}
}	
	
	



