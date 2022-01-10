package exceptions.basic;
import java.util.TreeMap;

public class LambdaSorting {
	public static void main(String[] args) {

		TreeMap<Integer,String> m = new TreeMap<Integer,String>((o1, o2) -> (o1 > o2) ? 
                -1 : (o1 < o2) ? 1 : 0);
		
		m.put(1,"Surendra");
		m.put (4,"Akliesh");
		m.put (5,"Srinu");
		m.put(2,"Ramesh");
		m.put(3,"Venkatesh");
		System.out.println("Elements of arraylist:" + " after sorting:"  + m);
		
	
	
	}

}
