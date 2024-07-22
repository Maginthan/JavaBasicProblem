package StringQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the a word: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		char[] inputArr = input.toCharArray();
		
		
		Map<Character, Integer> hashMap = new HashMap<Character, Integer>();
		
		for(char c: inputArr) {
			if(hashMap.containsKey(c)) {
				hashMap.put(c, hashMap.get(c) + 1);
			}else {
				hashMap.put(c, 1);
			}
		}
		
		for(Map.Entry entry: hashMap.entrySet()) {
			System.out.println(entry.getKey()+ " "+ entry.getValue());
		}
		
	}

}
