package gurux.dlms.enums;

import java.util.HashMap;

/**
 * DLMS service errors.
 */
public enum ExceptionServiceError {
    /**
     * Operation is not possible
     */
    OPERATION_NOT_POSSIBLE(1),

    /**
     * Service is not supported.
     */
    SERVICE_NOT_SUPPORTED(2),

    /**
     * Other reason.
     */
    OTHER_REASON(3),

    /**
     * PDU is too long.
     */
    PDU_TOO_LONG(4),

    /**
     * Ciphering failed.
     */
    DECIPHERING_ERROR(5),

    /**
     * Invocation counter is invalid.
     */
    INVOCATION_COUNTER_ERROR(6);

    /**
     * Integer value of enumerator.
     */
    private int intValue;

    /**
     * Collection of enumerator values.
     */
    private static java.util.HashMap<Integer, ExceptionServiceError> mappings;

    /**
     * Returns collection of enumerator values.
     * 
     * @return Enumerator values.
     */
    private static HashMap<Integer, ExceptionServiceError> getMappings() {
        synchronized (ExceptionServiceError.class) {
            if (mappings == null) {
                mappings = new HashMap<Integer, ExceptionServiceError>();
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
    ExceptionServiceError(final int value) {
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
    public static ExceptionServiceError forValue(final int value) {
        return getMappings().get(value);
    }
}