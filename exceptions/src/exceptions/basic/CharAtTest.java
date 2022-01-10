package exceptions.basic;

public class CharAtTest {
	public static void main(String[] args) {
		String s1 = "abcdef";  //012345
		
		System.out.println(s1.charAt(1));   //b
		System.out.println(s1.charAt(3));   //d
		System.out.println(s1.charAt(5));   //f
		System.out.println(s1.charAt(0));   //a
		System.out.println(s1.charAt(1));   //0
		System.out.println(s1.charAt('a'));   //0
	}

}
