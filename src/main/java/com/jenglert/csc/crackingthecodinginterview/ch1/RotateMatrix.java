package com.jenglert.csc.crackingthecodinginterview.ch1;

public class RotateMatrix {
    private RotateMatrix() {}

    public enum Direction { LEFT, RIGHT }

    public static int[][] rotate90Deg(int[][] matrix, Direction dir) {
        int[][] rotated = new int[matrix.length][matrix.length];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                switch (dir) {
                    case LEFT:
                        rotated[matrix.length - 1 - col][row] = matrix[row][col];
                        break;
                    case RIGHT:
                        rotated[col][matrix.length - 1 - row] = matrix[row][col];
                        break;
                    default:
                        throw new AssertionError("Missing case: " + dir);
                }
            }
        }

        return rotated;
    }
}
