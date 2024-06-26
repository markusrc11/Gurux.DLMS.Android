package gurux.dlms;

import java.lang.annotation.Native;

public class GXUInt16 extends Number implements Comparable<GXUInt16> {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private int value;

    /**
     * A constant holding the minimum value an {@code unsigned short} can have.
     */
    @Native
    public static final int MIN_VALUE = 0x0000000;

    /**
     * A constant holding the maximum value an {@code unsigned short} can have,
     * 2<sup>16</sup>.
     */
    @Native
    public static final int MAX_VALUE = 0xffff;

    /**
     * Constructor.
     */
    public GXUInt16() {
    }

    /**
     * Constructor.
     * 
     * @param val
     *            Initial value.
     */
    public GXUInt16(final int val) {
        value = val;
    }

    public static GXUInt16 valueOf(int i) {
        return new GXUInt16(i);
    }

    @Override
    public final String toString() {
        return String.valueOf(value);
    }

    @Override
    public int intValue() {
        return value;
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
    public int compareTo(GXUInt16 o) {
        return compare(this.value, o.value);
    }

    public static int compare(int x, int y) {
        return (x < y) ? -1 : ((x == y) ? 0 : 1);
    }

    @Override
    public boolean equals(Object x) {
        if (x instanceof GXUInt16) {
            return ((Integer) value).equals(((GXUInt16) x).value);
        }
        return ((Integer) value).equals(x);
    }

    @Override
    public int hashCode() {
        return ((Integer) value).hashCode();
    }
}