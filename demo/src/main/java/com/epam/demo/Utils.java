package com.epam.demo;

import com.epam.utils.StringUtils;
import java.util.List;

public class Utils {
    /**
     * Returns true if all strings in the list represent positive numbers,
     * using the isPositiveNumber() method from StringUtils.
     */
    public static boolean isAllPositiveNumbers(List<String> args) {
        return args.stream().allMatch(StringUtils::isPositiveNumber);
    }
}
