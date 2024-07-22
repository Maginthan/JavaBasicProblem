package ArrayQuestions;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 8, 1, 2, 9, 11, 4, 19, 7};
		int target = 21;
		
		boolean out = Q5.isElementPresent(arr, target);
		
		if(out) {
			System.out.println("The target element " + target + " is found in the array");
		}else {
			System.out.println("The target element " + target + " is not found in the array");
		}
		
	}
	
	public static boolean isElementPresent(int[] arr, int target) {
		
		boolean found = false;
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i] == target) {
				System.out.println("The element is found in array: "+arr[i]);
				found = true;
				break;
			}
			else {
				found = false;
			}
			
		}
		return found;
		
		
	}

}
