package exceptions.basic;

public class Student2 {
	
	String Name; 
	Integer Id; 
	Integer Fees;
	
	public Student2(String Name, int Id, int Fees) {
		// TODO Auto-generated constructor stub
		this.Name = Name;
		this.Id = Id;
		this.Fees = Fees;
	
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Integer getFees() {
		return Fees;
	}

	public void setFees(Integer fees) {
		Fees = fees;
	}

	@Override
	public String toString() {
		return "Student2 [Name=" + Name + ", Id=" + Id + ", Fees=" + Fees + "]";
	}
	
}
