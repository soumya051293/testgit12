package oopsconcept;

public class Finally {

	public static void main(String[] args) {
		System.out.println("Started");
try {
	int i=10;
	System.out.println(i/0);
}
catch(ArithmeticException e)
{
	System.out.println(e.getMessage());	
	
}
finally {
	System.out.println("This is Finally");
}
System.out.println("Stopped");

	}

}
