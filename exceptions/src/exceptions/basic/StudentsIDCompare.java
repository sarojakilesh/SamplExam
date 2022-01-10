package exceptions.basic;

import java.util.Comparator;

public class StudentsIDCompare implements Comparator<Student3> {

		@Override
		public int compare(Student3 o1, Student3 o2) {
			return (int) (((Student3) o1).getFeees() - ((Student3) o2).getFeees());
		}

	}

