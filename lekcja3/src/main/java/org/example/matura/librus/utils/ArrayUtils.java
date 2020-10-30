package org.example.matura.librus.utils;

import java.util.Arrays;
import java.util.List;

public class ArrayUtils {

    @SafeVarargs
    public static <T> List<T> listOf(T... t) {
        return Arrays.asList(t);
    }
}
