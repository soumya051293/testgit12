package newpack24;

import java.util.Scanner;

public class Scannerprg {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Name:");
		String name=sc.next();
		System.out.println("Enter your Age:");
		int age=sc.nextInt();
		System.out.println("Enter your Character:");
		char c=sc.next().charAt(0);	}

}
