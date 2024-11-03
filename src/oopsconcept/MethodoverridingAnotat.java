package oopsconcept;

class Car
{
	public void speed() 
	{
		System.out.println("Car speed");
	}
	public void Power() 
	{
		System.out.println("Car power");
	}
}

class BMW extends Car
{
	
@Override
public void speed() {
	System.out.println("Bmw speed");
	super.speed();
}

@Override
public void Power() {
	System.out.println("Bmw power");
	super.Power();
}
}
public class MethodoverridingAnotat {

	public static void main(String[] args) {
		BMW obj=new BMW();
		obj.Power();
		obj.speed();

	}

}
