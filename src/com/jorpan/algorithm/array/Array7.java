package com.jorpan.algorithm.array;

import com.jorpan.algorithm.utils.ArrayUtils;

public class Array7 {
    public void test() {
        int a[] = {9, 9, 9};
        ArrayUtils.printArray(plusOne(a));
    }

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i] += 1;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] res = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }
}
