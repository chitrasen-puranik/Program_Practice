package Strings;

public class CountSpaceUsingLoopFromString {

	public static void main(String[] args) {

		String str = "This is java programming";

		int count=0;
		
		for(int i = 0; i<str.length(); i++)
		{
			if(str.charAt(i)==' ')
			{
				count++;
			}
		}
		
		System.out.println("Total space in string: "+count);
	}

}
