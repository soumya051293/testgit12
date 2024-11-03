package newpack24;

public class Nestedif {

	public static void main(String[] args) {
		int age=21,weight=35;
		if (age>=18)
		{
			if(weight>55)
			{
				System.out.println("eligible");	
			}
			else
			{
				System.out.println("ineligible:under weight");
			}
		}
		else {
			System.out.println("not eligible");
		}

	}

}
