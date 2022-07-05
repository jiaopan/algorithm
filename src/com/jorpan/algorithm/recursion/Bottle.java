package com.jorpan.algorithm.recursion;

public class Bottle {
    public void test() {
        System.out.println(drink(5, 5));
    }

    public int drink(int bottle, int cap) {
        if (bottle < 2 && cap < 4) {
            return 0;
        }
        int leftBottle = bottle / 2 + bottle % 2 + cap / 4;
        int leftCap = cap / 4 + cap % 4 + bottle / 2;
        return bottle / 2 + cap / 4 + drink(leftBottle, leftCap);
    }
}
