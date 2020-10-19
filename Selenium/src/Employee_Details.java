

/* Author: Venkata Sasidhar 
 * Date :-15-OCT-2020
 * Email:-sasi.63143@gmail.com*/


public class Employee_Details {
	
	int salary, employeeid;
	 String emailID, CompanyName,EmployeeName;
	 static String emailID1, ComapanyName1, EmployeeName1;
	 
	 /*Static Variable */
	 static String employeename1="VenkataSasidhar";
	
	void empdisplay()
	{
		System.out.println("The Employee Name is "+EmployeeName+" The Employee CompanyName is "+CompanyName+" The Employee EmailID is "+emailID+" The Employee Salary is "+salary+" The Employee EmployeeID is "+employeeid);
	}
	
	static void empdisplay1()
	{
		System.out.println("The Employee Name is "+EmployeeName1+" The Employee CompanyName is "+ComapanyName1+" The Employee EmailID is "+emailID1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
	//Static Method declaration.	
	System.out.println(employeename1);
	
	Employee_Details empname1=new Employee_Details();
	empname1.EmployeeName="VenkataSasidhar";
	empname1.CompanyName="TataConsulatancyServices";
	empname1.emailID="venkatachirla@gmail.com";
	empname1.salary=50000;
	empname1.employeeid=717367;
	
	
	
	Employee_Details empname2=new Employee_Details();
	empname2.EmployeeName="Sulochana";
	empname2.CompanyName="CenteneCorportaion";
	empname2.emailID="sulochana55@gmail.com";
	empname2.salary=60000;
	empname2.employeeid=718368;
	
	Employee_Details empname3=new Employee_Details();
	empname3.EmployeeName="Manikanta Chinnam";
	empname3.CompanyName="Allegis Group";
	empname3.emailID="ManikantaChinnam@gmail.com";
	empname3.salary=75000;
	empname3.employeeid=7247567;
	
	
	empname1.empdisplay();
	empname2.empdisplay();
	empname3.empdisplay();
	
	//System.out.println(employee1=)
	
	empdisplay1();

	}

}
