package exceptions.basic;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String:");
		String str = s.nextLine();
		String result = StringWordsReverse.reverseStringWords(str);
		System.out.println("original string:"+str);
		System.out.println("reverse string:"+result);
		
	}

}
