package myPrograms;

public class multipleCharPrinting {
public static void main(String[] args) {
	String str = "a2b5c7";
	/*
	 * i=0 => a
	 * i=1 => 1 converting character into numeric.
	 * i=2 => b
	 * i=3 => 5 converting character into numeric.
	 * i=4 => c
	 * i=5 => 7 converting character into numeric.
	 */
	StringBuilder result = new StringBuilder();
	for(int i = 0; i<str.length(); i+=2) {
		
		char ch1 = str.charAt(i);
		Integer num = Character.getNumericValue(str.charAt(i+1));
		
		for(char j=0; j<num; j++) {
			result.append(ch1);
		}
	}
	System.out.println(result);
}
}
