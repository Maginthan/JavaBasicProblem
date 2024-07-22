package StringQuestions;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
	
		int vCount = 0, cCount = 0;
		
		input = input.toLowerCase();
		
		char[] vowels = {'a', 'e', 'i', 'o', 'u'};
		
		
		for(int i= 0; i<input.length(); i++) {
			if(input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u') {
				vCount++; 
			}else if(input.charAt(i)>='a' && input.charAt(i)<='z'){
				cCount++;
			}
		}
		
		System.out.println("The no of vowels in the input: "+ vCount);
		System.out.println("The no of consonants in the input: "+ cCount);
	}

}
