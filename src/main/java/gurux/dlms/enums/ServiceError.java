package gurux.dlms.enums;

/**
 * DLMS service errors.
 */
public enum ServiceError {
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
    OTHER_REASON(3);

    /**
     * Integer value of enumerator.
     */
    private int intValue;

    /**
     * Collection of enumerator values.
     */
    private static java.util.HashMap<Integer, ServiceError> mappings;

    /**
     * Returns collection of enumerator values.
     * 
     * @return Enumerator values.
     */
    private static java.util.HashMap<Integer, ServiceError> getMappings() {
        synchronized (ServiceError.class) {
            if (mappings == null) {
                mappings = new java.util.HashMap<Integer, ServiceError>();
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
    ServiceError(final int value) {
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
    public static ServiceError forValue(final int value) {
        return getMappings().get(value);
    }
}