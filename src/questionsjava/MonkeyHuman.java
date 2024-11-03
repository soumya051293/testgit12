package questionsjava;

class Monkey
{
	 void jump()
	 {
		 System.out.println("Jumping"); 
	 }
	 void bite()
	 {
		 System.out.println("Biting");
	 }		
}

interface BasicAnimal
{
	void cat();
	void sleep();
	
}
class Human extends Monkey implements BasicAnimal
{
	public void speak()
	{
		System.out.println("Speaking");
	}
	
	@Override
	public void cat() {
		 System.out.println("Eating");
		
	}

	@Override
	public void sleep() {
		 System.out.println("Sleeping");
		
	}
	
}

public class MonkeyHuman {

	public static void main(String[] args) {
	Human hm=new Human();
	hm.bite();
	hm.cat();
	hm.speak();
	hm.jump();
	hm.sleep();

	}

}
