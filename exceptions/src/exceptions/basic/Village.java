package exceptions.basic;

public class Village {
private Integer empId;
private String name;
private String houseName;
private Double salary;
private Integer houseNo;

public Village(Integer empId,String name,String houseName,Double salary,Integer houseNo) {
	super();
	this.empId =empId;
	this.name= name;
	this.houseName=houseName;
	this.salary=salary;
	this.houseNo=houseNo;
}
public Village() {
	super();
	
}

public Integer getEmpId() {
	return empId;
}

public void setEmpId(Integer empId) {
	this.empId = empId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getHouseName() {
	return houseName;
}

public void setHouseName(String houseName) {
	this.houseName = houseName;
}

public Double getSalary() {
	return salary;
}

public void setSalary(Double salary) {
	this.salary = salary;
	
}
public Integer getHouseNo() {
	return houseNo;
}
public void setHouseNo(Integer houseNo) {
	this.houseNo = houseNo;
}
@Override
public String toString() {
	return "Village [empId=" + empId + ", name=" + name + ", houseName=" + houseName+ ", salary=" + salary + ", houseNo=" + houseNo +  "]";
	
}
}

