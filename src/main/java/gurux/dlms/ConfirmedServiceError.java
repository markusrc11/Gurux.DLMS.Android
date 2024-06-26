package gurux.dlms;

import java.util.HashMap;

/**
 * Confirmed service error tells when error has occurred.
 */
public enum ConfirmedServiceError {
    /**
     * Error has occurred on initialize.
     */
    INITIATE_ERROR(1),
    /**
     * Error has occurred on read.
     */
    READ(5),
    /**
     * Error has occurred on write.
     */
    WRITE(6);

    /**
     * Integer value of enumerator.
     */
    private int intValue;
    /**
     * Collection of enumerator values.
     */
    private static java.util.HashMap<Integer, ConfirmedServiceError> mappings;

    /**
     * Returns collection of enumerator values.
     * 
     * @return Enumerator values.
     */
    private static HashMap<Integer, ConfirmedServiceError> getMappings() {
        if (mappings == null) {
            synchronized (ConfirmedServiceError.class) {
                if (mappings == null) {
                    mappings = new HashMap<Integer, ConfirmedServiceError>();
                }
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
    ConfirmedServiceError(final int value) {
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
    public static ConfirmedServiceError forValue(final int value) {
        ConfirmedServiceError ret = getMappings().get(value);
        if (ret == null) {
            throw new IllegalArgumentException(
                    "Invalid confirmed service error enum value.");
        }
        return ret;
    }
}
