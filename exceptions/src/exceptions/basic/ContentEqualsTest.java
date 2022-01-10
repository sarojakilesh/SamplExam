package exceptions.basic;

public  class ContentEqualsTest {
	public static void main(String[] args) {
		
	
			String s1 = new String("a");
			String s2 = new String("a");
			//StringBuffer sb1 = new StringBuffer("a");
			
			System.out.println(s1.equals(s2));
			System.out.println(s1.contentEquals(s2));
			System.out.println();
			
			System.out.println(s2.equals(s1));
			System.out.println(s2.contentEquals(s1));
			
			
			System.out.println(s1==s2);
			System.out.println(s2==s1);
	}
	
}
