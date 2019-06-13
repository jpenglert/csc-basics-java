package com.jenglert.csc.katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayKataTest {
    @Test
    void initializeArray_valid_values() {
        assertArrayEquals(new int[]{}, ArrayKata.initializeArray(0));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, ArrayKata.initializeArray(5));
    }

    @Test
    void initializeArray_invalid_values() {
        assertThrows(IllegalArgumentException.class, () -> ArrayKata.initializeArray(-1));
    }

    @Test
    void insertElement_valid_values() {
        assertArrayEquals(new int[]{1}, ArrayKata.insertElement(new int[]{}, 1, 0));
        assertArrayEquals(new int[]{2, 1}, ArrayKata.insertElement(new int[]{1}, 2, 0));
        assertArrayEquals(new int[]{1, 2}, ArrayKata.insertElement(new int[]{1}, 2, 1));
        assertArrayEquals(new int[]{1, 3, 2}, ArrayKata.insertElement(new int[]{1, 2}, 3, 1));
    }

    @Test
    void insertElement_invalid_values() {
        assertThrows(NullPointerException.class, () -> ArrayKata.insertElement(null, 0, 0));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> ArrayKata.insertElement(new int[]{1}, 0, -1));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> ArrayKata.insertElement(new int[]{1}, 0, 2));
    }

    @Test
    void removeElement_valid_values() {
        assertArrayEquals(new int[]{}, ArrayKata.removeElement(new int[]{1}, 0));
        assertArrayEquals(new int[]{2}, ArrayKata.removeElement(new int[]{1, 2}, 0));
        assertArrayEquals(new int[]{1}, ArrayKata.removeElement(new int[]{1, 2}, 1));
        assertArrayEquals(new int[]{1, 3}, ArrayKata.removeElement(new int[]{1, 2, 3}, 1));
    }

    @Test
    void removeElement_invalid_values() {
        assertThrows(NullPointerException.class, () -> ArrayKata.removeElement(null, 0));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> ArrayKata.removeElement(new int[]{1}, -1));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> ArrayKata.removeElement(new int[]{1}, 2));
    }

    @Test
    void searchElement_valid_values() {
        assertEquals(-1, ArrayKata.searchElement(new int[]{}, 1));
        assertEquals(-1, ArrayKata.searchElement(new int[]{0}, 1));
        assertEquals(-1, ArrayKata.searchElement(new int[]{2}, 1));

        assertEquals(0, ArrayKata.searchElement(new int[]{1, 2, 3}, 1));
        assertEquals(1, ArrayKata.searchElement(new int[]{1, 2, 3}, 2));
        assertEquals(2, ArrayKata.searchElement(new int[]{1, 2, 3}, 3));

        assertEquals(0, ArrayKata.searchElement(new int[]{1, 2, 1}, 1));
    }

    @Test
    void searchElement_invalid_values() {
        assertThrows(NullPointerException.class, () -> ArrayKata.searchElement(null, 0));
    }

    @Test
    void sumFirstValues_valid_values() {
        assertEquals(0, ArrayKata.sumFirstValues(new int[]{1}, 0));
        assertEquals(1, ArrayKata.sumFirstValues(new int[]{1}, 1));
        assertEquals(3, ArrayKata.sumFirstValues(new int[]{1, 2}, 2));

        assertEquals(3, ArrayKata.sumFirstValues(new int[]{1, 2, 3, 4, 5}, 2));
        assertEquals(6, ArrayKata.sumFirstValues(new int[]{1, 2, 3, 4, 5}, 3));
        assertEquals(10, ArrayKata.sumFirstValues(new int[]{1, 2, 3, 4, 5}, 4));
        assertEquals(15, ArrayKata.sumFirstValues(new int[]{1, 2, 3, 4, 5}, 5));
    }

    @Test
    void sumFirstValues_invalid_values() {
        assertThrows(NullPointerException.class, () -> ArrayKata.sumFirstValues(null, 0));
        assertThrows(IllegalArgumentException.class, () -> ArrayKata.sumFirstValues(new int[]{1}, -1));
        assertThrows(IllegalArgumentException.class, () -> ArrayKata.sumFirstValues(new int[]{1}, 2));
    }
}
