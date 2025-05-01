package Strings;

public class CountSpaceWithoutLoopFromString {

	public static void main(String[] args) {

		String str = "This is java programming";
		
		int i = str.length() - str.replace(" ", "").length();
		
		System.out.println(i);
	}

}
