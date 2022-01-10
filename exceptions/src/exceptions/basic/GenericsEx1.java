package exceptions.basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericsEx1 {
	public static void main(String[] args) {
		List<Village> list = new ArrayList<>();
		list.add(new Village(001, "Surendra", "Goud", 29000.00, 22));
		list.add(new Village(002, "Ramesh", "Yadav", 30000.00, 23));
		list.add(new Village(003, "Srinivas", "Saroj", 31000.00, 24));
		list.add(new Village(004, "Akilesh", "Chauhan", 32000.00, 25));
		list.add(new Village(005, "Ravi", "Pandit", 33000.00, 26));
		list.add(new Village(006, "Narendra", "Goud", 29000.00, 27));
		list.add(new Village(007, "samesh", "Yadav", 30000.00, 28));
		list.add(new Village(010, "Suresh", "Saroj", 31000.00, 29));
		list.add(new Village(011, "Ashwam", "Chauhan", 32000.00, 30));
		list.add(new Village(012, "Chandan", "Pandit", 33000.00, 31));
		list.add(new Village(013, "Suraj", "Goud", 29000.00, 32));
		list.add(new Village(014, "Ayush", "Yadav", 30000.00, 33));
		list.add(new Village(015, "Ayansh", "Saroj", 31000.00, 34));
		list.add(new Village(016, "Aradhya", "Chauhan", 32000.00, 35));
		list.add(new Village(017, "Drish", "Pandit", 33000.00, 36));
		list.add(new Village(020, "Laksh", "Goud", 29000.00, 37));
		list.add(new Village(021, "Jairam", "Yadav", 30000.00, 38));
		list.add(new Village(022, "Sreekanth", "Saroj", 31000.00, 39));
		list.add(new Village(023, "Ajay", "Chauhan", 32000.00, 40));
		list.add(new Village(024, "Siddu", "Pandit", 33000.00, 41));
		int i = 0;
		int j = 0;
		int k = 0;
		int l = 0;
		int m = 0;
		Iterator<Village> itr = list.iterator();
		while (itr.hasNext()) {
			Village village = (Village) itr.next();

			if (village.getHouseName().equals("Goud") && village.getSalary() >= 29000) {
				i++;

				System.out.println("These are Goud Family " + village);

			} else if (village.getHouseName().equals("Yadav") && village.getSalary() <= 30000) {
				j++;
				System.out.println("These are Yadav Family " + village);

			} else if (village.getHouseName().equals("Saroj") && village.getSalary() <= 31000) {
				k++;
				System.out.println("These are Saroj Family " + village);

			} else if (village.getHouseName().equals("Chauhan") && village.getSalary() <= 32000) {
				l++;
				System.out.println("These are Chauhan Family " + village);

			} else if (village.getHouseName().equals("Pandit") && village.getSalary() <= 33000) {
				m++;
				System.out.println("These are Pandit Family " + village);
			}
		}

		System.out.println("Total number off Goud familys are :" + i);
		System.out.println("Total number off  Yadav familys are :" + j);
		System.out.println("Total number off Goud familys are :" + k);
		System.out.println("Total number off  Yadav familys are :" + l);
		System.out.println("Total number off Goud familys are :" + m);

	}

}
