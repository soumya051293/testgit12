package oopsconcept;

//MultiLevel Inheritance
	
class DogA
	{
		public void Barking() 
		{
		System.out.println("DogA is Barking");
		}		
	}

class CatA extends DogA
    {
		public void Sleeping()
		   {
			System.out.println("CatA is Sleeping");
			}
	}

class Lion extends CatA
   {
		public void Running()
		   {
			System.out.println("Lion is Running");
			}
	}

	public class MultiLevelInheri {

	public static void main(String[] args) {
	CatA C=new CatA();
	C.Barking();
	C.Sleeping();
	Lion L=new Lion();
	L.Barking();
	L.Sleeping();
	L.Running();
	}

}
