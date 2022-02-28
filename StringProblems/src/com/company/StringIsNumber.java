package com.company;
import java.util.regex.Pattern;

public class StringIsNumber {

    public static void stringIsNumber(String[] string){
        Pattern pattern = Pattern.compile(".*[^0-9].*");
        for(String s: string){
            System.out.println(!pattern.matcher(s).matches());
        }
    }
}
