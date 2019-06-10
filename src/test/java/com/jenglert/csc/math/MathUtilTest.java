package com.jenglert.csc.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import static com.jenglert.csc.math.MathUtil.*;

class MathUtilTest {

    @Test
    void is_odd() {
        assertTrue(isOdd(1));
        assertTrue(isOdd(3));
        assertTrue(isOdd(5));

        assertFalse(isOdd(0));
        assertFalse(isOdd(2));
        assertFalse(isOdd(4));
    }

    @Test
    void is_even() {
        assertFalse(isEven(1));
        assertFalse(isEven(3));
        assertFalse(isEven(5));

        assertTrue(isEven(0));
        assertTrue(isEven(2));
        assertTrue(isEven(4));
    }
}
