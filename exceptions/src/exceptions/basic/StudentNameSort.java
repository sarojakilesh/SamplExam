package exceptions.basic;

import java.util.Comparator;

public class StudentNameSort implements Comparator<Student3> {

		@Override
		public int compare(Student3 o1, Student3 o2) {

			int names = o1.getName().compareTo(o2.getName());
			if (names == 0) {
				return (int) (o1.getFeees() - o2.getFeees());
			} else {
				return names;
			}
		}

	
}
