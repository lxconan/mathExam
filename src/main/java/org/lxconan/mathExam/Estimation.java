package org.lxconan.mathExam;

public class Estimation {
    private final int minimumSeconds;
    private final int maximumSeconds;

    public Estimation(int minimumSeconds, int maximumSeconds) {
        this.minimumSeconds = minimumSeconds;
        this.maximumSeconds = maximumSeconds;
    }

    int getMinimumSeconds() {
        return minimumSeconds;
    }

    int getMaximumSeconds() {
        return maximumSeconds;
    }

    public int getMinimumMinutes() {
        return toMinutes(minimumSeconds);
    }

    public int getMaximumMinutes() {
        return toMinutes(maximumSeconds);
    }

    private static int toMinutes(int seconds) {
        double minutes = seconds / 60.0;
        return (int)Math.ceil(minutes);
    }
}
