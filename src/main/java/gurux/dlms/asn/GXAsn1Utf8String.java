package gurux.dlms.asn;

public class GXAsn1Utf8String {

    private String utf8String;

    /**
     * Constructor.
     */
    public GXAsn1Utf8String() {

    }

    /**
     * Constructor.
     * 
     * @param str
     *            UTF8 String.
     */
    public GXAsn1Utf8String(final String str) {
        utf8String = str;
    }

    public final String getValue() {
        return utf8String;
    }

    public final void setValue(final String value) {
        utf8String = value;
    }

    @Override
    public final String toString() {
        return utf8String;
    }
}
