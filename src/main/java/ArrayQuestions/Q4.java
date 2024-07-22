package ArrayQuestions;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 8, 1, 2, 9, 11, 4, 19, 7};
		int out = Q4.averageOfElements(arr);
		System.out.println("The average of all elements in array is: "+ out);
	}
	

	public static int averageOfElements(int[] arr) {
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum/arr.length;
	}
}

