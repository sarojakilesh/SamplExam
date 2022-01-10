package exceptions.basic;

public class ExceptionDemo {

	public static void m1() {
		System.out.println("Hi");
		int i =2;
		int j = 0;
		int result = i/j;
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		m1();
	}
}
