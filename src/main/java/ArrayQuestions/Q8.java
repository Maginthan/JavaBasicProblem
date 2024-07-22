package ArrayQuestions;

import java.util.Arrays;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {6,7,8,9,10};
		
		String out =  Arrays.toString(Q8.mergeArrays(arr1, arr2));
		
		System.out.println("The merging of two arrays are : "+ out);
		
	}
	public static int[] mergeArrays(int[] arr1, int[] arr2) {
		
		int count = 0;
		int[] arr3= new int[arr1.length + arr2.length];
		
		for(int i=0; i<arr1.length; i++) {
			arr3[count] = arr1[i];
			count++;
		}
		
		for(int j=0; j<arr2.length; j++) {
			arr3[count++] = arr2[j];
		}
		return arr3;
	}

}
