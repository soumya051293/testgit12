package questionsjava;

public class OddandEvenArray {

	public static void main(String[] args) {
		int[] Array = {74, 73, 34, 87, 39,28};
	      System.out.println("Even numbers : ");

	      for (int i=0; i<Array.length; i++){
	         if(Array[i]%2 == 0){
	            System.out.println(Array[i]);
	         }
	      }
	      System.out.println("Odd numbers: ");

	      for (int i=0; i<Array.length; i++){
	         if(Array[i]%2 != 0){
	            System.out.println(Array[i]);
	         }
	      }

	}

}
