package oopsconcept;

class Parent
//method overriding
{
	String name="abc";
	
	public void phone()
	{
		System.out.println("nokia");
	}
	}


class child extends Parent
{
	public void phone()
	{
		System.out.println(super.name);
		super.phone();
		System.out.println("iphone");
	}	
}





public class MethodoverridingSuper {

	public static void main(String[] args) {
		child c=new child();
		c.phone();

	}

}
