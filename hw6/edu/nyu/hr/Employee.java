package edu.nyu.hr;
import edu.nyu.hr.EmployeeType;

public class Employee extends Person {

	private EmployeeType empType;
	
	public EmployeeType getEmployeeType() {
		return this.empType;
	}
	
	public void setEmployeeType(EmployeeType anyEmployeeType) {
		this.empType = anyEmployeeType;
	}
}
