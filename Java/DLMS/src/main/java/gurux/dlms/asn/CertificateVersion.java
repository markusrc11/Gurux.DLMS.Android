//
// --------------------------------------------------------------------------
//  Gurux Ltd
package gurux.dlms.asn;

/**
 * Certificate version.
 */
public final class CertificateVersion {

    public static final CertificateVersion V1 = new CertificateVersion(0);
    public static final CertificateVersion V2 = new CertificateVersion(1);
    public static final CertificateVersion V3 = new CertificateVersion(2);

    private int value;
    private static java.util.HashMap<Integer, CertificateVersion> mappings;

    private static java.util.HashMap<Integer, CertificateVersion> getMappings() {
        synchronized (CertificateVersion.class) {
            if (mappings == null) {
                mappings = new java.util.HashMap<Integer, CertificateVersion>();
            }
        }
        return mappings;
    }

    CertificateVersion(final int mode) {
        value = mode;
        getMappings().put(mode, this);
    }

    /*
     * Get integer value for enumeration.
     */
    public int getValue() {
        return value;
    }

    /*
     * Convert string for enumeration value.
     */
    public static CertificateVersion forValue(final int value) {
        return getMappings().get(value);
    }

    @Override
    public String toString() {
        String str = "";
        if (value == 0) {
            str = "V1";
        } else if (value == 1) {
            str = "V2";
        } else if (value == 2) {
            str = "V3";
        }
        return str;
    }
}
