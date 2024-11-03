package oopsconcept;

abstract class Google
{
	
	
abstract void message();



public void search()
{
System.out.println("Google Search");	
}

}


class SearchAll extends Google
{

	@Override
	void message() {
		System.out.println("Search All Details");
		
	}

}


class SearchImage extends Google
{

	@Override
	void message() {
		System.out.println("Search Image Details");
		
	}
	
}


class SearchVideo extends Google
{

	@Override
	void message() {
		System.out.println("Search Video Details");
		
	}
}


public class AbstractClasses {

	public static void main(String[] args) {
SearchAll a=new SearchAll();
a.message();
a.search();
SearchImage i=new SearchImage();
i.message();
i.search();
SearchVideo v=new SearchVideo();
v.message();
v.search();
	}

}
