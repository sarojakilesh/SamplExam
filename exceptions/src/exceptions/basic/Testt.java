package exceptions.basic;

public class Testt {
	
	    public static void main(String args[])
	    {
	        int a = 5;
	        int b = 10;
	  
	        // lambda expression to define the calculate method
	        Square s = (int x,int y)->x*y;
	       
	       new Thread (()-> {System.out.println("New thread created");}).start();
	        // parameter passed and return type must be
	        // same as defined in the prototype
	        int ans = s.calculate(a,b);
	        System.out.println(ans);                 
	    }
	
}
