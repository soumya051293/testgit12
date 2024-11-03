package oopsconcept;
//pasing value to variables using constructor
public class Parametercons {
	
	int Empid;
	int Salary;
	String Designation;
	
	
	public Parametercons(int id,int sal,String design)//constructor passing args (Empid,Salary,Designation)
	{
		Empid=id; //this.Emid; to refer we use this pointer
		Salary=sal;
		Designation=design;
	}

	public static void main(String[] args) {
		Parametercons ob=new Parametercons(100,35000,"Developer");
		System.out.println(ob.Empid);
		System.out.println(ob.Salary);
		System.out.println(ob.Designation);

	}

}
