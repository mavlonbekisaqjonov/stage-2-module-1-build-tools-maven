package com.epam.demo;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    @Test
    void test_isAllPositiveNumbers_allPositive() {
        assertTrue(Utils.isAllPositiveNumbers(Arrays.asList("1", "2", "3", "100")));
    }

    @Test
    void test_isAllPositiveNumbers_containsNegative() {
        assertFalse(Utils.isAllPositiveNumbers(Arrays.asList("1", "-2", "3")));
    }

    @Test
    void test_isAllPositiveNumbers_containsZero() {
        assertFalse(Utils.isAllPositiveNumbers(Arrays.asList("1", "0", "3")));
    }

    @Test
    void test_isAllPositiveNumbers_containsNonNumeric() {
        // When non-numeric, our StringUtils returns false, so overall result should be false.
        assertFalse(Utils.isAllPositiveNumbers(Arrays.asList("1", "abc", "3")));
    }

    @Test
    void test_isAllPositiveNumbers_emptyList() {
        // An empty list should return true since there is no negative number present.
        assertTrue(Utils.isAllPositiveNumbers(Collections.emptyList()));
    }
}
