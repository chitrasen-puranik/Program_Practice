package Strings;

import java.util.Arrays;

public class DivideStringIntoNEqualsParts {

	public static void main(String[] args) {

		String str = "Chitrasen";
		
		int nparts = 3;
		
		int newPartCount = str.length()/nparts;
		
		String[] arrayString = new String[newPartCount];
		
		int index = 0;
		
		if(nparts<=str.length() && str.length()%nparts==0)
		{
			for(int i = 0; i<str.length(); i=i+newPartCount)
			{
				String part = str.substring(i, i+newPartCount);
				arrayString[index]=part;
				index++;
			}
			
			System.out.println(Arrays.toString(arrayString));
		}
		else
		{
			System.out.println("Not able to devide in equal parts");
		}
		
		

	}

}
