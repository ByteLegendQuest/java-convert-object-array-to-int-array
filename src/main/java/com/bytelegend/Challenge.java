package com.bytelegend;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Challenge {
    /**
     * Given an array containing any objects `Object[]`, convert it to `int[]` array. The objects
     * can only be one of the following:
     *
     * <p>If the object is a `Number`, convert it to `int`;
     *
     * <p>If the object is a `CharSequence` (which is super interface of `String`), convert the
     * string it represents to `int`. No need to handle the conversion failure.
     *
     * <p>For example, input `[1, 2.0, 3.1, "4.999"]`, the output is `[1, 2, 3, 4]`.
     */
   public static int[] convert(Object[] objects) {
        int len = objects.length;
        int[] result = new int[len];
        for (int x = 0; x < len; x++) {
            if (objects[x] instanceof Number) {
                if (objects[x] instanceof Integer) {
                    result[x] = (int) objects[x];
                } else if (objects[x] instanceof Double) {
                    result[x] = ((Double) objects[x]).intValue();
                } else if (objects[x] instanceof Float) {
                    result[x] = ((Float) objects[x]).intValue();
                } else if (objects[x] instanceof BigInteger) {
                    result[x] = ((BigInteger) objects[x]).intValue();
                } else if (objects[x] instanceof BigDecimal) {
                    result[x] = ((BigDecimal) objects[x]).intValue();
                }
            } else {
                if (objects[x] instanceof String)
                    result[x] = Integer.valueOf((String) objects[x]);
                else if (objects[x] instanceof StringBuilder)
                    result[x] = Integer.valueOf(((StringBuilder) objects[x]).toString());

            }
        }
        return result;
    }
}
