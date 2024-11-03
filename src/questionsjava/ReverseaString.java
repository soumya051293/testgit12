package questionsjava;

public class ReverseaString {

	public static void main(String[] args) {
String s="SOUMYA";
String str="";
for(int i=0;i<s.length();i++) 
{
str=s.charAt(i)	+str;
}
System.out.println(str);	
	}

}
