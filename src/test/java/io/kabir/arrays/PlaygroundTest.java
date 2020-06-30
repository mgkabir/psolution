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
}