package Strings;

public class FindDuplicateCharInAString {

	public static void main(String[] args) {

		String str = "I am Chitrasen cPuranik";
		String str2 = str.toLowerCase();
		//Output - iarn
		
		int count;
		char[] chars = str2.toCharArray();
		
		for(int i=0; i<=chars.length; i++)
		{
			count = 1;
			
			for(int j=i+1; j<chars.length; j++ )
			{
				if((chars[i]==chars[j]) && (chars[i]!=' '))
				{
					count++;
					
					chars[j]='0';
					
				}
			}
			
			if(count>1 && chars[i] != '0') 
			{
				System.out.println(chars[i] + " occurance is "+count);
			}
			
		}

	}

}
