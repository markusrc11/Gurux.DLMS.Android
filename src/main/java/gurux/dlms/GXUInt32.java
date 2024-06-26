package gurux.dlms;

import java.lang.annotation.Native;

public class GXUInt32 extends Number implements Comparable<GXUInt32> {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private long value;

    /**
     * A constant holding the minimum value an {@code unsigned short} can have.
     */
    @Native
    public static final long MIN_VALUE = 0x0000000;

    /**
     * A constant holding the maximum value an {@code unsigned short} can have,
     * 2<sup>32</sup>.
     */
    @Native
    public static final long MAX_VALUE = 0xffffffff;

    /**
     * Constructor.
     */
    public GXUInt32() {
    }

    /**
     * Constructor.
     * 
     * @param val
     *            Initial value.
     */
    public GXUInt32(final long val) {
        value = val;
    }

    @Override
    public final String toString() {
        return String.valueOf(value);
    }

    @Override
    public int intValue() {
        return (int) value;
    }

    @Override
    public long longValue() {
        return value;
    }

    @Override
    public float floatValue() {
        return value;
    }

    @Override
    public double doubleValue() {
        return value;
    }

    @Override
    public int compareTo(GXUInt32 o) {
        return compare(this.value, o.value);
    }

    public static int compare(long x, long y) {
        return (x < y) ? -1 : ((x == y) ? 0 : 1);
    }

    @Override
    public boolean equals(Object x) {
        if (x instanceof GXUInt32) {
            return ((Long) value).equals(((GXUInt32) x).value);
        }
        return ((Long) value).equals(x);
    }

    @Override
    public int hashCode() {
        return ((Long) value).hashCode();
    }
}