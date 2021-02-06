package org.lxconan.mathExam;

import java.util.Random;
import java.util.UUID;

public class RandomNumberGenerator {
    public static int createNumber(int minInclusive, int maxExclusive) {
        return getRandom().nextInt(maxExclusive - minInclusive) + minInclusive;
    }

    private static Random getRandom() {
        return new Random(UUID.randomUUID().hashCode());
    }
}
