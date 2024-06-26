
package gurux.dlms.objects.enums;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Security policy Enforces authentication and/or encryption algorithm provided
 * with security suite. This enumeration is used for version 1.
 */
public enum SecurityPolicy1 {

    /**
     * Security is not used.
     */
    NOTHING(0),
    /**
     * Request is authenticated.
     */
    AUTHENTICATED_REQUEST(0x20),

    /**
     * Request is encrypted.
     */
    ENCRYPTED_REQUEST(0x10),

    /**
     * Request is digitally signed.
     */
    DIGITALLY_SIGNED_REQUEST(0x8),

    /**
     * Response authenticated.
     */
    AUTHENTICATED_RESPONSE(0x4),

    /**
     * Response encrypted.
     */
    ENCRYPTED_RESPONSE(0x2),

    /**
     * Response is digitally signed.
     */
    DIGITALLY_SIGNED_RESPONSE(0x1);

    /**
     * Integer value of enumeration.
     */
    private int intValue;

    /**
     * Collection of integer and enumeration values.
     */
    private static java.util.HashMap<Integer, SecurityPolicy1> mappings;

    /**
     * Get mappings.
     * 
     * @return Hash map of enumeration and integer values.
     */
    private static HashMap<Integer, SecurityPolicy1> getMappings() {
        synchronized (SecurityPolicy1.class) {
            if (mappings == null) {
                mappings = new HashMap<Integer, SecurityPolicy1>();
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
    SecurityPolicy1(final int forValue) {
        intValue = forValue;
        synchronized (SecurityPolicy1.class) {
            getMappings().put(forValue, this);
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
     * @return Get enumeration constant values.
     */
    private static SecurityPolicy1[] getEnumConstants() {
        return new SecurityPolicy1[] { AUTHENTICATED_REQUEST, ENCRYPTED_REQUEST,
                DIGITALLY_SIGNED_REQUEST, AUTHENTICATED_RESPONSE,
                ENCRYPTED_RESPONSE, DIGITALLY_SIGNED_RESPONSE };

    }

    /**
     * Get enumerator from integer value.
     * 
     * @param value
     *            integer value.
     * @return Enumerator value.
     */
    public static java.util.Set<SecurityPolicy1> forValue(final int value) {
        Set<SecurityPolicy1> values = new HashSet<SecurityPolicy1>();
        SecurityPolicy1[] enums = getEnumConstants();
        for (int pos = 0; pos != enums.length; ++pos) {
            if ((enums[pos].intValue & value) == enums[pos].intValue) {
                values.add(enums[pos]);
            }
        }
        return values;
    }

    /**
     * Converts the enumerated value to integer value.
     * 
     * @param forValue
     *            The enumerated value.
     * @return The integer value.
     */
    public static int toInteger(final java.util.Set<SecurityPolicy1> forValue) {
        int tmp = 0;
        for (SecurityPolicy1 it : forValue) {
            tmp |= it.getValue();
        }
        return tmp;
    }
}