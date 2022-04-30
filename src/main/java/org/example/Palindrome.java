package org.example;

public class Palindrome {

    public Boolean isPalindrome(String strX) {
        if (strX.length() < 2)
            return true;

        if (strX.charAt(0) == strX.charAt(strX.length() - 1)) {
            return isPalindrome(strX.substring(1, strX.length() - 1));
        } else
            return false;

    }

    public static void main(String args[]) {
        String S1 = "Sumit";
        String S2 = "NitiN";
        String S3 = "ABCDEFGHGFEDCBA";
        String S4 = "Jain niaJ";
        String S5 = "Robert treboR";
        Palindrome p = new Palindrome();
        System.out.println("Is " + S1 + " Palindrome ??? :"
                + p.isPalindrome(S1));
        System.out.println("Is " + S2 + " Palindrome ??? :"
                + p.isPalindrome(S2));
        System.out.println("Is " + S3 + " Palindrome ??? :"
                + p.isPalindrome(S3));
        System.out.println("Is " + S4 + " Palindrome ??? :"
                + p.isPalindrome(S4));
        System.out.println("Is " + S5 + " Palindrome ??? :"
                + p.isPalindrome(S5));
    }
}