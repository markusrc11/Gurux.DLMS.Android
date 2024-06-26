package gurux.dlms.asn.enums;

import java.util.HashSet;
import java.util.Set;

/**
 * Key Usage.
 */
public enum KeyUsage {
    /**
     * Key is not used.
     */
    NONE(0),
    /**
     * Digital signature.
     */
    DIGITAL_SIGNATURE(128),
    /**
     * Non Repudiation.
     */
    NON_REPUDIATION(64),
    /**
     * Key encipherment.
     */
    KEY_ENCIPHERMENT(32),
    /**
     * Data encipherment.
     */
    DATA_ENCIPHERMENT(16),
    /**
     * Key agreement.
     */
    KEY_AGREEMENT(8),
    /**
     * Key cert sign.
     */
    KEY_CERT_SIGN(4),
    /**
     * cRL sign.
     */
    CRL_SIGN(2),
    /**
     * Encipher only.
     */
    ENCIPHER_ONLY(1),
    /**
     * Decipher only.
     */
    DECIPHER_ONLY(256);

    private int value;

    /*
     * Constructor.
     */
    KeyUsage(final int forValue) {
        value = forValue;
    }

    /*
     * Get integer value for enumerator.
     */
    public int getValue() {
        return value;
    }

    /**
     * @return Get enumeration constant values.
     */
    private static KeyUsage[] getEnumConstants() {
        return new KeyUsage[] { DIGITAL_SIGNATURE, NON_REPUDIATION,
                KEY_ENCIPHERMENT, DATA_ENCIPHERMENT, KEY_AGREEMENT,
                KEY_CERT_SIGN, CRL_SIGN, ENCIPHER_ONLY, DECIPHER_ONLY };
    }

    /**
     * Converts the integer value to enumerated value.
     * 
     * @param value
     *            The integer value, which is read from the device.
     * @return The enumerated value, which represents the integer.
     */
    public static java.util.Set<KeyUsage> forValue(final int value) {
        Set<KeyUsage> types = new HashSet<KeyUsage>();
        KeyUsage[] enums = getEnumConstants();
        for (int pos = 0; pos != enums.length; ++pos) {
            if ((enums[pos].value & value) == enums[pos].value) {
                types.add(enums[pos]);
            }
        }
        return types;
    }

    /**
     * Converts the enumerated value to integer value.
     * 
     * @param value
     *            The enumerated value.
     * @return The integer value.
     */
    public static int toInteger(final Set<KeyUsage> value) {
        int tmp = 0;
        for (KeyUsage it : value) {
            tmp |= it.getValue();
        }
        return tmp;
    }
}
