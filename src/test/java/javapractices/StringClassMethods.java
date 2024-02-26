package javapractices;

public class StringClassMethods {

	public static void main(String[] args) {
		String s = "Welcome to codemind";
		String s1= "Tata Technology";
		
		char c = s.charAt(5);
		System.out.println(c);

		//System.out.println(s.compareTo(s1));
		
		System.out.println(s.compareToIgnoreCase(s1));
		
	   System.out.println(s.concat(" Technology Pune"));
	   System.out.println(s);
	   System.out.println(s.contains("Pune"));
	   
	   System.out.println(s.contains("to codemind"));
	   System.out.println(s.endsWith("codemind"));
	   System.out.println(s.equals(s1));
	   System.out.println(s.equalsIgnoreCase("Welcome to Codemind"));
	   System.out.println(s.indexOf('m'));
	   System.out.println(s.indexOf("to"));
	   System.out.println(s.indexOf('m',6));
	   System.out.println(s.indexOf("mind",6));
	   System.out.println(s.length());
	   System.out.println(s.isEmpty());
	   String s3="";
	   System.out.println(s3.isEmpty());
	   System.out.println(s.toUpperCase());
	   System.out.println(s.toLowerCase());
	   char[] array = s.toCharArray();
			   for(char cc:array)
			   {
				   System.out.println(cc);
			   }
			   
			   System.out.println(s.substring(8));
			  System.out.println(s.substring(0, 10));	
			  System.out.println(s.startsWith("Welcome"));
			  System.out.println(s.startsWith("to", 8));
			  System.out.println(s.replace('W', 'w'));
			  System.out.println(s.replace(s, s1));
			  String ss= "saWr23%%%^&^&%"; 
			  
			  System.out.println(ss.replaceAll("[a-zA-Z0-9]", ""));
			  System.out.println(ss.replaceAll("[^0-9]", ""));
			  System.out.println(ss.replaceAll("[^a-z]", ""));
			  System.out.println(ss.replaceAll("[^A-Z]", ""));
			  System.out.println(ss.replaceAll("[0-9]", ""));
			  System.out.println(ss.replaceAll("[^%&]", ""));
			 // System.out.println(ss.replaceAll("[%&^]", ""));
			  System.out.println(ss.replaceAll("[%&^]", "1"));
			  
			  ss="ab1234";
			 System.out.println(ss.replaceFirst("[0-9]", "a"));
			 String arr[] =ss.split("12");
			 for (String a:arr)
			 {
				 System.out.println(a);
			 }
			 System.out.println("===========");
			 String arr1[] =ss.split("[0-9]");
			 for (String a:arr1)
			 {
				 System.out.println(a);
			 }
			 System.out.println("===========");
			 String arr2[] ="123123123123".split("2", 5);
			 for (String a:arr2)
			 {
				 System.out.println(a);
			 }
			 
			 int a1 =1234;
			 String s5= String.valueOf(a1);
			 System.out.println(s5);
			 System.out.println(s5.length());
			 
			 String s6 = String.valueOf("abcdtthf");
			 System.out.println(s6);
			 
			 
	}
}
