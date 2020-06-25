package io.kabir.strings;

import org.junit.jupiter.api.*;

import java.time.Duration;
import java.time.temporal.TemporalUnit;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    Anagram anagram = null;

    @BeforeEach
    void setUp() {
        anagram = new Anagram();
    }

    @AfterEach
    void tearDown() {
        anagram = null;
    }

    @Test
    @DisplayName("Anagram Test")
    void testAnagram() {
        assertEquals(true, anagram.isAnagram("cat", "tac"));
        assertEquals(false, anagram.isAnagram("Shayan", "Kabeer"));
        // message is shown in case of failure
        assertEquals(true, anagram.isAnagram("Dhaka", "Dahka"), "Should return true if Anagram");
    }

    @Test
    @DisplayName("More Anagram Test")
    void testMoreAnagram() {
        assertEquals(false, anagram.isAnagram("cat", "dog"));
        assertEquals(false, anagram.isAnagram("anagram", "ana"));
    }

    @Test
    //@Disabled
    void testTimeOut(){
        assertTimeout(Duration.ofSeconds(3),()->anagram.delaySecond(2));
    }

    @Nested
    @DisplayName("Grouping Exception Tests")
    class ExceptionTest {
        @Test
        void testThrowsExcpetion() {
            assertThrows(IllegalArgumentException.class, () -> anagram.isAnagram("", "Dahka"));
            assertThrows(IllegalArgumentException.class, () -> anagram.isAnagram("Dhaka", null));
        }

        @Test
        void testNotThrowException() {
            assertDoesNotThrow(() -> anagram.isAnagram("Cat", "Act"));
        }
    }
}