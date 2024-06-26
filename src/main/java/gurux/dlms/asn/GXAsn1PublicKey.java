package gurux.dlms.asn;

import java.security.PublicKey;

import gurux.dlms.internal.GXCommon;

/**
 * ASN1 Public key.
 */
public class GXAsn1PublicKey {
    /**
     * Public key.
     */
    private byte[] value;

    private void init(final byte[] key) {
        if (key == null || key.length != 270) {
            throw new IllegalArgumentException("data");
        }
        value = new byte[key.length];
        System.arraycopy(key, 0, value, 0, key.length);
    }

    /**
     * Constructor.
     */
    public GXAsn1PublicKey() {

    }

    /**
     * Constructor
     * 
     * @param key
     *            Public key.
     */
    public GXAsn1PublicKey(final PublicKey key) {
        if (key == null) {
            throw new IllegalArgumentException("key");
        }
        Object[] data =
                (Object[]) GXAsn1Converter.fromByteArray(key.getEncoded());
        /*
         * GXByteBuffer bb = new GXByteBuffer(); bb.set(((GXAsn1BitString)
         * GXAsn1Converter.getDerValue(data[1])) .getValue());
         * init((GXAsn1BitString) GXAsn1Converter.getDerValue(data[1])); //
         * init(GXAsn1Converter.toByteArray( // new Object[] {
         * GXAsn1Converter.getDerValue(data[0]), //
         * GXAsn1Converter.getDerValue(data[1]) }));
         */

    }

    /**
     * Constructor for RSA Public Key (PKCS#1). This is read from PEM file.
     * 
     * @param data
     *            (PKCS#1) Public key.
     */
    public GXAsn1PublicKey(final GXAsn1BitString data) {
        if (data == null) {
            throw new IllegalArgumentException("key");
        }
        GXAsn1Sequence seq =
                (GXAsn1Sequence) GXAsn1Converter.fromByteArray(data.getValue());
        init(GXAsn1Converter
                .toByteArray(new Object[] { seq.get(0), seq.get(1) }));
    }

    /**
     * Constructor
     * 
     * @param key
     *            Public key.
     */
    public GXAsn1PublicKey(final byte[] key) {
        init(key);
    }

    /**
     * @return Public key as byte array.
     */
    public final byte[] getValue() {
        return value;
    }

    @Override
    public final String toString() {
        if (value == null) {
            return "";
        }
        return GXCommon.toHex(value);
    }
}
