//
// --------------------------------------------------------------------------
package gurux.dlms;

import gurux.dlms.internal.GXCommon;

/**
 * BitString class is used with Bit strings.
 */
public class GXBitString {

    /**
     * Bit string value.
     */
    private String value;

    /**
     * Constructor.
     */
    public GXBitString() {

    }

    /**
     * Constructor.
     * 
     * @param val
     *            Bit string value.
     */
    public GXBitString(final String val) {
        value = val;
    }

    /**
     * Constructor.
     * 
     * @param val
     *            Byte value.
     * @param count
     *            Bit count.
     */
    public GXBitString(final byte val, final int count) {
        StringBuilder sb = new StringBuilder();
        GXCommon.toBitString(sb, val, 8);
        if (count != 8) {
            value = sb.toString().substring(0, count);
        } else {
            value = sb.toString();
        }
    }

    /**
     * @return Bit string value.
     */
    public String getValue() {
        return value;
    }

    /**
     * @param val
     *            Bit string value.
     */
    public void setValue(final String val) {
        value = val;
    }

    @Override
    public final String toString() {
        return value;
    }

    private static void toBitString(StringBuilder sb, int value, int count) {
        if (count > 8) {
            count = 8;
        }
        for (int pos = 0; pos != count; ++pos) {
            if ((value & (1 << pos)) != 0) {
                sb.append("1");
            } else {
                sb.append("0");
            }
        }
    }

    /**
     * Convert integer value to BitString.
     * 
     * @param value
     *            Value to convert.
     * @param count
     *            Amount of the bits.
     * @return Bitstring
     */
    public static String toBitString(long value, int count) {
        StringBuilder sb = new StringBuilder();
        toBitString(sb, (byte) (value & 0xFF), count);
        if (count > 8) {
            toBitString(sb, (byte) ((value >> 8) & 0xFF), count - 8);
            if (count > 16) {
                toBitString(sb, (byte) ((value >> 16) & 0xFF), count - 16);
                if (count > 24) {
                    toBitString(sb, (byte) ((value >> 24) & 0xFF), count - 24);
                }
            }
        }
        if (sb.length() > count) {
            return sb.substring(0, count);
        }
        return sb.toString();
    }

    /**
     * @return Bit string value as integer.
     */
    public int toInteger() {
        int val = 0;
        if (value != null) {
            for (int pos = 0; pos != value.length(); ++pos) {
                if (value.charAt(pos) == '1') {
                    val |= (1 << pos);
                } else if (value.charAt(pos) != '0') {
                    throw new IllegalArgumentException("Invalid parameter");
                }
            }
        }
        return val;
    }
}
