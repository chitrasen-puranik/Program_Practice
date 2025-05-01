package Strings;

import java.util.HashSet;

public class MostRepetitiveWordFromString {

	public static void main(String[] args) {

		String str = "java is java java is";
		
		String str2[]= str.split(" ");
		
		int count;

		HashSet <String> set = new HashSet<String>();
		
		for(int i=0; i<=str2.length-1; i++)
		{
			set.add(str2[i]);
		}
		
		for(int i=0; i<=str2.length-1; i++)
		{
			count=1;
			
			for (int j=i+1; j<=str2.length-1; j++)
			{
				if(str2[i].equals(str2[j]))
				{
					count++;
					str2[j] = "0";
				}
			}
			
			System.out.println(str2[i]+ " count- "+count);
			
			if(count>1 && str2[i] != "0") 
			{
				System.out.println(str2[i] + " occurance is "+count);
			}
		}
		
		
	}

}
