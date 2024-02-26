package javapractices;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class StringProgram1 {

	public static void main(String[] args) {
		String s = "Welcome to codemind";
		
		char arr[] = s.toCharArray();
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(!(map.containsKey(arr[i])))
			{
				map.put(arr[i], 0);
			}
			if(map.containsKey(arr[i]))
			{
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
           Set<Entry< Character, Integer>> mm =map.entrySet();
           for(Entry< Character, Integer> e:mm)
           {
        	   System.out.println(e.getKey()+" : "+e.getValue());
           }
	}

}
