package com.epam.utils;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    /**
     * Returns true if the input string represents a valid number that is greater than zero.
     * Returns false if the string is null, empty, not a valid number, or not positive.
     */
    public static boolean isPositiveNumber(String str) {
        if (str == null || str.trim().isEmpty()) {
            return false;
        }
        String trimmed = str.trim();
        // Use Apache Commons Lang to check if the string can be parsed as a number
        if (!NumberUtils.isCreatable(trimmed)) {
            return false;
        }
        try {
            return Double.parseDouble(trimmed) > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

