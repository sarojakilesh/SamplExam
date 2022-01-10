package exceptions.basic;

public class CompareToTest {
	public static void main(String[] args) {
				String s1 = "a";
				String s2 = "a";
				String s3 = "A";
				
				System.out.println(s1.equals(s2)); //t
				System.out.println(s1==(s2));
				System.out.println(s1.compareTo(s2)); //0
				System.out.println(s1==(s3));
				
				System.out.println();
				
				System.out.println(s1.equals(s3)); //f
				System.out.println(s1.compareTo(s3));  //32
				System.out.println();
				
				System.out.println(s3.equals(s1)); //f
				System.out.println(s3.compareTo(s1));//-32
				System.out.println();
				
					System.out.println(s1.equalsIgnoreCase(s3));
					System.out.println(s1.compareToIgnoreCase(s3));
					System.out.println();
			
					String s4 = "abc";
					String s5 = "aBc";
				
					System.out.println(s4.equals(s5));  //f
					System.out.println(s4.compareTo(s5)); //32
					System.out.println(s4.compareToIgnoreCase(s5)); //0
					System.out.println();
						
	}

}
