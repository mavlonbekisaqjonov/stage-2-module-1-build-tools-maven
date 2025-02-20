package com.epam.utils;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    /**
     * Checks if the input string represents a positive number.
     * Returns false if the string is null, empty, or not a valid number.
     */
    public static boolean isPositiveNumber(String str) {
        if (str == null || str.trim().isEmpty()) {
            return false;
        }
        // Trim and check if it's a valid number using Apache Commons Lang
        if (!NumberUtils.isCreatable(str.trim())) {
            return false;
        }
        // Parse the number and check if it's greater than zero
        try {
            return Double.parseDouble(str.trim()) > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
