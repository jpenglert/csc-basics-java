package com.jenglert.csc.crackingthecodinginterview.ch2;

import com.jenglert.csc.datastructure.LinkedListNode;

/**
 * Chapter 2, problem 1.2 "Return Kth to Last"
 *
 * Implement an algorithm to find the kth to last element of a singly linked list.
 */
public class ReturnKthToLastSolutions {
    private ReturnKthToLastSolutions() {}

    public interface ReturnKthToLast {
        LinkedListNode returnKthToLast(LinkedListNode head, int k);
    }

    public static class WithListLength implements ReturnKthToLast {
        @Override
        public LinkedListNode returnKthToLast(LinkedListNode head, int k) {
            if (head == null || k <= 0) {
                return null;
            }

            int length = 0;
            LinkedListNode n = head;
            while (n != null) {
                length++;
                n = n.next;
            }

            int x = length - k;
            if (x < 0 || x >= length) {
                return null;
            }

            n = head;
            for (int i = 0; i < x; i++) {
                n = n.next;
            }

            return n;
        }
    }

    /**
     * Time: O(n)
     * Space: O(n) method calls on stack
     */
    public static class Recursive implements ReturnKthToLast {
        private static class Index {
            int length;
        }

        @Override
        public LinkedListNode returnKthToLast(LinkedListNode head, int k) {
            return recursive(head, k, new Index());
        }

        private LinkedListNode recursive(LinkedListNode head, int k, Index ndx) {
            // Base case for end of list
            if (head == null) {
                return null;
            }

            LinkedListNode node = recursive(head.next, k, ndx);
            // Last node in list will be 1, second to last will be 2, etc...
            ndx.length++;
            if (ndx.length == k) {
                return head;
            }
            return node;
        }
    }

    /**
     * Time: O(n)
     * Space: O(1)
     */
    public static class SingleIteration implements ReturnKthToLast {
        @Override
        public LinkedListNode returnKthToLast(LinkedListNode head, int k) {
            if (head == null || k <= 0) {
                return null;
            }

            LinkedListNode p1 = head;
            LinkedListNode p2 = head;

            for (int i = 0; i < k; i++) {
                if (p1 == null) {
                    return null;
                }
                p1 = p1.next;
            }

            while (p1 != null) {
                p1 = p1.next;
                p2 = p2.next;
            }

            return p2;
        }
    }
}
