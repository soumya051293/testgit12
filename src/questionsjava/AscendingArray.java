package questionsjava;

public class AscendingArray {

	public static void main(String[] args) {
		int[] array= {11,2,43,34,15,26};
	    int temp;
	    for(int i=0;i<array.length;i++) 
	    {
	   for(int j=i+1;j<array.length;j++)
	   {
		  if(array[i]>array[j]) 
		  {
			 temp=array[i];
			 array[i]=array[j];
			 array[j]=temp;
			  
		  } 
	   }
   }
		 System.out.println("Ascending Order :");
		 for(int i=0;i<array.length;i++) {
	 System.out.print(array[i]+"  ");   
		 }
	}

}
