import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestArray {
	public static void main(String args[]){    
	     
		  List<Integer> al=new ArrayList<Integer>();//creating arraylist    
		  al.add((int) 25.00);//adding object in earliest    
		  al.add((int) 50.00);   
		  al.add((int) 75.00);    
		  al.add((int) 125.00);
		  //traversing elements using Iterator  
		  Iterator<Integer> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }    
		     
		} 
}
