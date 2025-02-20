package com.epam.utils;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (str == null || str.trim().isEmpty()) {
            return false;
        }
        String trimmed = str.trim();

        try {
            return Double.parseDouble(trimmed) > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

