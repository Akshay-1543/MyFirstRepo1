package myOwnPract;

public class EmployeeInfo 
{
	 String empName;
	 int empId;
	 String role;
	 String emailId;
	 int age;
	 long mobno;
	public EmployeeInfo(String empName1, int empId1, String role1, String emailId1, int age1, long mobno1)
	{
	  empName = empName1;
	  empId = empId1;
	  role = role1;
	  emailId = emailId1;
	  age = age1;
	  mobno = mobno1;
	 }
	public void info()
	{
	 System.out.println("Your empname =" + empName + "\n" + "empId =" + empId + "\n" + "role =" + role + "\n" + "emailId =" + emailId + "\n" + "age =" + age + "\n" + "mobno =" + mobno);
	 }
	public static void main(String[] args)
	{ 
	 EmployeeInfo A = new EmployeeInfo("Akshay Jagtap", 648, "Junior Engineer", "jagtapakshay7682gmail.com", 23, 9689863785L);
	 A.info();
	 EmployeeInfo B = new EmployeeInfo("Rohan Shinde", 450, "Senior Engineer", "rohans234gmail.com", 30, 9679863785L);
	 B.info();
	 }
	}

