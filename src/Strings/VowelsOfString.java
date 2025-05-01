package Strings;

import java.util.HashSet;

public class VowelsOfString {

	public static void main(String[] args) {

		String str1 = "I Am Outstanding Person In The Universe";
		str1 = str1.toLowerCase().replaceAll(" ", "");
		
		System.out.println(str1);
		
		HashSet <Character> set = new HashSet<>();
		
		for(int i = 0; i<str1.length(); i++)
		{
			char c = str1.charAt(i);
			
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
			{
				set.add(c);
			}
		}
		
		System.out.println(set);

	}

}
