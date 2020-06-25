package io.kabir.strings;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringPlatformTest {
    StringPlatform platform;
    @BeforeEach
    void setUp() {
        platform = new StringPlatform();
    }

    @AfterEach
    void tearDown() {
        platform = null;
    }

    @Test
    void getSubString() {
        assertAll(
                ()->assertEquals("lowo",platform.getSubString("Helloworld",3,7)),
                ()->assertDoesNotThrow(()->platform.getSubString("anyString",1,3)),
                ()->assertThrows(IllegalArgumentException.class,()->platform.getSubString("sampleString",5,2))
                );
    }
}