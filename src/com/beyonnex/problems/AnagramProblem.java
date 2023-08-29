package com.beyonnex.problems;

public class AnagramProblem {
    public static boolean isAnagram(String s, String t) {

        if(s==null || t==null ||  s.length()!=t.length())
        {
            return false;
        }

        int a[] = new int[26];

        for(char c:s.toLowerCase().toCharArray())
        {
            a[c-97]++;
        }
        for(char c:t.toLowerCase().toCharArray())
        {
            a[c-97]--;
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
        System.out.println(isAnagram("abcdefghijklmnopqrstuvwxyz","qwertyuiopasdfghjklzxcvbnm"));
    }
}
