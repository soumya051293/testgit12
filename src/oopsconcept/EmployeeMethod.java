package oopsconcept;


//
public class EmployeeMethod {
	int Empid;
	int Salary;
	String Designation;


	/*
	 public void setvalues(int Empid,int Salary,String Designation) {
		this.Empid=id;
		this.Salary=Salary;
		this.Designation=Designation;
	
	} */
	
public void setvalues(int id,int Sal,String Design)

{
	 Empid=id;
	 Salary=Sal;
	 Designation=Design;
	 }
	 
	 
	
	public void display()
	{
	System.out.println("Empid="+Empid);
	System.out.println("Salary="+Salary);
	System.out.println("Designation="+Designation);
	}
	
	

	public static void main(String[] args){
		
	
		
		EmployeeMethod emp=new EmployeeMethod();
		emp.setvalues(102,20000,"Developer");
		emp.display();
		

	}
	}


