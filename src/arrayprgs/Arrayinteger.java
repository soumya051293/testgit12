package arrayprgs;

import java.util.Scanner;

public class Arrayinteger {

	public static void main(String[] args) {
		int arr[]=new int[4];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Numbers:");
		for(int i=0;i<4;i++)
		{
		arr[i]=sc.nextInt();	
		}
		System.out.println("Numbers are:");
		for (int s:arr)
		{
			System.out.println(s);
		}

	}

}
