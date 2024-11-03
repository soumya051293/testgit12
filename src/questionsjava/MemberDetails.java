package questionsjava;


class Member 
{
	
	String Name;
	int Age;
	String Address;
    int Salary;
    
  public void Printdetails()
  {
	 System.out.println(Name);
	 System.out.println(Age);
	 System.out.println(Address);
	 System.out.println(Salary); 
  
  }
}



class Worker extends Member{
	String Specialization;
}
class Manager extends Member{
	String Department;
}

public class MemberDetails {

	public static void main(String[] args) {
	Worker w=new Worker();
	w.Name="Anu";
	w.Age=32;
	w.Address="abc";
	w.Salary=20000;
	w.Printdetails();
	w.Specialization="Selenium";
System.out.println(w.Specialization);

Manager m=new Manager();
m.Name="Alvin";
m.Age=32;
m.Address="dck";
m.Salary=30000;
m.Department="IT";
m.Printdetails();
System.out.println(m.Department);		

	}

}
