//Reverse an Array
package com.company;

public class ReverseString {
    public static void reverseArray(String string){
        int length = string.length();
        String reverse = "";
        for(int i = length -1; i>=0;i--){
             reverse = reverse + string.charAt(i);
        }
        System.out.println(reverse);
        //or
        StringBuffer stringBuffer = new StringBuffer(string);
        System.out.println(stringBuffer.reverse());
    }

}
