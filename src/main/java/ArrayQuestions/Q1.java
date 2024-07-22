package ArrayQuestions;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 8, 1, 2, 9, 11, 4, 19, 7};
		int len = arr.length;
		
		int minVal = Q1.findMin(arr, len);
		int maxVal = Q1.findMax(arr, len);
		
		System.out.println("The minimum element in the array is :"+minVal);
		System.out.println("The maximum element in the array is :"+maxVal);
	}
	
	
	//Function to find the min value
	public static int findMin(int[] A,int N) {
		int min = A[0];
		for(int i=0; i<A.length; i++) {
			if(A[i] < min) {
				min = A[i];
			}
		}
		return min;
	}
	
	//Function to find the max value
	public static int findMax(int[] A,int N) {
		int max = A[0];
		for(int i=0; i<A.length; i++) {
			if(A[i] > max) {
				max = A[i];
			}
		}
		return max;
	}
}
