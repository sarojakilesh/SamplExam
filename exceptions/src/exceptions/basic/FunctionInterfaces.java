package exceptions.basic;

public class FunctionInterfaces {
	 public static void main(String args[])
	  {
	  
	    // lambda expression to create the object
		 	new Thread(()->
	       {System.out.println("New thread created");}
	       ).start();
		 	new Thread(()->	 	
		 	{System.out.println("Old thread created");}
		 	).start();
	  }
}


