package DSA;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class roman_to_integer {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roman number : ");
		String roman = sc.next();
		System.out.println(romanInteger(roman));
	}
	
	
	public static int romanInteger(String s) {
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('C', 100);
		map.put('L', 50);
		map.put('D', 500);
		map.put('M', 1000);
		
		int result = map.get(s.charAt(s.length()-1));
		
		for(int i = s.length()-2; i>=0; i--) {
			
			if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))) 
				result = result - map.get(s.charAt(i));
			else
				result = result + map.get(s.charAt(i));
			
		}
		
		return result;
	}

}
