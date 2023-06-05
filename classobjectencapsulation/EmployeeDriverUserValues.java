package classobjectencapsulation;
import java.util.Scanner;

public class EmployeeDriverUserValues {
	
	String empId;
	String empName;
	String emailId;
	long phoneNumber;
	double salary;
	
	public void setEmployeeDetailes(String id, String name, String emailid, long phon, double salary) {
		empId = id ;
		empName = name ;
		emailId = emailId;
		phoneNumber = phon;
		salary = salary;
	}
      public void getEmployeeDetailes() {
    	  System.out.println("EmpId :" + empId);
    	  System.out.println("EmployeeName :" + empName);
    	  System.out.println("EmployeeemailId :" + emailId);
    	  System.out.println("EmployeephoneNumber :" + phoneNumber);
    	  System.out.println("Employeesalary :" + salary);
      }
	public static void main(String[] args) {
		 String id, name, emailid;
		 long phoneno;
		 double sal;
		 
		 Scanner scan = new Scanner(System.in);
		 
		 Employee employees = new Employee();
		  System.out.println("EmployeeId");
		  id = scan.next();
		  
		  System.out.println("EmpName");
		  name = scan.next();
		  
		  System.out.println("Employee email");
		  emailid = scan.next();
		  
		  System.out.println("Employee phoneno");
		  phoneno = scan.nextLong();
		  
		  System.out.println("Employee salary");
		  sal = scan.nextDouble();
		  
        
	}

}
