package javapractices;

public class StringProgram {

	public static void main(String[] args) {
		
		String s = "Welcome to codemind";
		String s2="";
		
		for(int i=(s.length()-1);i>=0;i--)
		{
			//s2=s2+s.charAt(i);
			System.out.print(s.charAt(i));
		}
		System.out.println(s2);
		
		String array[] = s.split("");
		String s4="";
		for(String s3 :array)
		{
			for(int i=(s3.length()-1); i>=0;i--)
			{
				s4=s4+s3.charAt(i);
			}
			s4=s4+"";
		}
		System.out.println(s4.trim());
		

	String s5 ="assd12345";//9
	
	String s6= s5.replaceAll("[^0-9]", "");
	int add =0;
	for(int i =0; i<s6.length();i++)
	{
		int num = Character.getNumericValue(s6.charAt(i));
				add = num+add;
	}
	System.out.println(add);
	
	// Welcome to codemind
	//w=1, e=3, l=1, c=2, o=3, m=2, i=1, n=1;
	String ss ="";
	for(int i=0; i<s.length();i++);
	{
		int counter =0;
		int i = 0;
		if(s.contains(String.valueOf(s.charAt(i))))
			//break;
		for (int j=0; j<s.length();j++ )
		{
			if(Character.compare(s.charAt(i), s.charAt(j))==0)
			{
				counter++;
			}
		}
		System.out.print(s.charAt(i)+"\t"+counter);
		System.out.println();
		ss=ss+s.charAt(i);
	}
}
}