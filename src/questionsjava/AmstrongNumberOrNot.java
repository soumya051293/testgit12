package questionsjava;

public class AmstrongNumberOrNot {

	public static void main(String[] args) {
		
		//153  1*1*1   5*5*5    3*3*3=1+125+27=153
		//1634 1*1*1*1    6*6*6*6    3*3*3*3   4*4*4*4=1634
		
		int num=153;
		int temp=num;
		int digit=0;
		int lastnum=0;
		int sum=0;	
		System.out.print(num+"  ");
		while(temp>0)
		{	
		temp=temp/10;
		digit++;
	    }
        temp=num;
while(temp>0) 
{
	lastnum=temp%10;
	temp=temp/10;
	sum=(int) (sum+Math.pow(lastnum, digit));//find the power
	
}

if(sum==num) 
{
	System.out.println("It is a Amstrong Number");
}
else 
{
	System.out.println("It is not a Amstrong Number");	
}
	}

}
