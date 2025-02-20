package com.epam.utils;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @ParameterizedTest
    @CsvSource({
            "10, true",
            "0, false",
            "-5, false",
            "100, true",
            "12.34, true",
            "abc, false",
            "'', false"
    })
    void test_isPositiveNumber(String input, boolean expected) {
        assertEquals(expected, StringUtils.isPositiveNumber(input));
    }

    @Test
    void test_isPositiveNumber_nullInput() {
        assertFalse(StringUtils.isPositiveNumber(null));
    }
}
