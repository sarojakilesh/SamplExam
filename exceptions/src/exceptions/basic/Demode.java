package exceptions.basic;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Demode implements Serializable {
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		public int a;
	    public String b;
	  
	    // Default constructor
	    public Demode(int a, String b)
	    {
	        this.a = a;
	        this.b = b;
	    }
	 
	
	    public static void main(String[] args)
	    {   
	        Demode object = new Demode(1, "geeksforgeeks");
	        // Serialization 
	        try
	        {   
	            //Saving of object in a file
	            FileOutputStream file = new FileOutputStream("C:\\Users\\ravis\\Desktop\\java.txt");
	            ObjectOutputStream out = new ObjectOutputStream(file);
	              
	            // Method for serialization of object
	            out.writeObject(object);
	              
	            out.close();
	            file.close();
	              
	            System.out.println("Object has been serialized");
	  
	        }
	          
	        catch(IOException ex)
	        {
	            System.out.println("IOException is caught");
	        }
	  
	        //System.out.println("ClassNotFoundException is caught");
	        }
	  
	    
	}


