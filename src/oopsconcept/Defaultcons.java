package oopsconcept;

public class Defaultcons {
	
	
	int Empid;
	int Salary;
	String Designation;
	
	
	public Defaultcons()
	{
		Empid=100;
		Salary=40000;
		Designation="Designer";
	}
	

	public static void main(String[] args) {
		
		Defaultcons ob=new Defaultcons();
		System.out.println(ob.Empid);
		System.out.println(ob.Salary);
		System.out.println(ob.Designation);
	
	}

}
