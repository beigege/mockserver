package org.mockserver.model;

/**
 * @author jamesdbloom
 */
public class VerificationTimes extends EqualsHashCodeToString {

    private final int count;
    private final boolean exact;

    private VerificationTimes(int count, boolean exact) {
        this.count = count;
        this.exact = exact;
    }

    public static VerificationTimes once() {
        return new VerificationTimes(1, true);
    }

    public static VerificationTimes exactly(int count) {
        return new VerificationTimes(count, true);
    }

    public static VerificationTimes atLeast(int count) {
        return new VerificationTimes(count, false);
    }

    public int getCount() {
        return count;
    }

    public boolean isExact() {
        return exact;
    }
}