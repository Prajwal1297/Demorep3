package classobjectencapsulation;

class Employeeencap {
	private String empId;
	private String empName;
	private String emailId;
	private long phoneNumber;
	private double salary;

	public void setEmpID(String empId) {
		this.empId = empId;
	}

	public String getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpNmae(String empNmae) {
		this.empName = empName;
	}

	public String getEmailId() {
		return emailId;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

public  class EmployeeEncapsulation {

	public void main(String[] args) {
		
		Employeencap ec2 = new Employee("ES6054", "Praju","praju@.gmailcom",1234567890,369852.6);
				
		
     	}
	}
}
