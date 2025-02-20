package com.epam.demo;
package org.example.demo;

import org.example.utils.StringUtils;
import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        return args.stream().allMatch(StringUtils::isPositiveNumber);
    }
}