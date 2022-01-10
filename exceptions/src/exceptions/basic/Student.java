package exceptions.basic;

public class Student {
	
	
	 String name; 
	 String coursename;
	   Integer id; 
	   Double fees;


public Student(int id, String name, String coursename, double coursefees) {
	// TODO Auto-generated constructor stub
	this.name= name;
	this.coursename=coursename;
	this.id=id;
	this.fees = coursefees;
 
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getCoursename() {
	return coursename;
}


public void setCoursename(String coursename) {
	this.coursename = coursename;
}


public Integer getId() {
	return id;
}


public void setId(Integer id) {
	this.id = id;
}


public Double getFees() {
	return fees;
}


public void setFees(Double fees) {
	this.fees = fees;
}


@Override
public String toString() {
	return "Student [name=" + name + ", coursename=" + coursename + ", id=" + id + ", fees=" + fees + "]";
}

}
	