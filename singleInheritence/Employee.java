package singleInheritence;
//Base Class Employee
public class Employee {
	int empId; 
	String empName;
	public void setData(int empId,String empName) {
		this.empId = empId;
		this.empName = empName;
	}
    public void getdata() {
	System.out.println("Employee Id :"+ " | "+ "Employee Name : "+empName + "|");
	
   }
    class Manager  extends Employee {
   String empDept;
   
	public void setDept(String empDep) {
		this.empDept = empDept;
	}
    public void getDept() {
    	System.out.println("Employee Department : " + empDept);
      }
	}
public class SingleInherit {
	public void main(String[] args) {
		Manager manager = new Manager();
		manager.setData(1234, "Mark Weiss");
		manager.setDept("QA");
		manager.getdata();
		manager.getDept();
		}
 }
}
