package com.jenglert.csc.crackingthecodinginterview.ch1;

import org.junit.jupiter.api.Test;

import static com.jenglert.csc.crackingthecodinginterview.ch1.StringCompression.compress;
import static org.junit.jupiter.api.Assertions.*;

class StringCompressionTest {
    @Test
    void passes_given_example() {
        assertEquals("a2b1c5a3", compress("aabcccccaaa"));
    }

    @Test
    void returns_compressed_version_for_various_inputs() {
        assertEquals("a3", compress("aaa"));
        assertEquals("a2b3", compress("aabbb"));
        assertEquals("a2b2a3", compress("aabbaaa"));
    }

    @Test
    void returns_input_when_shorter_or_equal() {
        assertEquals("a", compress("a"));
        assertEquals("aa", compress("aa"));
        assertEquals("ab", compress("ab"));
        assertEquals("aab", compress("aab"));
    }

    @Test
    void empty_string(){
        assertEquals("", compress(""));
    }

    @Test
    void handles_null() {
        assertNull(compress(null));
    }
}
