package questionsjava;

public class Questionsclass {

	public static void main(String[] args) {
		
		//1.
		
		String s="jmeter ";
		String s1="performance testing tool";
		System.out.println(s.concat(s1));
		
		//2.
		
		String l1="java language is platform independent";
		System.out.println(l1.contains("language"));
		if(l1.contains("language"))
		{
			System.out.println("Pass");
		}
        else{
	        System.out.println("Fail");
	        }
		
		//3.
		
	String s3="Selenium webdriver is used for webapplicatin testing";
	String arr[]=s3.split(" ");
	for(String a:arr) {
		System.out.println(a);
		if(a.contains("webapplication")) {
			break;
		}	
	}
	
	}
}
