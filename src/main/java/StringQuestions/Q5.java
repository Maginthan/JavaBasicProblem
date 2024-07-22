package StringQuestions;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		char[] inputArr = input.toCharArray();

		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for(int i=0; i<input.length(); i++) {
			set.add(input.charAt(i));
		}
		
		System.out.println("The string removing duplicates are :"+ set);
	}

}
