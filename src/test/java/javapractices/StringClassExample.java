package javapractices;

public class StringClassExample {

	public static void main(String[] args) {
		String s= "sachin";
		System.out.println(s);
		
		String ss = new String("Rohit");
		System.out.println(ss);
		
		String sss= "sachin";
		System.out.println(sss);
		
		System.out.println(s.hashCode());
		System.out.println(sss.hashCode());
		
		String ssss = new String("Rohit");
		
		System.out.println(ss.hashCode());
		System.out.println(ssss.hashCode());

		System.out.println("==============");
		
		String adharNumber ="123456789";
		String adharnum2 = adharNumber.concat("3456");
		
		System.out.println(adharNumber);
		System.out.println(adharnum2);
		
	}
}
