package javapractices;

public class MutableStringClasses {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Welcome to code mind");
		sb.append(" Pune");
		System.out.println(sb);
		sb.reverse();
		
		System.out.println(sb);
		System.out.println("===============================");
		
		StringBuilder sb1 = new StringBuilder("Welcome to code mind");
		sb1.append(" Pune");
		System.out.println(sb1);
		sb1.reverse();
		
		System.out.println(sb1);
	}

}
