package questionsjava;

public class TotalNumCharOfString {

	public static void main(String[] args) {
		
		   String st = "I AM SOUMYA";    
	        int count = 0;    
	        System.out.println(st);    
	        
	        for(int i = 0; i < st.length(); i++) 
	        {    
	            if(st.charAt(i) != ' ')    
	                count++;    
	        }                
	       
	        System.out.println("Total number " + count);

	}

}
