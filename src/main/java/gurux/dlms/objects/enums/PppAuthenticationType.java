package gurux.dlms.objects.enums;

import java.util.HashMap;

/**
 * Ppp Authentication Type
 */
public enum PppAuthenticationType {
    /**
     * No authentication.
     */
    None(0),
    /**
     * PAP Login
     */
    PAP(1),
    /**
     * CHAP-algorithm
     */
    CHAP(2);

    private int intValue;
    private static java.util.HashMap<Integer, PppAuthenticationType> mappings;

    private static java.util.HashMap<Integer, PppAuthenticationType>
            getMappings() {
        if (mappings == null) {
            synchronized (PppAuthenticationType.class) {
                if (mappings == null) {
                    mappings = new HashMap<Integer, PppAuthenticationType>();
                }
            }
        }
        return mappings;
    }

    PppAuthenticationType(final int value) {
        intValue = value;
        getMappings().put(value, this);
    }

    public int getValue() {
        return intValue;
    }

    public static PppAuthenticationType forValue(final int value) {
        PppAuthenticationType ret = getMappings().get(value);
        if (ret == null) {
            throw new IllegalArgumentException(
                    "Invalid PPP authentication type enum value.");
        }
        return ret;
    }
}