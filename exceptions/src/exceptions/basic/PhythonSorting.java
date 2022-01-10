package exceptions.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PhythonSorting {
	public static void main(String[] args) {
		
	
	// public static void main(String... sortingWithList) {
	        List<Phython> phythons = new ArrayList<>();
	        phythons.add(new Phython("Home "));
	        phythons.add(new Phython("Mart "));
	        phythons.add(new Phython("Base "));
	        phythons.add(new Phython("Lice "));
	      //  list = Arrays.asList(student1, student2, student3, student4, student5);

	        Collections.sort(phythons);
	       phythons.stream().map(s -> s.name).forEach(System.out::print);

	        Collections.reverse(phythons);
	        phythons.stream().forEach(System.out::print);
	        //phythons.stream().map(s -> s.name).forEach(System.out::print);

	    }

	
}
