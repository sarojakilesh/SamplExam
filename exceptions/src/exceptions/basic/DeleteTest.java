package exceptions.basic;

public class DeleteTest { 
	public static void main(String[] args) {
		StringBuffer sb3 = new StringBuffer("My Name Is Akilesh");
		System.out.println("SB chars:" +sb3);
		sb3.delete(5, 13);
		System.out.println("SB chars:" +sb3);
		sb3 = new StringBuffer("My Name Is Akilesh");
		System.out.println("SB chars:" +sb3);
		sb3.delete(5, 12);
		sb3.deleteCharAt(4);
		System.out.println("SB chars:" +sb3);
		StringBuffer sb4 = new StringBuffer("abcdef");
		System.out.println("SB chars:" +sb4);
		sb4.deleteCharAt(1);
		sb4.deleteCharAt(0);
		System.out.println("SB chars:" +sb4);
		System.out.println();
		sb4.deleteCharAt(20);
		
	}

}
