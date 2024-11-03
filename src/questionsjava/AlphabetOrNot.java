package questionsjava;

public class AlphabetOrNot {

	public static void main(String[] args) {
		
		char f='K';
		if(f>='a' && f<='z'  || f>='A' && f<='Z')
		{
			System.out.println(f+ " is an Alphabet");
		}
		else
		{
			System.out.println(f+ " is not an Alphabet");
		}

	}

}
