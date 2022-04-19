package com.jorpan.algorithm.array;

/**
 * 删除排序数组中的重复项
 * 给你一个 升序排列 的数组 nums，请你 原地 删除重复出现的元素，使每个元素只出现一次，返回删除后数组的新长度。元素的相对顺序应该保持一致 。
 * <p>
 * 由于在某些语言中不能改变数组的长度，所以必须将结果放在数组nums的第一部分。更规范地说，如果在删除重复项之后有 k 个元素，那么nums的前 k 个元素应该保存最终结果。
 * <p>
 * 将最终结果插入nums 的前 k 个位置后返回 k 。
 * <p>
 * 不要使用额外的空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 */
public class Array1 {

    public void test() {
        int[] a = {1, 1, 2, 2, 3, 4, 5, 6, 100, 100, 100};
        System.out.println(removeDuplicates(a));
    }

    private int removeDuplicates(int[] datas) {
        if (datas == null || datas.length == 0) {
            return 0;
        }
        if (datas.length == 1) {
            return 1;
        }
        int left = 0;
        for (int right = 1; right < datas.length; right++) {
            if (datas[left] != datas[right]) {
                datas[++left] = datas[right];
            }
        }
        return ++left;
    }

}
