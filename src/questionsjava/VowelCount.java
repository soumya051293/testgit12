package questionsjava;

import java.util.Scanner;

public class VowelCount {

void count(String str)
{
	int vowels=0;
	str=str.toUpperCase();
	for(int i=0;i<str.length();i++) 
	{
	char ch=str.charAt(i);
	if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' )
		vowels++;
		
	}
	System.out.println("Number of Vowels = "+ vowels);
}

	public static void main(String[] args) {
		 VowelCount obj=new  VowelCount();
		 Scanner s=new Scanner(System.in);
		 System.out.println("Input=");
String str= s.next();

obj.count(str);
	}

}
