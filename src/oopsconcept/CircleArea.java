package oopsconcept;

//method without parameter and without return type
public class CircleArea {

	public void Area() 
	{
		int r=3;
		double p=3.14;
		double a=p*r*r;
		System.out.println(a);
	}

	public static void main(String[] args) {
		CircleArea ca=new CircleArea();
		ca.Area();

	}

}
