package newpack24;

public class Switchcalculator {

	public static void main(String[] args) {
	/*int a=40, b=20;
	String c="Div";
		switch (c){
case "Add":System.out.println(a+b);
break;
case "Sub":System.out.println(a-b);
break;
case "Mul":System.out.println(a*b);
break;
case "Div":System.out.println(a/b);
break;


default:System.out.println("Invalid");

}*/
		
		
//another method
		int num1=40,num2=20,result;
		char op='o';
		switch(op) {
		case '+':result=num1+num2;
		System.out.println(result);
		break;
		case '-':result=num1-num2;
		System.out.println(result);
		break;
		case '*':result=num1*num2;
		System.out.println(result);
		break;
		case '/':result=num1/num2;
		System.out.println(result);
		break;
		default:System.out.println("Invalid");
	
		
		}

	}

}
