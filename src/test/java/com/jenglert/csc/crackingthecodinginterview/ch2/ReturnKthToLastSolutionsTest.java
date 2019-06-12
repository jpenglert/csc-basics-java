package com.jenglert.csc.crackingthecodinginterview.ch2;

import com.jenglert.csc.datastructure.LinkedListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReturnKthToLastSolutionsTest {

    static abstract class CommonTests {
        private ReturnKthToLastSolutions.ReturnKthToLast uut;

        protected abstract ReturnKthToLastSolutions.ReturnKthToLast createUut();

        @BeforeEach
        void beforeEash() {
            uut = createUut();
        }

        @Test
        void handle_null() {
            uut.returnKthToLast(null, 0);
        }

        @Test
        void handle_bad_k_inputs() {
            LinkedListNode head = new LinkedListNode(1);
            assertNull(uut.returnKthToLast(head, -1));
            assertNull(uut.returnKthToLast(head, 0));
            assertNull(uut.returnKthToLast(head, 2));
            assertNull(uut.returnKthToLast(head, -Integer.MAX_VALUE));
            assertNull(uut.returnKthToLast(head, Integer.MAX_VALUE));
        }

        @Test
        void single_node() {
            LinkedListNode head = new LinkedListNode(1);
            LinkedListNode result = uut.returnKthToLast(head, 1);
            assertSame(head, result);
        }

        @Test
        void two_nodes() {
            LinkedListNode head = new LinkedListNode(1);
            LinkedListNode second = new LinkedListNode(2);
            head.setNext(second);

            assertSame(second, uut.returnKthToLast(head, 1));
            assertSame(head, uut.returnKthToLast(head, 2));
        }

        @Test
        void three_nodes() {
            LinkedListNode head = new LinkedListNode(1);
            LinkedListNode second = new LinkedListNode(2);
            LinkedListNode third = new LinkedListNode(3);
            head.setNext(second);
            second.setNext(third);

            assertSame(third, uut.returnKthToLast(head, 1));
            assertSame(second, uut.returnKthToLast(head, 2));
            assertSame(head, uut.returnKthToLast(head, 3));
        }
    }

    @Nested
    class WithListLengthSolution extends CommonTests {
        protected ReturnKthToLastSolutions.ReturnKthToLast createUut() {
            return new ReturnKthToLastSolutions.WithListLength();
        }
    }

    @Nested
    class RecursiveSolution extends CommonTests {
        protected ReturnKthToLastSolutions.ReturnKthToLast createUut() {
            return new ReturnKthToLastSolutions.Recursive();
        }
    }

    @Nested
    class SingleIterationSolution extends CommonTests {
        protected ReturnKthToLastSolutions.ReturnKthToLast createUut() {
            return new ReturnKthToLastSolutions.SingleIteration();
        }
    }
}
