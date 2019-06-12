package com.jenglert.csc.crackingthecodinginterview.ch2;

import com.jenglert.csc.datastructure.LinkedListNode;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static com.jenglert.csc.crackingthecodinginterview.ch2.RemoveDups.removeDupsBruteForce;
import static com.jenglert.csc.crackingthecodinginterview.ch2.RemoveDups.removeDupsWithHashMap;
import static org.junit.jupiter.api.Assertions.*;

class RemoveDupsTest {

    @Nested
    class RemoveDupsWithHashMap {
        @Test
        void handle_null() {
            removeDupsWithHashMap(null);
        }

        @Test
        void single_node() {
            LinkedListNode head = new LinkedListNode(1);
            removeDupsWithHashMap(head);
            assertNull(head.next);
        }

        @Test
        void single_adjacent_duplicate() {
            LinkedListNode head = new LinkedListNode(1);
            LinkedListNode duplicate = new LinkedListNode(1);
            head.setNext(duplicate);

            removeDupsWithHashMap(head);

            assertNull(head.next);
        }

        @Test
        void single_non_adjacent_duplicate() {
            LinkedListNode head = new LinkedListNode(1);
            LinkedListNode middle = new LinkedListNode(2);
            LinkedListNode duplicate = new LinkedListNode(1);

            head.setNext(middle);
            middle.setNext(duplicate);

            removeDupsWithHashMap(head);

            assertNotNull(head.next);
            assertNull(middle.next);
        }
    }

    @Nested
    class RemoveDupsBruteForce {
        @Test
        void handle_null() {
            removeDupsBruteForce(null);
        }

        @Test
        void single_node() {
            LinkedListNode head = new LinkedListNode(1);
            removeDupsBruteForce(head);
            assertNull(head.next);
        }

        @Test
        void single_adjacent_duplicate() {
            LinkedListNode head = new LinkedListNode(1);
            LinkedListNode duplicate = new LinkedListNode(1);
            head.setNext(duplicate);

            removeDupsBruteForce(head);

            assertNull(head.next);
        }

        @Test
        void single_non_adjacent_duplicate() {
            LinkedListNode head = new LinkedListNode(1);
            LinkedListNode middle = new LinkedListNode(2);
            LinkedListNode duplicate = new LinkedListNode(1);

            head.setNext(middle);
            middle.setNext(duplicate);

            removeDupsBruteForce(head);

            assertNotNull(head.next);
            assertNull(middle.next);
        }
    }
}
