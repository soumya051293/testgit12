package oopsconcept;

public class Employee {
	
	String empname;
	int empid;
	int salary;
	String designation;
	
	public void display()
	{
		System.out.println(empname);
		System.out.println(empid);
		System.out.println(salary);
		System.out.println(designation);	
		
	}

	public static void main(String[] args) {
		
		Employee ob=new Employee();
		ob.empname="Nimi";
		ob.empid=101;
		ob.salary=25000;
		ob.designation="accountant";
		ob.display();
		
	}

}
