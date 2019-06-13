package com.jenglert.csc.katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchKataTest {

    @Test
    void binarySearch() {
        assertEquals(0, BinarySearchKata.binarySearch(new int[]{1}, 1));
        assertEquals(1, BinarySearchKata.binarySearch(new int[]{1, 2}, 2));
        assertEquals(2, BinarySearchKata.binarySearch(new int[]{1, 2, 3}, 3));

        assertEquals(1, BinarySearchKata.binarySearch(new int[]{1, 2, 3, 4, 5}, 2));
        assertEquals(3, BinarySearchKata.binarySearch(new int[]{1, 2, 3, 4, 5}, 4));

        assertEquals(-1, BinarySearchKata.binarySearch(new int[]{1, 2, 3, 4, 5}, 0));
        assertEquals(-1, BinarySearchKata.binarySearch(new int[]{1, 2, 3, 4, 5}, 6));
    }

    @Test
    void binarySearchRecursive() {
        assertEquals(0, BinarySearchKata.binarySearchRecursive(new int[]{1}, 1));
        assertEquals(1, BinarySearchKata.binarySearchRecursive(new int[]{1, 2}, 2));
        assertEquals(2, BinarySearchKata.binarySearchRecursive(new int[]{1, 2, 3}, 3));

        assertEquals(1, BinarySearchKata.binarySearchRecursive(new int[]{1, 2, 3, 4, 5}, 2));
        assertEquals(3, BinarySearchKata.binarySearchRecursive(new int[]{1, 2, 3, 4, 5}, 4));

        assertEquals(-1, BinarySearchKata.binarySearchRecursive(new int[]{1, 2, 3, 4, 5}, 0));
        assertEquals(-1, BinarySearchKata.binarySearchRecursive(new int[]{1, 2, 3, 4, 5}, 6));
    }
}
