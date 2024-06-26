package gurux.dlms;

/**
 * Service describes service errors.
 */
public enum Service {
    /**
     * Other error.
     */
    OTHER(0),
    /**
     * PDU size is wrong.
     */
    PDU_SIZE(1),
    /**
     * Service is unsupported.
     */
    UNSUPPORTED(2);

    /**
     * Integer value of enumerator.
     */
    private int intValue;
    /**
     * Collection of enumerator values.
     */
    private static java.util.HashMap<Integer, Service> mappings;

    /**
     * Returns collection of enumerator values.
     * 
     * @return Enumerator values.
     */
    private static java.util.HashMap<Integer, Service> getMappings() {
        if (mappings == null) {
            synchronized (Service.class) {
                if (mappings == null) {
                    mappings = new java.util.HashMap<Integer, Service>();
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
    Service(final int value) {
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
    public static Service forValue(final int value) {
        return getMappings().get(value);
    }
}
