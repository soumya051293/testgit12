package questionsjava;

public class ReverseArray {

	public static void main(String[] args) {
 /* int[] array= {1,2,3,4,5,6};
    int temp;
  
       for(int i=0;i<array.length/2;i++) {
    	temp=array[i];
    	array[i]=array[array.length-1-i];
    	array[array.length-1-i]=temp;
    }
    
    System.out.println("Revered Array :");
    	for(int i=0;i<array.length;i++) 
    	{
    		System.out.print(array[i]+"  ");
    	}*/
	
	
	//Another method
	
	int[] array= {1,2,3,4,5,6};
    System.out.println("Orginal Array :"); 
    for(int i=0;i<array.length;i++) {
    	System.out.print(array[i]+"  ");
    }
    System.out.println();
    System.out.println("Revered Array :");
    	for(int i=array.length-1;i>=0;i--) 
    	{
    		System.out.print(array[i]+"  ");
    	}
    
	}

}
