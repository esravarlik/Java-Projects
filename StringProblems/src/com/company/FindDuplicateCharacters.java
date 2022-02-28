// Java Program to find duplicate characters in String
package com.company;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateCharacters {
    public static void duplicateCharacters(String string){
        char[] characters = string.toCharArray();

        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        for(Character chr : characters){
            if(charMap.containsKey(chr)){
                charMap.put(chr, charMap.get(chr) + 1);
            }else{
                charMap.put(chr, 1);
            }
        }
        Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
        System.out.printf("Duplicate Characters in String: '%s' %n", string);
        for(Map.Entry<Character, Integer> entry:entrySet){
            if(entry.getValue() > 1){
                System.out.printf("%s: %d %n", entry.getKey(), entry.getValue());
            }
        }
    }
}
