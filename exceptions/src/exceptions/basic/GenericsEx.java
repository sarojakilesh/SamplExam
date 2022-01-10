package exceptions.basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericsEx {

	

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student(001, "Surendra", "CSE", 29000.00));
		list.add(new Student(002, "Ramesh", "IT", 30000.00));
		list.add(new Student(003, "Srinivas", "IT", 30000.00));
		list.add(new Student(004, "Akilesh", "CSE", 29000.00));
		list.add(new Student(005, "Ravi", "CSE", 29000.00));
		list.add(new Student(006, "Ayan", "IT", 30000.00));
		list.add(new Student(007, "Anjali", "IT", 30000.00));
		list.add(new Student(010, "Aradhya", "CSE", 29000.00));
		list.add(new Student(011, "Drishu", "CSE", 29000.00));
		list.add(new Student(012, "laksh", "IT", 30000.00));
		list.add(new Student(013, "Abhinav", "IT", 30000.00));
		list.add(new Student(014, "Abhi", "CSE", 29000.00));
		list.add(new Student(015, "Suhani", "CSE", 29000.00));
		list.add(new Student(016, "Shivangi", "IT", 30000.00));
		list.add(new Student(017, "Lado", "IT", 30000.00));
		list.add(new Student(020, "Ayush", "CSE", 29000.00));
		list.add(new Student(021, "Sowmya", "CSE", 29000.00));
		list.add(new Student(022, "Ishitha", "IT", 30000.00));
		list.add(new Student(023, "Goodluck", "IT", 30000.00));
		list.add(new Student(024, "Shivam", "CSE", 29000.00));

		int i = 0;
		int j = 0;
		Iterator<Student> itr = list.iterator();

		while (itr.hasNext()) {

			Student student = (Student) itr.next();

			if (student.getCoursename().equals("CSE") && student.getFees() < 30000) {
				i++;
				System.out.println("These are CSE Students " + student);

			} else if (student.getCoursename().equals("IT") && student.getFees() > 29000) {
				j++;
				System.out.println("These are IT Students " + student);
			}

		}
		System.out.println("Total number off IT students are :" + j);
		System.out.println("Total number off  CSE students are :" + i);
	}
}