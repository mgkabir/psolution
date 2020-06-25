package io.kabir.maths;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    MathUtils mUtils = null;
    @BeforeEach
    void setUp() {
        mUtils = new MathUtils();
    }

    @AfterEach
    void tearDown() {
        mUtils = null;
    }

    @Test
    void testAdd() {
        assertEquals(5, mUtils.add(2,3));
        assertNotEquals(5, mUtils.add(7,3));
    }
}