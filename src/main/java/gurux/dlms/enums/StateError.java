package gurux.dlms.enums;

/**
 * DLMS state errors.
 */
public enum StateError {
    /**
     * Service is not allowed.
     */
    SERVICE_NOT_ALLOWED(1),

    /**
     * Unknown service.
     */
    SERVICE_UNKNOWN(2);

    /**
     * Integer value of enumerator.
     */
    private int intValue;

    /**
     * Collection of enumerator values.
     */
    private static java.util.HashMap<Integer, StateError> mappings;

    /**
     * Returns collection of enumerator values.
     * 
     * @return Enumerator values.
     */
    private static java.util.HashMap<Integer, StateError> getMappings() {
        synchronized (StateError.class) {
            if (mappings == null) {
                mappings = new java.util.HashMap<Integer, StateError>();
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
    StateError(final int value) {
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
    public static StateError forValue(final int value) {
        return getMappings().get(value);
    }
}
