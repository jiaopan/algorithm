package com.jorpan.algorithm.array;

import java.util.ArrayList;

public class Array11 {
    public void test() {
        System.out.println(reverse(-12345789));
    }

    public int reverse(int x) {
        long res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x = x / 10;
        }
        return (int) res == res ? (int) res : 0;
    }

}
