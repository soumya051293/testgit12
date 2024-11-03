package arrayprgs;

import java.util.Scanner;

public class Arraystring {

	public static void main(String[] args) {
		
String arr[]=new String[4];
Scanner sc=new Scanner(System.in);
System.out.println("Enter Names:");
for(int i=0;i<4;i++)
{
arr[i]=sc.next();	
}
System.out.println("Names are:");
for(int i=0;i<4;i++)
{
	System.out.println(arr[i]);
}

	}

}
