package ArrayQuestions;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 8, 9, 2, 9, 11, 4, 19, 3};
		int[] out = Q7.removeDups(arr);
		
		String res = Arrays.toString(out);
		
		System.out.println("The result is: "+ res);
	}
	
	public static int[] removeDups(int[] arr) {
		
		
		Set<Integer> set = new LinkedHashSet<Integer>(); 
		
		for(int i=0; i<arr.length; i++) {
			//if(!set.contains(arr[i])){
				set.add(arr[i]);
			//}
		}
		
		int[] result = new int[set.size()];
		
		int j=0;
		for(Integer a: set) {
			result[j++] = a;
		}
		
		return result;
	}
	

}
