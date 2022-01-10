package exceptions.basic;

public class Student4 {
    Integer id;
	String Name; 
	String Coursename;
	Integer feeees; 
	
	
	public Student4(int id, String Name, String Coursename, int feeees) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.Name = Name; 
		this.Coursename=Coursename;
		this.feeees = feeees; 
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getCoursename() {
		return Coursename;
	}


	public void setCoursename(String coursename) {
		Coursename = coursename;
	}


	public Integer getFeeees() {
		return feeees;
	}


	public void setFeeees(Integer feeees) {
		this.feeees = feeees;
	}


	@Override
	public String toString() {
		return "Student4 [Coursename=" + Coursename + ", feeees=" + feeees + ", id=" + id + ", Name=" + Name + "]";
	}
	
	
		


	

	

}
