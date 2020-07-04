package io.kabir.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlaygroundTest {

    Playground playground = null;

    @BeforeEach
    void setup() {
        playground = new Playground();
    }

    @Test
    void negativeSubArrayNumber() {
        int[] myArray = {1, -2, 4, -5, 1};
        assertEquals(9, playground.negativeSubArrayNumber(myArray));
    }

    @Test
    void testSquredSortedArray() {
        int[] input = {-4, -1, 0, 3, 10};
        int[] expectedOutput = {0, 1, 9, 16, 100};
        assertArrayEquals(expectedOutput, playground.squredSortedArray(input));
    }
}