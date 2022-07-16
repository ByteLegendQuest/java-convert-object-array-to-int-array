package com.bytelegend;

import java.util.Arrays;

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
        int[] res = new int[objects.length];
        for (int i = 0; i < objects.length; i++) {
            Object tmp = objects[i];
            if (tmp instanceof Number) {
                res[i] = ((Number) tmp).intValue();
            } else if (tmp instanceof CharSequence) {
                res[i] = Integer.parseInt(tmp.toString());
            } else {
                res[i] = (int) tmp;
            }
        }
        return res;
    }
}
