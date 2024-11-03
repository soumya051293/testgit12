package questionsjava;

class ClassRoom{
	
	String DataMember;
	String Name;
	int Rollnumber;
	int Mark;
	
	public void Assignvalues(String Dm,String name,int Rn,int mark)

	{
		DataMember=Dm;
		Name=name;
		Rollnumber=Rn;
		Mark=mark;
		 }
	
	public void Printdetails()
	{
		 System.out.println("Datamember= "+DataMember);
		 System.out.println("Name= "+Name);
		 System.out.println("RollNumber= "+Rollnumber);
		 System.out.println("Mark= "+Mark); 
	}
	
}
public class ClassRoomDetails {

	public static void main(String[] args) {
		
ClassRoom classroom=new ClassRoom();
classroom.Assignvalues("Student", "Anu", 20, 89);
classroom.Printdetails();


	}
}