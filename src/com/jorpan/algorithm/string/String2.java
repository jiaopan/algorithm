package com.jorpan.algorithm.string;

public class String2 {
    public boolean isAnagram(String s, String t) {
        int[] letterCount = new int[26];
        for (int i = 0; i < s.length(); i++) {
            letterCount[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            letterCount[t.charAt(i) - 'a']--;
        }
        for (int count : letterCount) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
