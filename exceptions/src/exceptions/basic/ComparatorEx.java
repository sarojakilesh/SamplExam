package exceptions.basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

	 	 public class ComparatorEx {
		 public static void main(String[] args) {
		Student3 student1 = new Student3("surendra", "CSE", 98000.00);
		Student3 student2 = new Student3("ramesh", "IT", 67000.00);
		Student3 student3 = new Student3("akilesh", "CSE", 88000.00);
		Student3 student4 = new Student3("ganesh", "CIVIL", 67000.00);
		Student3 student5 = new Student3("rakesh", "CSE", 78000.00);
		Student3 student6 = new Student3("surendraAA", "IT", 88000.00);

		List<Student3> list = Arrays.asList(student1, student2, student3, student4, student5, student6);
		StudentsIDCompare sid = new StudentsIDCompare();
		Collections.sort(list, sid);
		System.out.println(list);
//		StudentNameSort  nameSort = new StudentNameSort();
//		Collections.sort(list,nameSort );
//		System.out.println(list);
	}
}


