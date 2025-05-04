package org;

public class FindWhetherStringIsPalindrome {

    public static void main(String[] args) {

        String str = "madam";

        int length = str.length();

        String revStr = "";

        for(int i=length-1; i>=0; i--)
        {
            revStr = revStr+str.charAt(i);
        }

        if(str.equals(revStr))
        {
            System.out.println(str + " is a Palindrome");

        }
    }

}
