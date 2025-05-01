package Strings;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWordsInString {

	public static void main(String[] args) {

		String str = "Bread butter and bread and bread";
		
		String[] splitStr = str.toLowerCase().split(" ");
		
		HashMap<String, Integer> hs = new HashMap<String, Integer>();
		
		for(int i = 0; i<splitStr.length; i++)
		{
			if(!hs.containsKey(splitStr[i]))
			{
				hs.put(splitStr[i], 1);
			}
			else
			{
				hs.put(splitStr[i], hs.get(splitStr[i])+1);
			}
		}
		
		boolean foundFlag = false;
		
		for(Map.Entry<String, Integer> entry : hs.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey() + " : "+entry.getValue());
				
				foundFlag = true;
			}
		}
		
		if(!foundFlag)
		{
			System.out.println("No duplicate word found in given string: "+"'"+str+"'");
		}

	}

}
