package oopsconcept;



public class MethodoverLoading {
	public void add(int a,int b) 
	{	
	int c=a+b;
	System.out.println(c);
	}
	public void add(int a,int b,int c) 
	{	
	int d=a+b+c;
	System.out.println(d);
	}
	
	
	public static void main(String[] args) {
		MethodoverLoading ol=new MethodoverLoading ();
		ol.add(4, 6);
		ol.add(8, 4, 3);

	}

}
