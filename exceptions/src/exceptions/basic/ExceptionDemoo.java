package exceptions.basic;

public class ExceptionDemoo {

		public static int m1(int a, int b) {

			
			
			try {
				System.out.println("try block");
				return a / b;
			} catch (ArithmeticException ae) {
				System.out.println("arthemetic");
				return a + b;
			}

		}

		public static void main(String[] args) {

			System.out.println(m1(5, 0));

		}
}
