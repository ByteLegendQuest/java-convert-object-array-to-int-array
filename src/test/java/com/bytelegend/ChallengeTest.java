package com.bytelegend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;

public class ChallengeTest {
    @Test
    public void test() {
        int randomInt = new Random().nextInt();
        double randomDouble = Math.random() * 100;
        float randomFloat = (float) (Math.random() * 100);
        String randomString = new Random().nextInt() + "";
        StringBuilder randomStringBuilder = new StringBuilder().append(new Random().nextInt());
        BigInteger randomBigInteger = new BigInteger(new Random().nextInt() + "");
        BigDecimal randomBigDecimal = new BigDecimal(new Random().nextInt() + "");
        Assertions.assertArrayEquals(
                new int[] {
                    randomInt,
                    (int) randomDouble,
                    (int) randomFloat,
                    Integer.parseInt(randomString),
                    Integer.parseInt(randomStringBuilder.toString()),
                    randomBigInteger.intValue(),
                    randomBigDecimal.intValue()
                },
                Challenge.convert(
                        new Object[] {
                            randomInt,
                            randomDouble,
                            randomFloat,
                            randomString,
                            randomStringBuilder,
                            randomBigInteger,
                            randomBigDecimal
                        }));
    }
}
