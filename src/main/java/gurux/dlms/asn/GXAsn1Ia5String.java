package gurux.dlms.asn;

public class GXAsn1Ia5String {

    private String ia5String;

    /**
     * Constructor.
     */
    public GXAsn1Ia5String() {

    }

    /**
     * Constructor.
     * 
     * @param str
     *            IA5 string.
     */
    public GXAsn1Ia5String(final String str) {
        ia5String = str;
    }

    public final String getValue() {
        return ia5String;
    }

    public final void setValue(final String value) {
        ia5String = value;
    }

    @Override
    public final String toString() {
        return ia5String;
    }
}
