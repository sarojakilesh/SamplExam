package exceptions.basic;

public class MultiThread {
	 public static void main(String[] args)  {
	        int n = 8; // Number of threads
	        for (int i = 0; i < n; i++) {
	            MultithreadingDemo object
	                = new MultithreadingDemo();
	            (object).start();
	        }
	    }
	}
