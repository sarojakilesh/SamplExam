package exceptions.basic;
import java.util.ArrayList;

public class TestSort{  
		public static void main(String args[]){  
		ArrayList<Student2> al=new ArrayList<Student2>();  
		al.add(new Student2("Vijay",23, 101));  
		al.add(new Student2("Ajay",27, 106));  
		al.add(new Student2("Jai",21, 105));  
		  
		//Collections.sort((List<T>) al);  
		for(Student2 st:al){  
		System.out.println(st.Name+" "+st.Fees+" "+st.Id);  
		}  
		  
		}  
}
