package exceptions.basic;

import java.util.ArrayList;
//import java.util.Vector;
import java.util.Iterator;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class CollectionsDemo {
	public static void main(String[] args) {
		ArrayList <String>arraylist = new ArrayList<>();
		
		arraylist.add("Surendra");
		arraylist.add("Äkilesh");
		//arraylist.add(98.00);
		arraylist.add("Saroj");
		
		Iterator<String> itr=arraylist.iterator(); 
		while(( itr).hasNext()){  
		System.out.println(itr.next());  
		for (Object object : arraylist) {
			System.out.println(object);
		

		//Vector vector = new Vector<>();
		//vector.add("Hi");
		//vector.add(20);
		//System.out.println(vector);

		//for (Object object : vector) {
			//System.out.println(object);
		
		

	//private static void arraylist() {
		// TODO Auto-generated method stub
		
	}
		}
	}
}


