package myPrograms;

public class convertingStringNumberWithoutBuiltInFuctions {
public static void main(String[] args) {
	String str = "12345";
	int number = 0;
	for(int i = 0; i< str.length(); i++) {
		//Get character at position i
		char ch = str.charAt(i);
		//converting character to integer
		int num = ch - '0';
		number = number*10 + num;
	}
	System.out.println("Converting string to integer witout using built in functions : "+ number);
}
}
