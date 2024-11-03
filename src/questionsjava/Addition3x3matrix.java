package questionsjava;


public class Addition3x3matrix {

	public static void main(String[] args) {

		int m1[][]= {{1,2,3},{4,5,6},{1,2,3}};
		int m2[][]= {{3,4,5},{3,2,1},{2,2,5}};
		int sum[][]=new int[3][3];
		
		
		System.out.println("First Matrix Elements");
		
    for(int i=0;i<3;i++)
    {
    	for(int j=0;j<3;j++) 
    	{
    	
    		System.out.print(m1[i][j]+"   ");
    	}
    	System.out.println();
    }
    
    
    System.out.println("Second Matrix Elements");

for(int i=0;i<3;i++)
{
	for(int j=0;j<3;j++) 
	{
		
		System.out.print(m2[i][j]+"   ");
	}
	System.out.println();
}
    //addition

for(int i=0;i<3;i++)
{
	for(int j=0;j<3;j++) 
	{
		
		sum[i][j]=m1[i][j]+m2[i][j];
	}
	
}



System.out.println("Sum of Matrix Elements");

for(int i=0;i<3;i++)
{
	for(int j=0;j<3;j++) 
	{
	System.out.print(sum[i][j]+"   ");
	}
	System.out.println();
}


	}

}
