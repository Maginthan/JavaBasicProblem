package ArrayQuestions;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {6,7,8,9,10,11};
		int out = Q9.secondLargestInArray(arr);
		
		System.out.println("The second largest element in the array is: "+ out);
	}

	public static int secondLargestInArray(int[] arr) {
		int largest = arr[0];
		int secondLargest = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			}
		}
	
		return secondLargest;
	}
	
}
