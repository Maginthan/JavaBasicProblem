package StringQuestions;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		String reversed = "";
		
		for(int i= input.length()-1; i>=0; i--) {
			reversed += input.charAt(i);
		}
		System.out.println("The reversed word is "+reversed);
	}
	
}
