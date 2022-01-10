package exceptions.basic;

import java.util.ArrayList;

public class Iterable {
	public static void main(String[] args)
    {
  
        // Declaring the ArrayList with
        // initial size n
        ArrayList<Integer> al
            = new ArrayList<Integer>();
  
        // Appending new elements at
        // the end of the list
         int i = 10;
            al.add(i);
  
        // Printing elements
        System.out.println(al);
  
        // Remove element at index 3
        al.remove(0);
  
        // Displaying the ArrayList
        // after deletion
        System.out.println(al);
  
        // Printing elements one by one
        // for (int i= 5; i > al.size(); i++)
            System.out.print(al.get(i) + " ");
    }

}
