package questionsjava;

public class PalindromeOfaNum {

	public static void main(String[] args) {
		int a=121;
		int pal=0,b;
		int temp=a;
while(a>0)
{
	 b=a%10;
	pal=(pal*10)+b;
	a=a/10;	
		
		}
	
		if(pal==temp)
		{
			System.out.println(pal + " is a palindrome no: ");
		}
		else 
		{
			System.out.println(pal + " is not a palindrome no: ");
		}
	}

}
