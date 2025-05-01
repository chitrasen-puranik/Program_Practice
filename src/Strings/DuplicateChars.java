package Strings;

public class DuplicateChars {

	public static void main(String[] args) {

		String str1 = "I am Chitrasen Puranik";
		String str2 = str1.toLowerCase();
		str2 = str2.replaceAll("\\s+", "");
		int count=0;
		char chars[] = str2.toCharArray();
		
		for (int i = 0; i<=chars.length-1; i++)
		{
			count=1;
			
			for (int j=i+1; j<=chars.length-1; j++)
			{
				if(chars[i]==chars[j])
				{
					count = count+1;
					
					chars[j]='0';
				}
			}
			
			if(count>1 && chars[i] != '0')
			{
				System.out.println(chars[i] + " ocurred - " + count + " times");
			}
			
		}

	}

}
