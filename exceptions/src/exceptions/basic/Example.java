package exceptions.basic;

import java.util.ArrayList;
import java.util.List;

public class Example {
public static void main(String[] args) {
	List<Student2> studentlist = new ArrayList<Student2>();
	studentlist.add(new Student2("Jon", 22, 1001)); 
    studentlist.add(new Student2("Steve", 19, 1003)); 
    studentlist.add(new Student2( "Kevin", 23, 1005)); 
    studentlist.add(new Student2("Ron", 20, 1010)); 
    studentlist.add(new Student2("Lucy", 18, 1111));
    System.out.println("Before Sorting the student data:"); 
    studentlist.forEach((s)->System.out.println(s));    //for Each loop
    
    System.out.println("After Sorting the student data by Age:"); 

    //Lambda expression for sorting by age 
    studentlist.sort((Student2 s1, Student2 s2)->s1.getId()-s2.getId());
    studentlist.forEach((s)->System.out.println(s)); 
    System.out.println("After Sorting the student data by Name:"); 
    //Lambda expression for sorting the list by student name       
    studentlist.sort((Student2 s1, Student2 s2)->s1.getName().compareTo(s2.getName())); 
    studentlist.forEach((s)->System.out.println(s));        

}
}
