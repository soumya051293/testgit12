package oopsconcept;

interface Bank1
{
	void deposit();
	void withdraw();
}
interface Bank2
{
	void interestrate();
	void balancedetails();
}

class ICICI implements Bank1,Bank2

{

	@Override
	public void interestrate() {
		System.out.println("InterestRate");
		
	}

	@Override
	public void balancedetails() {
		System.out.println("BalanceDetails");
		
	}

	@Override
	public void deposit() {
		System.out.println("Deposit");
		
	}

	@Override
	public void withdraw() {
		System.out.println("Withdraw");
		
	}
	
	
	
	
}



public class MultipleInheritance {

	public static void main(String[] args) {
	ICICI OB=new ICICI();
	OB.interestrate();
	OB.balancedetails();
	OB.deposit();
	OB.withdraw();

	}

}
