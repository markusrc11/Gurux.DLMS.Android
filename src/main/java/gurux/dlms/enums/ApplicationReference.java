
package gurux.dlms.enums;

import java.util.HashMap;

/**
 * Application reference describes application errors.
 */
public enum ApplicationReference {
    /**
     * Other error is occurred.
     */
    OTHER(0),
    /**
     * Time elapsed.
     */
    TIME_ELAPSED(1),
    /**
     * Application unreachable.
     */
    APPLICATION_UNREACHABLE(2),
    /**
     * Application reference is invalid.
     */
    APPLICATION_REFERENCE_INVALID(3),
    /**
     * Application context unsupported.
     */
    APPLICATION_CONTEXT_UNSUPPORTED(4),
    /**
     * Provider communication error.
     */
    PROVIDER_COMMUNICATION_ERROR(5),
    /**
     * Deciphering error.
     */
    DECIPHERING_ERROR(6);

    private int value;
    private static HashMap<Integer, ApplicationReference> mappings;

    private static HashMap<Integer, ApplicationReference> getMappings() {
        synchronized (ApplicationReference.class) {
            if (mappings == null) {
                mappings = new HashMap<Integer, ApplicationReference>();
            }
        }
        return mappings;
    }

    ApplicationReference(final int mode) {
        this.value = mode;
        getMappings().put(mode, this);
    }

    /*
     * Get integer value for enum.
     */
    public final int getValue() {
        return value;
    }

    /*
     * Convert integer for enum value.
     */
    public static ApplicationReference forValue(final int value) {
        return getMappings().get(value);
    }
}