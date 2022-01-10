package exceptions.basic;

import java.io.FileNotFoundException;

public class ExceptionMsg {

	static int a[] = {9,8};
	public static void m1() throws FileNotFoundException {
try {
		System.out.println(a[0]);
		}catch (Exception e) {
			System.out.println(a[1]);
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		m1();
	}
}
