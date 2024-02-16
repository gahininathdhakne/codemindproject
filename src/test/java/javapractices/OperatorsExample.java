package javapractices;

class operators {
	
	int a =10, b=10;
	
	void prefixIncrement()
	{
		System.out.println("Prefix value of a is "+ ++a);
		
	}
	void postfixIncrement()
	{
		System.out.println("Postfix value of a is :"+ a++);
		System.out.println("Updated value of a is :" +a);
	}
	void prefixDecrement()
	{
		System.out.println("Prefix value of b is "+ --b);
		
	}
	void postfixDecrement()
	{
		System.out.println("Postfix value of b is :"+ b--);
		System.out.println("Updated value of b is :"+b);
	}
	void arithmaticOperator()
	{
		int a =15, b =2;
		System.out.println("Addition using module operator :"+(a+b));
		System.out.println("Substraction using module operator :"+(a-b));
		System.out.println("Multiplication using module operator :"+ a*b);
		System.out.println("Division using module operator :"+ a/b);
		System.out.println("Reminder using module operator :"+a%b);
	}
	void relationalOperator()
	{
		int i =10;
		System.out.println("Strictly less than: " +(i<11));
	}
	void logicalOperator()
	{
		int a = 10, b=20;
		if(a==10 && b==20)
		{
			System.out.println("Both conditions are true using && operator");
		}
		if(a==10 || b==20)
		{
			System.out.println("Anuyone conditions is true using || operator");
		}
	}
	
}
public class OperatorsExample {

	public static void main(String[] args) {
		
		operators op = new operators();
		
		op.prefixIncrement();
		op.postfixIncrement();
		op.prefixDecrement();
		op.postfixDecrement();
		op.arithmaticOperator();
		op.relationalOperator();
		op.logicalOperator();
	}

}
