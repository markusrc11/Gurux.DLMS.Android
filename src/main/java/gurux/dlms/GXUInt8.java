package gurux.dlms;

import java.lang.annotation.Native;

public class GXUInt8 extends Number implements Comparable<GXUInt8> {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private short value;

    /**
     * A constant holding the minimum value an {@code byte} can have.
     */
    @Native
    public static final short MIN_VALUE = 0x0000000;

    /**
     * A constant holding the maximum value an {@code byte} can have,
     * 2<sup>8</sup>.
     */
    @Native
    public static final short MAX_VALUE = 0xff;

    /**
     * Constructor.
     */
    public GXUInt8() {
    }

    /**
     * Constructor.
     * 
     * @param val
     *            Initial value.
     */
    public GXUInt8(final short val) {
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
    public int compareTo(GXUInt8 o) {
        return compare(this.value, o.value);
    }

    public static int compare(long x, long y) {
        return (x < y) ? -1 : ((x == y) ? 0 : 1);
    }

    @Override
    public boolean equals(Object x) {
        if (x instanceof GXUInt8) {
            return ((Short) value).equals(((GXUInt8) x).value);
        }
        return ((Short) value).equals(x);
    }

    @Override
    public int hashCode() {
        return ((Short) value).hashCode();
    }
}