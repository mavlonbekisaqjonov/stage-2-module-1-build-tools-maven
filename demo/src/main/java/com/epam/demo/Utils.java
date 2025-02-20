package com.epam.demo;

import com.epam.utils.StringUtils;
import java.util.List;

public class Utils {
    /**
     * Checks if all strings in the list represent positive numbers.
     */
    public static boolean isAllPositiveNumbers(List<String> args) {
        // Returns true if every element in the list is a positive number
        return args.stream().allMatch(StringUtils::isPositiveNumber);
    }
}
