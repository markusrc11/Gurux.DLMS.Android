package gurux.dlms.enums;

import java.util.HashMap;

/**
 * ACSE service provider.
 */
public enum AcseServiceProvider {
    /**
     * There is no error.
     */
    NONE(0),
    /**
     * Reason is not given.
     */
    NO_REASON_GIVEN(1),
    /**
     * Invalid ACSE version.
     */
    NO_COMMON_ACSE_VERSION(2);

    private int intValue;
    private static HashMap<Integer, AcseServiceProvider> mappings;

    private static HashMap<Integer, AcseServiceProvider> getMappings() {
        synchronized (AcseServiceProvider.class) {
            if (mappings == null) {
                mappings = new HashMap<Integer, AcseServiceProvider>();
            }
        }
        return mappings;
    }

    AcseServiceProvider(final int value) {
        intValue = value;
        getMappings().put(value, this);
    }

    /*
     * Get integer value for enumeration.
     */
    public int getValue() {
        return intValue;
    }

    /*
     * Convert integer for enumeration value.
     */
    public static AcseServiceProvider forValue(final int value) {
        return getMappings().get(value);
    }
}