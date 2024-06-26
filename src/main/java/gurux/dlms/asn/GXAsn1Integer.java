package gurux.dlms.asn;

import java.math.BigInteger;

import gurux.dlms.GXByteBuffer;

/**
 * ASN1 bit string
 */
public class GXAsn1Integer {
    /**
     * Bit string.
     */
    private byte[] value;

    /**
     * Constructor.
     */
    public GXAsn1Integer() {

    }

    /**
     * Constructor
     * 
     * @param data
     *            Integer.
     */
    public GXAsn1Integer(final byte[] data) {
        if (data == null) {
            throw new IllegalArgumentException("data");
        }
        value = data;
    }

    /**
     * Constructor
     * 
     * @param data
     *            Data.
     * @param index
     *            Index.
     * @param count
     *            Count.
     */
    public GXAsn1Integer(final byte[] data, final int index, final int count) {
        if (data == null || data.length < index + count) {
            throw new IllegalArgumentException("data");
        }
        value = new byte[count];
        System.arraycopy(data, index, value, 0, count);
    }

    /**
     * Constructor
     * 
     * @param data
     *            Integer.
     */
    public GXAsn1Integer(final String data) {
        if (data == null) {
            throw new IllegalArgumentException("data");
        }
        value = new BigInteger(data).toByteArray();
    }

    /**
     * @return Bit string.
     */
    public final byte[] getByteArray() {
        return value;
    }

    /**
     * @return Get integer value as int.
     */
    public final byte toByte() {
        GXByteBuffer bb = new GXByteBuffer(value);
        return bb.getInt8();
    }

    /**
     * @return Get integer value as short.
     */
    public final short toShort() {
        GXByteBuffer bb = new GXByteBuffer(value);
        return bb.getInt16();
    }

    /**
     * @return Get integer value as int.
     */
    public final int toInt() {
        GXByteBuffer bb = new GXByteBuffer(value);
        return bb.getInt32();
    }

    /**
     * @return Get integer value as long.
     */
    public final long toLong() {
        GXByteBuffer bb = new GXByteBuffer(value);
        return bb.getInt64();
    }

    @Override
    public final String toString() {
        String str;
        switch (value.length) {
        case 1:
            str = String.valueOf(toByte());
            break;
        case 2:
            str = String.valueOf(toShort());
            break;
        case 4:
            str = String.valueOf(toInt());
            break;
        case 8:
            str = String.valueOf(toLong());
            break;
        default:
            str = new BigInteger(value).toString();
        }
        return str;
    }
}
