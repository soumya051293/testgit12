package oopsconcept;

interface Whatsappcalls
{
	int a=10;
	void calls();
	void mute();
	void disconnect();
}

class Audiocalls implements Whatsappcalls
{

	@Override
	public void calls() {
		System.out.println("Whatsapp Calls");
		
	}

	@Override
	public void mute() {
		System.out.println("Calls Muted");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Calls Disconnected");
		
	}
	
	
	
	
	
}
 class Videocalls implements Whatsappcalls{

	@Override
	public void calls() {
		System.out.println("Whatsapp VideoCall");
		
	}

	@Override
	public void mute() {
		System.out.println("VideoCall Muted");
		
	}

	@Override
	public void disconnect() {
		System.out.println("VideoCall Disconnected ");
		
	}
	 
	 	 
 }
public class Interface {
	int b=20;

	public static void main(String[] args) {
		
		Audiocalls a=new Audiocalls();
		a.calls();
		a.mute();
		a.disconnect();
		Videocalls v=new Videocalls();
		v.calls();
		v.mute();
		v.disconnect();
		Whatsappcalls ob=new Audiocalls();
		ob.calls();
		ob.mute();
		ob.disconnect();
		ob=new Videocalls();
		ob.calls();
		ob.mute();
		ob.disconnect();
		System.out.println(Whatsappcalls.a);
		//System.out.println(Whatsappcalls.a=20);

	}

}
