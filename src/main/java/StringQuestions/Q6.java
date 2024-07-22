package StringQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the a word: ");
		Scanner sc = new Scanner(System.in);
		String input1 = sc.nextLine();
		input1 = input1.toLowerCase();
		
		System.out.println("Please enter another word: ");
		Scanner sc2 = new Scanner(System.in);
		String input2 = sc2.nextLine();
		input2 = input2.toLowerCase();
		
		if(input1.length() == input2.length()) {
			char[] inputCharArr2 = input2.toCharArray();
			char[] inputCharArr1 = input1.toCharArray();
			
			Arrays.sort(inputCharArr1);
			Arrays.sort(inputCharArr2);
			
			boolean result = Arrays.equals(inputCharArr1, inputCharArr2);
			
			if(result) {
				System.out.println("The given two words "+input1+ " and "+input2+ " are Anagram");
			}else {
				System.out.println("The given two words "+input1+ " and "+input2+ " are not Anagram");
			}
		}else {
			System.out.println("The given two words "+input1+ " and "+input2+ " are not Anagram");
		}
	}

}
