package Strings;

public class CountOccuranceOfTargetSequence {

	public static void main(String[] args) {

		String str1 = "ssxxsdfxxxx";
		String seq = "xx";
		
		int count=0;
		
		for(int i=0; i<str1.length()-1; i++)
		{
			if(str1.charAt(i)=='x' && str1.charAt(i+1)=='x')
			{
				count++;
			}
		}
		
		System.out.println(seq + " : " +count);
	}

}
