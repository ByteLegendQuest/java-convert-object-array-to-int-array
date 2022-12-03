package com.bytelegend;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

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
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < objects.length; i++) {
            if(objects[i] instanceof Integer){
                list.add((Integer) objects[i]);
            } else if (objects[i] instanceof Double) {
                list.add(((Double)objects[i]).intValue());
            } else if (objects[i] instanceof Float) {
                list.add(((Float)objects[i]).intValue());
            } else if (objects[i] instanceof String) {
                list.add(Integer.parseInt((String) objects[i]));
            }  else if (objects[i] instanceof StringBuilder) {
                list.add(Integer.parseInt(((StringBuilder) objects[i]).toString()));
            } else if (objects[i] instanceof BigInteger) {
                list.add(((BigInteger) objects[i]).intValue());
            } else if (objects[i] instanceof BigDecimal) {
                list.add(((BigDecimal) objects[i]).intValue());
            }
        }
        int[] ints = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ints[i] = list.get(i);
        }
        return ints;
    }
}
