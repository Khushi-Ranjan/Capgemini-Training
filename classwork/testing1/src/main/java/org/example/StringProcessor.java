package org.example;

public class StringProcessor {

    public String concatenate(String a, String b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Strings cannot be null");
        }
        return a + b;  // Concat: Core logic.
    }

    public boolean isPalindrome(String str) {
        if (str == null) {
            return false;  // Edge case: Why? Null isn't a palindrome.
        }

        String reversed = new StringBuilder(str).reverse().toString();  // Reverse
        return str.equals(reversed);  // Compare: Why? Determines if it's a palindrome.
    }
}