package exceptions.basic;

import java.util.ArrayList;
import java.util.Iterator;

public class TestGenerics {
public static void main(String[] args) {
	ArrayList <String> list = new ArrayList<String>();
	list.add("Akilesh");
	list.add("Saroj");
	String s = list.get(0);
	System.out.println("Element is:" + s);
	Iterator<String> itr = list.iterator();
	while (itr.hasNext()){
		System.out.println(itr.next());
	}
}
}
