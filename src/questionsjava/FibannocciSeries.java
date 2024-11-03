package questionsjava;

public class FibannocciSeries {

	public static void main(String[] args) {
		int a=0,b=1,sum,count=10;
		
		System.out.println("Fibannocci Series");
		System.out.print(a);
		System.out.print(" ");
		System.out.print(b);
	
		
		for(int i=0;i<count;i++) {
			
		sum=a+b;
		System.out.print(" "+sum);
		a=b;
		b=sum;
		}
	}
	}
			
			
			
			
		

	


