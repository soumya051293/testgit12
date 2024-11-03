package stringfunctions;

public class Examplefunctionsoper {

	public static void main(String[] args) {
	
		
	//length of a string
		
    String a="Welcome";
	System.out.println(a.length());

	//join 2 strings
	
	String s1="hello";
	String s2="luminar";
	System.out.println(s1.concat(s2));

	System.out.println(s1+1+2);
	System.out.println(1+2+s1);
	System.out.println(s1+s2);
	
	//upper lower cases
	
	String r="LUminar";
	System.out.println(r.toUpperCase());
	System.out.println(r.toLowerCase());
	System.out.println(r.startsWith("u"));
	System.out.println(r.endsWith("n"));
	
	//compare 2 strings
	
	String x="Abc";
	String y="abc";
	System.out.println(x.equals(y));
	System.out.println(x.equalsIgnoreCase(y));
	
	//contain value
	
	String h="Luminartechnolab";
	System.out.println(h.contains("Luminar"));
	
	String q="    hello";
	System.out.println(q);
	System.out.println(q.trim());
	String j="welcome";
	System.out.println(j.substring(3));
	System.out.println(j.substring(0,4));
	System.out.println(j.replace("el","ky"));
	String f="kakkanad";
	System.out.println(f.charAt(0));
	
	//split the strings
	
	String w1="welcome to Luminar";
	String words[]=w1.split(" ");
	for(String l:words)
	{
	System.out.println(l);
	}
	
	//split the characters
	
	String w2="HELLO";
	char values[]=w2.toCharArray();
	for (char k:values) 
	{
		System.out.println(k);
	}

	}

}
