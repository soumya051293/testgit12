package oopsconcept;

public class StaticFinal {
	
	final String Schoolname="Luminar";
	static String Department="English";

	public static void main(String[] args) {
		System.out.println(StaticFinal.Department);
		System.out.println(StaticFinal.Department="Malayalam");
		StaticFinal ob=new StaticFinal();
		System.out.println(ob.Schoolname);
		
		
	}

}
