package com.jenglert.csc.katas;

public class BinarySearchKata {
    private BinarySearchKata() {}

    /**
     * Performs a non-recursive binary search of a sorted array
     *
     * @param arr the sorted array to search
     * @param x the element to search for
     * @return index of element if found else -1
     */
    public static int binarySearch(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        int mid;

        while (low <= high) {
            mid = low + ((high - low) / 2);
            if (arr[mid] < x) {
                low = mid + 1;
            } else if (arr[mid] > x) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static int binarySearchRecursive(int[] arr, int x) {
        return binarySearchRecursive(arr, x, 0, arr.length - 1);
    }

    /**
     * Performs a ecursive binary search of a sorted array
     *
     * @param arr the sorted array to search
     * @param x the element to search for
     * @param low the low index to search
     * @param high the high index to search
     * @return index of element if found else -1
     */
    public static int binarySearchRecursive(int[] arr, int x, int low, int high) {
        if (low > high) {
            return -1;
        }

        int mid = low + ((high - low) / 2);
        if (arr[mid] < x) {
            return binarySearchRecursive(arr, x, mid + 1, high);
        } else if (arr[mid] > x) {
            return binarySearchRecursive(arr, x, low, mid - 1);
        } else {
            return mid;
        }
    }
}
