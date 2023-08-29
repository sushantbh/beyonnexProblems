package com.beyonnex.problems;

public class AnagramProblem {
    public static boolean isAnagram(String s, String t) {

        if(s==null || t==null ||  s.length()!=t.length())
        {
            return false;
        }
// For accomodating special characters and spaces, have increased the size of array, size of array could be taken as 26 as well, if we are ensured that there will be only alphabetic character with no case check
        int a[] = new int[95];

// toLowerCase() can be removed if we want to treat uppercase and lowercase as a seperate letter.
        for(char c:s.toLowerCase().toCharArray())
        {
            a[c-32]++;   // If we would only be considering alphabetic characters with no case check, we can change 32 to 97
        }
        for(char c:t.toLowerCase().toCharArray())
        {
            a[c-32]--;
        }

        for(int i:a)
        {
            if(i!=0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //Some Test Cases
        System.out.println(isAnagram("Test","stet"));
        System.out.println(isAnagram("aaaaaabbbbaaaccaaccabb","abc")); 
        System.out.println(isAnagram("","abcdefg"));
        System.out.println(isAnagram("abcdef",""));
        System.out.println(isAnagram("abcdef",null));
        System.out.println(isAnagram("abcdefghijklmn opqrstuvwxy%^z","qwertyuiop^%asdfgh jklzxcvbnm")); // Test case with special characters and spaces
    }
}
