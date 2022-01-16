package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(removeDuplicate("AAHSHSFFVDHY"));
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
