package gurux.dlms.asn;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Enumerate values that are add to counted GMAC.
 */
public final class GXx509CertificateCollection
        extends ArrayList<GXx509Certificate>
        implements java.util.List<GXx509Certificate> {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * Find certificate using serial information.
     * 
     * @param serialNumber
     *            Serial number.
     * @param issuer
     *            Issuer.
     * @return x509Certificate
     */
    public GXx509Certificate findCertificateBySerial(final byte[] serialNumber,
            final String issuer) {
        for (GXx509Certificate it : this) {
            if (Arrays.equals(it.getSerialNumber().getByteArray(), serialNumber)
                    && it.getIssuer().equalsIgnoreCase(issuer)) {
                return it;
            }
        }
        return null;
    }
}