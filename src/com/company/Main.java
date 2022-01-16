package com.company;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        System.out.println(removeDuplicate("AAHSHSFFVDHY"));
        System.out.println("I did it");
    }

    public static StringBuffer removeDuplicate(String duplicateString) {

        char[] chars = duplicateString.toCharArray();

        Set<Character> charSet = new LinkedHashSet<>();

        for (char c : chars) {
            charSet.add(c);
        }

        System.out.println(charSet);

        StringBuffer clearString = new StringBuffer();

        for (Character character : charSet) {
            clearString.append(character);
        }
        return clearString;
    }
}
