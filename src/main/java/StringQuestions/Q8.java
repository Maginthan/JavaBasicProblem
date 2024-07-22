package StringQuestions;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter a sentence: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String output = "";
		
		for(int i=0; i<input.length(); i++) {
			char ch = input.charAt(i);
			
			if(!Character.isWhitespace(ch)) {
				output += ch;
			}
		}	
		
		System.out.println("The string with the removal if whitespaces are :"+ output);
	}

}
