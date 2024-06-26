package gurux.dlms.objects.enums;

import java.util.HashMap;

/**
 * Enumerates application context name.<br>
 */
public enum ApplicationContextName {

    /**
     * Logical name.
     */
    LOGICAL_NAME(1),
    /**
     * Short name.
     */
    SHORT_NAME(2),
    /**
     * Logical name with ciphering.
     */
    LOGICAL_NAME_WITH_CIPHERING(3),
    /**
     * Short name with ciphering.
     */
    SHORT_NAME_WITH_CIPHERING(4);

    /**
     * Integer value of enumerator.
     */
    private int intValue;

    /**
     * Collection of enumerator values.
     */
    private static java.util.HashMap<Integer, ApplicationContextName> mappings;

    /**
     * Returns collection of enumerator values.
     * 
     * @return Enumerator values.
     */
    private static HashMap<Integer, ApplicationContextName> getMappings() {
        synchronized (ApplicationContextName.class) {
            if (mappings == null) {
                mappings = new HashMap<Integer, ApplicationContextName>();
            }
        }
        return mappings;
    }

    /**
     * Constructor.
     * 
     * @param value
     *            Integer value of enumerator.
     */
    ApplicationContextName(final int value) {
        intValue = value;
        getMappings().put(value, this);
    }

    /**
     * Get integer value for enumerator.
     * 
     * @return Enumerator integer value.
     */
    public int getValue() {
        return intValue;
    }

    /**
     * Returns enumerator value from an integer value.
     * 
     * @param value
     *            Integer value.
     * @return Enumeration value.
     */
    public static ApplicationContextName forValue(final int value) {
        ApplicationContextName ret = getMappings().get(value);
        if (ret == null) {
            throw new IllegalArgumentException(
                    "Invalid application context name enum value.");
        }
        return ret;
    }
}