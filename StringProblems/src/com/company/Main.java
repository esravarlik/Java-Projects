package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("-----------------------------------");
        // Java Program to find duplicate characters in String
        FindDuplicateCharacters findDuplicateCharacters = new FindDuplicateCharacters();
        findDuplicateCharacters.duplicateCharacters("Hello");

        System.out.println("-----------------------------------");
        //Reverse an Array
        ReverseString reverseArray = new ReverseString();
        reverseArray.reverseArray("Esra");

        System.out.println("-----------------------------------");
        //Palindrome String
        PalindromeString palindromeString = new PalindromeString();
        palindromeString.IsPalindrome("aba");
        palindromeString.IsPalindrome("abc");

        System.out.println("-----------------------------------");
        //How to check if a String is Number
        StringIsNumber stringIsNumber = new StringIsNumber();
        stringIsNumber.stringIsNumber(new String[]{"136", "45", "abc123"});

    }
}
