	package exceptions.basic;
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;

	public class SortingTest1 {

		public static void main(String[] args) {
			SortingExample1 s1 = new SortingExample1(11, "on", 40000.00);
			SortingExample1 s2 = new SortingExample1(1, "on", 30000.00);
			SortingExample1 s3 = new SortingExample1(14, "on", 35000.00);
			SortingExample1 s4 = new SortingExample1(7, "on", 45000.00);
			List<SortingExample1> list = new ArrayList<SortingExample1>();
			list.add(s1);
			list.add(s2);
			list.add(s3);
			list.add(s4);
			Collections.sort(list);

			System.out.println(list);
		
	}
}
