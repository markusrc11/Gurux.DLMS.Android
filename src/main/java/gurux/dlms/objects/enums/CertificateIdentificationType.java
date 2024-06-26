package gurux.dlms.objects.enums;

import java.util.HashMap;

/**
 * Certificate is identified with entity identification or the serial number of
 * the certificate.
 */
public enum CertificateIdentificationType {
    /**
     * Certificate is identified with entity identification.
     */
    ENTITY(0),
    /**
     * Certificate is identified with serial number of the certificate.
     */
    SERIAL(1);

    /**
     * Integer value of enumeration.
     */
    private int intValue;

    /**
     * Collection of integer and enumeration values.
     */
    private static HashMap<Integer, CertificateIdentificationType> mappings;

    /**
     * Get mappings.
     * 
     * @return Hash map of enumeration and integer values.
     */
    private static HashMap<Integer, CertificateIdentificationType>
            getMappings() {
        synchronized (CertificateIdentificationType.class) {
            if (mappings == null) {
                mappings =
                        new HashMap<Integer, CertificateIdentificationType>();
            }
        }
        return mappings;
    }

    /**
     * Constructor.
     * 
     * @param value
     *            Integer value for enumerator.
     */
    CertificateIdentificationType(final int value) {
        intValue = value;
        synchronized (CertificateIdentificationType.class) {
            getMappings().put(value, this);
        }
    }

    /**
     * Get enemerator's integer value.
     * 
     * @return Integer value of enumerator.
     */
    public int getValue() {
        return intValue;
    }

    /**
     * Get enumerator from integer value.
     * 
     * @param value
     *            integer value.
     * @return Enumerator value.
     */
    public static CertificateIdentificationType forValue(final int value) {
        CertificateIdentificationType ret = getMappings().get(value);
        if (ret == null) {
            throw new IllegalArgumentException(
                    "Invalid certificate identification type enum value.");
        }
        return ret;
    }
}
