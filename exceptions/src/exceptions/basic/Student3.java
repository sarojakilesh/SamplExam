package exceptions.basic;

public class Student3 {
	String name;
	String coursenamee;
	double feees;
	
	

	public Student3(String name, String coursenamee, double feees) {
		// TODO Auto-generated constructor stub
		this.name= name;
		this.coursenamee=coursenamee;
		this.feees=feees;
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCoursenamee() {
		return coursenamee;
	}


	public void setCoursenamee(String coursenamee) {
		this.coursenamee = coursenamee;
	}


	public double getFeees() {
		return feees;
	}


	public void setFeees(double feees) {
		this.feees = feees;
	}


	@Override
	public String toString() {
		return "Student3 [name=" + name + ", coursenamee=" + coursenamee + ", feees=" + feees + "]";
	}
	

}
