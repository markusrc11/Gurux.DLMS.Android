package gurux.dlms.objects.enums;

import java.util.HashMap;

/**
 * Certificate type.
 */
public enum CertificateType {
    /**
     * Certificate type is digital signature.
     */
    DIGITAL_SIGNATURE(0),
    /**
     * Certificate type is key agreement.
     */
    KEY_AGREEMENT(1),
    /**
     * Certificate type is TLS.
     */
    TLS(2),
    /**
     * Certificate type is other.
     */
    OTHER(3);

    /**
     * Integer value of enumeration.
     */
    private int intValue;

    /**
     * Collection of integer and enumeration values.
     */
    private static java.util.HashMap<Integer, CertificateType> mappings;

    /**
     * Get mappings.
     * 
     * @return Hash map of enumeration and integer values.
     */
    private static HashMap<Integer, CertificateType> getMappings() {
        synchronized (CertificateType.class) {
            if (mappings == null) {
                mappings = new HashMap<Integer, CertificateType>();
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
    CertificateType(final int value) {
        intValue = value;
        synchronized (CertificateType.class) {
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
    public static CertificateType forValue(final int value) {
        CertificateType ret = getMappings().get(value);
        if (ret == null) {
            throw new IllegalArgumentException(
                    "Invalid certificate type enum value.");
        }
        return ret;
    }

}
