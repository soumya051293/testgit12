package newpack24;

public class Logicaloperators {

	public static void main(String[] args) {
		
/*  A       B      A&&B    A||B   !A		
	1       1       1       1      0
 	1       0       0       1      0   
	0       1       0       1      1
	0	    0       0       0      1  */
boolean x=true;
boolean y=false	;	
		
	System.out.println(x&&y);	
		System.out.println(x||y);	
		System.out.println(!x);	
		System.out.println(!y);	
		
		
		
		
		
		
		
/* String username="abc";
String password="abc3uu";
System.out.println(username=="abc" && password=="abc3uu");
System.out.println(username=="abc"|| password=="abcd");
System.out.println(!(username=="abc")); */
	
	}

}
