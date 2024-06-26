package gurux.dlms;

import java.lang.annotation.Native;
import java.math.BigInteger;

public class GXUInt64 extends Number implements Comparable<GXUInt64> {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private BigInteger value;

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
    public static final long MAX_VALUE = 0xffffffffffffffffL;

    /**
     * Constructor.
     */
    public GXUInt64() {
    }

    /**
     * Constructor.
     * 
     * @param val
     *            Initial value.
     */
    public GXUInt64(final long val) {
        value = BigInteger.valueOf(val);
    }

    /**
     * Constructor.
     * 
     * @param val
     *            Initial value.
     */
    public GXUInt64(final BigInteger val) {
        value = val;
    }

    @Override
    public final String toString() {
        return String.valueOf(value);
    }

    @Override
    public int intValue() {
        return value.intValue();
    }

    @Override
    public long longValue() {
        return value.longValue();
    }

    @Override
    public float floatValue() {
        return value.floatValue();
    }

    @Override
    public double doubleValue() {
        return value.doubleValue();
    }

    @Override
    public int compareTo(GXUInt64 o) {
        return this.value.compareTo(o.value);
    }

    @Override
    public boolean equals(Object x) {
        if (x instanceof GXUInt64) {
            return this.value.equals(((GXUInt64) x).value);
        }
        return this.value.equals(x);
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}