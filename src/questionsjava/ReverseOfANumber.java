package questionsjava;

public class ReverseOfANumber {

	public static void main(String[] args) {
		int a=12345;
		int rev=0,b;
while(a>0)
{
	 b=a%10;//23456>0 2345>0 234>0 23>0 2>0
	rev=rev*10+b;//0=0*10+5 5=5*10+4=54 54=54*10+3=543.....
	a=a/10;	//12345/
		
		}
		System.out.println("Reverse is  "+rev);

	}

}
