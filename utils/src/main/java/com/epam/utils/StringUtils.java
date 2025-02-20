package com.epam.utils;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (str == null || !NumberUtils.isParsable(str.trim())) {
            return false;
        }
        return Double.parseDouble(str.trim()) > 0;
    }
}
