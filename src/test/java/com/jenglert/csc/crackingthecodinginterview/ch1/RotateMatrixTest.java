package com.jenglert.csc.crackingthecodinginterview.ch1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateMatrixTest {
    @Test
    void rotate_2x2_right() {
        int[][] matrix = { {1, 2}, {3, 4} };
        int[][] expected = { {3, 1}, {4, 2} };
        assertArrayEquals(expected, RotateMatrix.rotate90Deg(matrix, RotateMatrix.Direction.RIGHT));
    }

    @Test
    void rotate_2x2_left() {
        int[][] matrix = { {1, 2}, {3, 4} };
        int[][] expected = { {2, 4}, {1, 3} };
        assertArrayEquals(expected, RotateMatrix.rotate90Deg(matrix, RotateMatrix.Direction.LEFT));
    }

    @Test
    void rotate_3x3_right() {
        int[][] matrix = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int[][] expected = { {7, 4, 1}, {8, 5, 2}, {9, 6, 3} };
        assertArrayEquals(expected, RotateMatrix.rotate90Deg(matrix, RotateMatrix.Direction.RIGHT));
    }

    @Test
    void rotate_3x3_left() {
        int[][] matrix = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int[][] expected = { {3, 6, 9}, {2, 5, 8}, {1, 4, 7} };
        assertArrayEquals(expected, RotateMatrix.rotate90Deg(matrix, RotateMatrix.Direction.LEFT));
    }
}
