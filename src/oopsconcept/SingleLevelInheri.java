package oopsconcept;

//SingleLevel Inheritance

class Dog 
{
	public void barking()
	   {
		System.out.println("Dog is barking");
		}
}

class Cat extends Dog{

	
	public void Sleeping()
	   {
		System.out.println("Cat is Sleeping");
		}

}

public class SingleLevelInheri {
	
	public static void main(String[] args) {
		Cat C=new Cat();
		C.barking();
		C.Sleeping();

	}

}
