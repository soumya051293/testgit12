package oopsconcept;

//method without parameter and with return type
public class TriangleArea {

	public static void main(String[] args) {
  TriangleArea  ta=new TriangleArea ();
	System.out.println(ta.Area());

	}
	
public double Area() {
double l=5,b=3;
double h=0.5;
double t=h*(l*b);
return t;

	}

}
