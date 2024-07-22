package ArrayQuestions;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 8, 1, 2, 9, 11, 4, 19, 7};
		int target = 4;
		
		int indexOut = Q6.findIndex(arr, target);
		
		if(indexOut != -1) {
			System.out.println("The index of target element in the array is: "+ indexOut);
		}else {
			System.out.println("The target element is not in the array : "+ indexOut);
		}
		
		
	}
	
	public static int findIndex(int[] arr, int target) {
		
		int index = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == target) {
				index = i;
				System.out.println("The element index in array is: "+i);
				break;
			}else {
				index = -1;
			}
		}
		return index;
	}

}

