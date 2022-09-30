package com.bytelegend;

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
        int[] ret = new int[objects.length];
        for (int i = 0; i < objects.length; i++) {
            Object o = objects[i];
            if (o instanceof Number) {
                ret[i] = ((Number) o).intValue();
            }
            if (o instanceof CharSequence) {
                int val = 0;
                CharSequence charSequence = (CharSequence) o;
                boolean minus = false;
                for (int j = 0; j < charSequence.length(); j++) {
                    if(charSequence.charAt(j) == '-'){
                        minus = true;
                        continue;
                    }
                    int d = charSequence.charAt(j) - '0';
                    val = val * 10 + d;
                }
                if(minus) {
                    val *= -1;
                }
                ret[i] = val;
            }
        }
        return ret;
    }
}
