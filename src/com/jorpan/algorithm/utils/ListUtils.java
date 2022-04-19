package com.jorpan.algorithm.utils;

import com.jorpan.algorithm.module.ListNode;

public class ListUtils {
    public static void printList(ListNode head) {
        ListNode cur = head;
        while (cur != null) {
            System.out.println(cur.val);
            cur = cur.next;
        }
    }
}
