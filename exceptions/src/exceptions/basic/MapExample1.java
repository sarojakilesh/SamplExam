package exceptions.basic;

import java.util.HashMap;
import java.util.Map;

 class MapExample1 {

	
	public static void main(String[] args) {

		Map<Integer, Student> map1 = new HashMap<>();
		map1.put(1, new Student(102, "Surendra", "CSE", 29000.00));
		map1.put(2, new Student(110, "Ramesh", "IT", 30000.00));
		map1.put(55, new Student(119, "Srinivas", "IT", 30000.00));
		map1.put(9, new Student(126, "Akilesh", "CSE", 29000.00));
		map1.put(16, new Student(129, "Ravi", "CSE", 29000.00));
		map1.put(6, new Student(142, "Ayan", "IT", 30000.00));
		map1.put(7, new Student(149, "Anjali", "IT", 30000.00));
		map1.put(8, new Student(158, "Aradhya", "CSE", 29000.00));
	
		for (Integer k : map1.keySet()) {
			System.out.println(k);
		}
		for (Student v : map1.values()) {
				//if(v.getCourseName().equals("CSE")) {
				//if(v.getCourseName().equals("IT")) {
				//if(v.getFees()>29000) {
				if(v.getFees()<30000)   {
			System.out.println(v);
			
		}
		
			
		}
		}
		
		
		
}