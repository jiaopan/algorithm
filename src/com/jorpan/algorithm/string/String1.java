package com.jorpan.algorithm.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class String1 {
    public void test() {
        System.out.println(firstUniqChar("abcdebcade"));
    }
    public int firstUniqChar(String s) {
        Set<Character> chars = new HashSet<>();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            Character a = s.charAt(i);
            if (chars.add(a)) {
                list.add(a);
            } else {
                list.remove(a);
            }
        }
        if (list.size() > 0) {
            return s.indexOf(list.get(0));
        } else {
            return -1;
        }
    }
}
