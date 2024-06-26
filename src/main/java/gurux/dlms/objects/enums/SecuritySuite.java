
package gurux.dlms.objects.enums;

/**
 * Security suite Specifies authentication, encryption and key wrapping
 * algorithm.
 */
public enum SecuritySuite {
    /**
     * AES-GCM-128 for authenticated encryption and AES-128 for key wrapping.
     * <br>
     * A.K.A Security Suite 0.
     */
    AES_GCM_128,
    /**
     * ECDH-ECDSAAES-GCM-128SHA-256. <br>
     * A.K.A Security Suite 1.
     */
    ECDH_ECDSA_AES_GCM_128_SHA_256,
    /**
     * ECDH-ECDSAAES-GCM-256SHA-384. <br>
     * A.K.A Security Suite 2.
     */
    ECDHE_CDSA_AES_GCM_256_SHA_384;

    public int getValue() {
        return this.ordinal();
    }

    public static SecuritySuite forValue(final int value) {
        SecuritySuite ret = values()[value];
        if (ret == null) {
            throw new IllegalArgumentException(
                    "Invalid security suite enum value.");
        }
        return ret;

    }
}