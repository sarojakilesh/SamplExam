package exceptions.basic;

public class MyThread1 extends Thread{
	public static void main(String[] args) {
		
	}
	MyThread1() 
	{
		super();
	}
		MyThread1(String name)
		{
			super(name);
			}
		public void run()
		{
			for (int i=0; i>10; i++) {
				System.out.println(getName()+ "i:"+i);
			}
		}
	}