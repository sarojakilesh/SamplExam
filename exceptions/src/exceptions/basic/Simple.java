package exceptions.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

		class Simple {
	 
		public static void main(String args[]){  
		  
		ArrayList<Student> al=new ArrayList<Student>();  
		al.add(new Student(101,"Vijay","rrdrg", 23000));  
		al.add(new Student(106,"Ajay","hygjhhjv", 27000));  
		al.add(new Student(105,"Jai","gcddfg", 2100));  
		  
		System.out.println("Sorting by Rollno");  
		  
		Collections.sort(al,new NameComparator());  
		Iterator<Student> itr=al.iterator();  
		while(itr.hasNext()){  
		Student st=(Student)itr.next();  
		System.out.println(st.id+" "+st.name+" "+st.coursename+" "+st.fees);  
		}  
		  
		System.out.println("Sorting by age");  
		  
		Collections.sort(al,new AgeComparator());  
		Iterator<Student> itr2=al.iterator();  
		while(itr2.hasNext()){  
		Student st=(Student)itr2.next();  
		System.out.println (st.id+" "+st.name+" "+st.coursename+" "+st.fees); 
		}  
		  
		  
		 
		}  
}
