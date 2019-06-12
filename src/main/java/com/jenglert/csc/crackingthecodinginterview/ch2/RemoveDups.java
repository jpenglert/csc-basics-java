package com.jenglert.csc.crackingthecodinginterview.ch2;

import com.jenglert.csc.datastructure.LinkedListNode;

import java.util.HashSet;

/**
 * Chapter 2, problem 2.1 "Remove Dups"
 *
 * Write code to remove duplicates from an unsorted linked list.
 *
 * Follow Up:
 *
 * How would you solve this problem if a temporary buffer is not allowed?
 */
public class RemoveDups {
    private RemoveDups() {}

    /**
     * Time: O(n)
     * Space: O(n)
     *
     * @param n the head node of list to de-duplicate
     */
    public static void removeDupsWithHashMap(LinkedListNode n) {
        // Return early if zero or single node
        if (n == null || n.next == null) {
            return;
        }

        // Use a HashMap to keep track of values that have been seen
        HashSet<Integer> seen = new HashSet<>();
        seen.add(n.data);

        LinkedListNode cur = n;
        while (cur.next != null) {
            if (seen.contains(cur.next.data)) {
                cur.setNext(cur.next.next);
            } else {
                seen.add(cur.next.data);
                cur = cur.next;
            }
        }
    }

    /**
     * Time: O(n^2)
     * Space: O(1)
     *
     * @param head the head node of list to de-duplicate
     */
    public static void removeDupsBruteForce(LinkedListNode head) {
        // Return early if zero or single node
        if (head == null || head.next == null) {
            return;
        }

        // For each node check all subsequent nodes for duplicates
        LinkedListNode cur = head;
        while (cur != null && cur.next != null) {
            LinkedListNode runner = cur;
            while (runner.next != null) {
                if (cur.data == runner.next.data) {
                    runner.setNext(runner.next.next);
                } else {
                    runner = runner.next;
                }
            }

            cur = cur.next;
        }
    }
}
