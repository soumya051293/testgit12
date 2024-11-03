package oopsconcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionCheked {

	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
	FileInputStream f=new FileInputStream("C:\\Users\\sibin\\Pictures");
	
	System.out.println("STARTED");
	Thread.sleep(5000);
	System.out.println("STOPPED");

	}
}
