package gurux.dlms;

/**
 * ServiceError enumerates service errors.
 */
public enum ServiceError {
    /**
     * Application error.
     */
    APPLICATION_REFERENCE(0),
    /**
     * Hardware error.
     */
    HARDWARE_RESOURCE(1),
    /**
     * Vde state error.
     */
    VDE_STATE_ERROR(2),
    /**
     * Service error.
     */
    SERVICE(3),
    /**
     * Definition error.
     */
    DEFINITION(4),
    /**
     * Access error.
     */
    ACCESS(5),
    /**
     * Initiate error.
     */
    INITIATE(6),
    /**
     * LoadDataSet error.
     */
    LOAD_DATASET(7),
    /**
     * Task error.
     */
    TASK(8),
    /**
     * Other error describes manufacturer specific error code.
     */
    OTHER_ERROR(9);

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
        if (mappings == null) {
            synchronized (ServiceError.class) {
                if (mappings == null) {
                    mappings = new java.util.HashMap<Integer, ServiceError>();
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
