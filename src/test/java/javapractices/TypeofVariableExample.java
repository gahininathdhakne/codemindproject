package javapractices;

class TypeofVariable{
	
	// Data Members 
	int a =35;// instance variable/ class level variable 
	String name ="Gahininath"; // instance variable/ class level variable 
	
	final int g = 25; // final variable
	
	static int s = 23; // static variable
	
	void show()
	{
		int b =10; // Local variable
		System.out.println("Local variable/ method level :"+b);
	}
}
public class TypeofVariableExample {
 int c=10;
	public static void main(String[] args) {
		TypeofVariable t1 = new TypeofVariable();
		System.out.println("instance variable/ class level variable "+t1.a);
		t1.show();		
		System.out.println("Final variable "+t1.g);
		
		
		System.out.println(" static variable s using class "+TypeofVariable.s);
		//System.out.println(" static variable s using object "+t1.s);

	}

}
