package oopsconcept;

public class Encapsulation {
	
	private String name;
	private String designation;
	
	
	
	

	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public String getDesignation() {
		return designation;
	}





	public void setDesignation(String designation) {
		this.designation = designation;
	}





	public static void main(String[] args) {
		Encapsulation ob=new Encapsulation();
		ob.setName("Sonu");
		System.out.println(ob.getName());
		ob.setDesignation("Tester");
		System.out.println(ob.getDesignation());

	}

}
