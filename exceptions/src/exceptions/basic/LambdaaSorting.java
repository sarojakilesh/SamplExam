package exceptions.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaaSorting {
	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();
		
		Student student1 = new Student(101, "Surendra", "JAVA", 20000.00);
		Student student2 = new Student(102, "Akliesh", "IT", 20000.00);
		Student student3 = new Student(103, "Srinu", "JAVA", 20000.00);
		Student student4 = new Student(104, "Ramesh", "JAVA", 20000.00);
		Student student5 = new Student(105, "Venkatesh", "JAVA", 20000.00);
		list = Arrays.asList(student1, student2, student3, student4, student5);
		System.out.println("List before sorting ");
		System.out.println(list);
		System.out.println("=====================================================");
		System.out.println("List after sorting ");
		list.sort((Student s1, Student s2) -> s1.getName().compareTo(s2.getName()));
		System.out.println(list);

	}
}


