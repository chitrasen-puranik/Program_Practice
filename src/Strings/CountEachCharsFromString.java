package Strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountEachCharsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "All Is Well";
		
		char[] chars = str.toCharArray();
		
		LinkedHashMap<Character, Integer> hm = new LinkedHashMap<Character, Integer>();
		
		for(char c: chars)
		{
			if(c!=' ')
			{
				if(!hm.containsKey(c))
				{
					hm.put(c, 1);
				}
				else
				{
					hm.put(c, hm.get(c)+1);
				}
			}
		}
		
		for(Map.Entry<Character, Integer> entry: hm.entrySet())
		{
			System.out.println(entry.getKey() + ": "+entry.getValue());
		}

	}

}
