package exceptions.basic;


public class MyRunnable implements Runnable {
	public void run() {
		System.out.println("Run Threading not Excecuted");
	}
	
	public static void main(String[]args) {
		
		MyRunnable mr = new MyRunnable();
		Thread th = new Thread(mr);
		th.start();
		System.out.println("main Executed");
	}

}
