package gurux.dlms;

public class GXEnum extends Number implements Comparable<GXEnum> {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private int value;

    /**
     * Constructor.
     */
    public GXEnum() {
    }

    /**
     * Constructor.
     * 
     * @param val
     *            Initial value.
     */
    public GXEnum(final int val) {
        value = val;
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
    public int compareTo(GXEnum o) {
        return compare(this.value, o.value);
    }

    public static int compare(int x, int y) {
        return (x < y) ? -1 : ((x == y) ? 0 : 1);
    }
}