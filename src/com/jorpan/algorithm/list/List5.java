package com.jorpan.algorithm.list;

import com.jorpan.algorithm.module.ListNode;

import java.util.HashSet;
import java.util.Set;

public class List5 {
    public boolean hasCycle(ListNode head) {
        Set sets = new HashSet();
        while (head != null) {
            if (!sets.add(head)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }

    public boolean hasCycle2(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
