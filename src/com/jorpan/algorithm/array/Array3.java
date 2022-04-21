package com.jorpan.algorithm.array;

/**
 * 给你一个数组，将数组中的元素向右轮转 k个位置，其中k是非负数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums = [1,2,3,4,5,6,7], k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右轮转 1 步: [7,1,2,3,4,5,6]
 * 向右轮转 2 步: [6,7,1,2,3,4,5]
 * 向右轮转 3 步: [5,6,7,1,2,3,4]
 */
public class Array3 {
    public void test() {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int[] b = rotate(a, 5);
        for (int i : b) {
            System.out.println(i);
        }
    }

    public int[] rotate(int[] nums, int k) {
        if (nums == null) {
            return null;
        }
        if (k <= 0) {
            return nums;
        }
        int[] b = new int[nums.length];
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            b[(i + k) % length] = nums[i];
        }
        return b;
    }

}
