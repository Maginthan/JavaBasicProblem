package StringQuestions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the a word: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		//Variables to save the longest substring and count
		int longestSubStringCount = 0;
		String longestSubString = null;
		
		char[] inputArr = input.toCharArray();
		
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		
		for(int i=0; i<inputArr.length; i++) {
			char ch = inputArr[i];
			
			if(!map.containsKey(ch)) {
				map.put(ch, i);
			}else {
				i=map.get(ch);
				System.out.println("The i value is :"+ i);
				map.clear();
			}
			
			if(map.size() > longestSubStringCount) {
				longestSubStringCount = map.size();
				longestSubString = map.entrySet().toString();
			}
		}
		
		System.out.println("The longest substring with out repeating character is :"+ longestSubString);
		System.out.println("The longest substring count with out repeating character is :"+ longestSubStringCount);
	}

}
