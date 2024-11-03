package oopsconcept;

//Hierarchical Inheritance

class DogAB
{
	public void Barking() 
	{
	System.out.println("DogAB is Barking");
	}		
}

class CatAB extends DogAB
{
	public void Sleeping()
	   {
		System.out.println("CatAB is Sleeping");
		}
}

class LionA extends DogAB
{
	public void Running()
	   {
		System.out.println("LionA is Running");
		}
}


public class HierarchialInheri {

	public static void main(String[] args) 
	{
		CatAB C=new CatAB();
		C.Barking();
		C.Sleeping();
		LionA L=new LionA();
		L.Barking();
		L.Running();
		
	}

}
