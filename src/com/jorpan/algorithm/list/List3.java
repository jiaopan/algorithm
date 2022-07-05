package com.jorpan.algorithm.list;

import com.jorpan.algorithm.module.ListNode;

import java.util.Stack;

/**
 * 反转链表
 * 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 */
public class List3 {

    public ListNode reverse(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        if (stack.isEmpty()) {
            return null;
        }
        ListNode h1 = stack.pop();
        ListNode h2 = h1;
        while (!stack.isEmpty()) {
            h1.next = stack.pop();
            h1 = h1.next;
        }
        h1.next = null;
        return h2;
    }

    public ListNode reverse2(ListNode head) {
        ListNode newHead = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = newHead;
            newHead = head;
            head = temp;
        }
        return newHead;
    }

    public ListNode reverse3(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode next = head.next;
        ListNode reverse = reverse3(next);
        next.next = head;
        head.next = null;
        return reverse;
    }
}
