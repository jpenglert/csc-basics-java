package com.jenglert.csc.katas;

/**
 * A simple kata for performing basic operations on a primitive int array.
 * Fill in the empty methods and run the corresponding test suite.
 */
public class ArrayKata {
    private ArrayKata() {}

    /**
     * Initialize an array with the first n numbers.
     * E.g., if n = 5 then create array with numbers [1, 2, 3, 4, 5]
     *
     * @param n the size of the array
     * @return an array initialized with the first n numbers
     * @throws IllegalArgumentException if n is negative
     */
    public static int[] initializeArray(int n) {
        throw new AssertionError("Not implemented");
    }

    /**
     * Insert single element into array at specified index.
     *
     * @param arr the array to insert into
     * @param element the element to insert
     * @param ndx the index to insert element at
     * @return a new array with the inserted element
     * @throws ArrayIndexOutOfBoundsException if ndx is negative or greater than array length
     * @throws NullPointerException if array is null
     */
    public static int[] insertElement(int[] arr, int element, int ndx) {
        throw new AssertionError("Not implemented");
    }

    /**
     * Remove single element from array at specified index
     *
     * @param arr the array to remove from
     * @param ndx the index to remove
     * @return a new array with the element removed
     * @throws ArrayIndexOutOfBoundsException if ndx is negative or greater than array length
     * @throws NullPointerException if array is null
     */
    public static int[] removeElement(int[] arr, int ndx) {
        throw new AssertionError("Not implemented");
    }

    /**
     *
     * @param arr the array to search
     * @param element the element to search for
     * @return the index of the first element if found else -1
     * @throws NullPointerException if array is null
     */
    public static int searchElement(int[] arr, int element) {
        throw new AssertionError("Not implemented");
    }

    /**
     * Sum first n values in array.
     *
     * @param arr the array to sum values from
     * @param n the number of values to sum
     * @throws NullPointerException if array is null
     * @throws IllegalArgumentException if n is negative or greater than length of array
     */
    public static long sumFirstValues(int[] arr, int n) {
        throw new AssertionError("Not implemented");
    }
}
