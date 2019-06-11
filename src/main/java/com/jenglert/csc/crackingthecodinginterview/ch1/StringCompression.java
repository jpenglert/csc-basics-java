package com.jenglert.csc.crackingthecodinginterview.ch1;

/**
 * Chapter 1, problem 1.5 "String Compression"
 */
public class StringCompression {
    private StringCompression() {}

    /**
     * Compress a string (e.g., "aabbbaa" -> "a2b3a2").
     *
     * Time: O(n)
     * Space: O(n)
     *
     * @param str the string to compress
     * @return the compressed string if it's shorter than the original string; otherwise the original string
     */
    public static String compress(String str) {
        // Error checking
        if (str == null) {
            return null;
        }

        int count = 1;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                sb.append(str.charAt(i)).append(count);
                count = 1;
            }
        }

        return str.length() <= sb.length() ? str : sb.toString();
    }
}
