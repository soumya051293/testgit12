package oopsconcept;

//method with parameter and with return type
public class RectangleArea {
		 
		public int area(int l,int b) 
		{
			int r=l*b;
			return r;
		}
		
		public static void main(String[] args) {
			RectangleArea mc=new  RectangleArea();
			 System.out.println(mc.area(4, 2));

	}

}
