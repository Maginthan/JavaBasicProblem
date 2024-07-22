package StringQuestions;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		String reversed = "";
		
		for(int i= input.length()-1; i>=0; i--) {
			reversed += input.charAt(i);
		}
		
		if(reversed.toLowerCase().equals(input.toLowerCase())) {
			System.out.println("The given word is a palindrome");
		}else {
			System.out.println("The given word is not a palindrome");
		}	
	}

}
