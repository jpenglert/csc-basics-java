package com.jenglert.csc.katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BitManipulationKataTest {

    @Test
    void getBit() {
        assertFalse(BitManipulationKata.getBit(0b0, 0));
        assertTrue(BitManipulationKata.getBit(0b01, 0));

        assertFalse(BitManipulationKata.getBit(0b10, 0));
        assertTrue(BitManipulationKata.getBit(0b10, 1));

        assertTrue(BitManipulationKata.getBit(0b1000, 3));
    }

    @Test
    void setBit() {
        assertEquals(1, BitManipulationKata.setBit(0, 0));
        assertEquals(1, BitManipulationKata.setBit(1, 0));

        assertEquals(0b1001, BitManipulationKata.setBit(0b1000, 0));
        assertEquals(0b1010, BitManipulationKata.setBit(0b1000, 1));
        assertEquals(0b1100, BitManipulationKata.setBit(0b1000, 2));
        assertEquals(0b1000, BitManipulationKata.setBit(0b1000, 3));
    }

    @Test
    void clearBit() {
        assertEquals(0b1110, BitManipulationKata.clearBit(0b1111, 0));
        assertEquals(0b1101, BitManipulationKata.clearBit(0b1111, 1));
        assertEquals(0b1011, BitManipulationKata.clearBit(0b1111, 2));
        assertEquals(0b0111, BitManipulationKata.clearBit(0b1111, 3));
    }

    @Test
    void clearBitsMSBthroughI() {
        assertEquals(0b0000, BitManipulationKata.clearBitsMSBthroughI(0b1111, 0));
        assertEquals(0b0001, BitManipulationKata.clearBitsMSBthroughI(0b1111, 1));
        assertEquals(0b0011, BitManipulationKata.clearBitsMSBthroughI(0b1111, 2));
        assertEquals(0b0111, BitManipulationKata.clearBitsMSBthroughI(0b1111, 3));
    }

    @Test
    void clearBitsIthrough0() {
        assertEquals(0b1110, BitManipulationKata.clearBitsIthrough0(0b1111, 0));
        assertEquals(0b1100, BitManipulationKata.clearBitsIthrough0(0b1111, 1));
        assertEquals(0b1000, BitManipulationKata.clearBitsIthrough0(0b1111, 2));
        assertEquals(0b0000, BitManipulationKata.clearBitsIthrough0(0b1111, 3));
    }

    @Test
    void updateBit() {
        assertEquals(0b0001, BitManipulationKata.updateBit(0b0000, 0, true));
        assertEquals(0b1111, BitManipulationKata.updateBit(0b1111, 0, true));
        assertEquals(0b1110, BitManipulationKata.updateBit(0b1111, 0, false));

        assertEquals(0b0010, BitManipulationKata.updateBit(0b0000, 1, true));
        assertEquals(0b1111, BitManipulationKata.updateBit(0b1111, 1, true));
        assertEquals(0b1101, BitManipulationKata.updateBit(0b1111, 1, false));

        assertEquals(0b0100, BitManipulationKata.updateBit(0b0000, 2, true));
        assertEquals(0b1111, BitManipulationKata.updateBit(0b1111, 2, true));
        assertEquals(0b1011, BitManipulationKata.updateBit(0b1111, 2, false));

        assertEquals(0b1000, BitManipulationKata.updateBit(0b0000, 3, true));
        assertEquals(0b1111, BitManipulationKata.updateBit(0b1111, 3, true));
        assertEquals(0b0111, BitManipulationKata.updateBit(0b1111, 3, false));
    }
}
