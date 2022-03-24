package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int passwordLength = 8;
        System.out.println(geekPassword(passwordLength));
    }

    public static char[] geekPassword(int length){
        String upperCaseChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallCaseChars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String values = upperCaseChars + smallCaseChars + numbers;

        Random randomPassword = new Random();
        char[] password = new char[length];
        for(int i=0; i< length;i++){
            password[i] = values.charAt(randomPassword.nextInt(values.length()));
        }
        return password;
    }

}
