package gurux.dlms.objects.enums;

import java.util.HashMap;

/**
 * Certificate entity.
 */
public enum CertificateEntity {
    /**
     * Certificate entity is server
     */
    SERVER(0),
    /**
     * Certificate entity is client
     */
    CLIENT(1),
    /**
     * Certificate entity is certification authority
     */
    CERTIFICATION_AUTHORITY(2),
    /**
     * Certificate entity is other.
     */
    OTHER(3);

    /**
     * Integer value of enumeration.
     */
    private int intValue;

    /**
     * Collection of integer and enumeration values.
     */
    private static java.util.HashMap<Integer, CertificateEntity> mappings;

    /**
     * Get mappings.
     * 
     * @return Hash map of enumeration and integer values.
     */
    private static HashMap<Integer, CertificateEntity> getMappings() {
        synchronized (CertificateEntity.class) {
            if (mappings == null) {
                mappings = new HashMap<Integer, CertificateEntity>();
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
    CertificateEntity(final int value) {
        intValue = value;
        synchronized (CertificateEntity.class) {
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
    public static CertificateEntity forValue(final int value) {
        CertificateEntity ret = getMappings().get(value);
        if (ret == null) {
            throw new IllegalArgumentException(
                    "Invalid certificate entity enum value.");
        }
        return ret;
    }
}
