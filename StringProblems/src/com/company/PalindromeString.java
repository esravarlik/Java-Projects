//Palindrome String
package com.company;

public class PalindromeString {
    public static boolean IsPalindrome(String string) {

        int length = string.length();
        String reversePalindrome = "";
        for(int i = length -1; i>=0;i--){
            reversePalindrome = reversePalindrome + string.charAt(i);
        }
        System.out.println("String: " + reversePalindrome);

        if(reversePalindrome.equals(string)){
            System.out.println("The string is Palindrome!");
            return true;
        }else{
            System.out.println("The string is not Palindrome!");
            return false;
        }
    }
}