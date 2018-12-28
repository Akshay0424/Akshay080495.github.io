package com.practice.testing;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    Palindrome palindromeChecker = new Palindrome();

    @Test
    public void palindromeCheckTest1() throws Exception{

        String expectedValue = "Not a Palindrome";

        String actualValue = palindromeChecker.checkString("Hello");

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void palindromeCheckTest2() throws Exception{

        String expectedValue = "Palindrome";

        String actualValue = palindromeChecker.checkString("momo");

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void palindromeCheckTest3() throws Exception{

        String expectedValue = "Not a Valid String";

        String actualValue = palindromeChecker.checkString(null);

        assertEquals(expectedValue, actualValue);
    }
}