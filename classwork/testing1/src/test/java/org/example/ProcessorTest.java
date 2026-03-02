package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProcessorTest {

    StringProcessor processor = new StringProcessor();

    @Test
    public void testConcatenate() {
        assertEquals("HelloWorld", processor.concatenate("Hello", "World"));
    }

    @Test
    public void testConcatenateWithNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            processor.concatenate(null, "World");
        });
    }

    @Test
    public void testIsPalindromeTrue() {
        assertTrue(processor.isPalindrome("madam"));
    }

    @Test
    public void testIsPalindromeFalse() {
        assertFalse(processor.isPalindrome("hello"));
    }

    @Test
    public void testIsPalindromeNull() {
        assertFalse(processor.isPalindrome(null));
    }
}