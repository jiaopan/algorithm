package com.jorpan.algorithm.array;

public class Array10 {
    public void test() {
        char[] s = new char[]{'a', 'b', 'c'};
        System.out.println(s);
        reverseString(s);
        System.out.println(s);
    }

    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            swap(s, left++, right--);
        }
    }

    public void swap(char[] s, int a, int b) {
        char temp = s[a];
        s[a] = s[b];
        s[b] = temp;
    }
}
