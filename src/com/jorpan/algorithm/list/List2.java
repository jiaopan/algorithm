package com.jorpan.algorithm.list;

import com.jorpan.algorithm.module.ListNode;

/**
 * 删除链表的倒数第N个节点
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 * <p>
 * 示例 1：
 * 输入：head = [1,2,3,4,5], n = 2
 * 输出：[1,2,3,5]
 */
public class List2 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode first = head;
        ListNode last = head;
        while (n > 0) {
            last = last.next;
            n--;
        }

        if (last == null) {
            return head.next;
        }
        while (last.next != null) {
            first = first.next;
            last = last.next;
        }

        first.next = first.next.next;
        return head;

    }

}
