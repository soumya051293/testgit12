package questionsjava;

public class LargestInArray {

	public static void main(String[] args) {
      int[] input= {23,45,67,120,230,120};
       int large=input[0];
       
       for(int num: input)
       {
       
    	   if(large<num) 
    	   {
    		  large=num; 
    	   }
    	 
       }
       
       System.out.println("largest is " +large);
	}
	
}
