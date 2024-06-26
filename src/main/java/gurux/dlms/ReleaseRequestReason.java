package gurux.dlms;

import java.util.HashMap;

/**
 * RequestTypes enumerates the replies of the server to a client's request,
 * indicating the request type.
 */
enum ReleaseRequestReason {
    /**
     * Client closes connection as normal.
     */
    NORMAL(0),
    /**
     * Client closes connection as urgent.
     */
    URGENT(1),
    /**
     * Client closes connection user defined reason.
     */
    USER_DEFINED(30);

    /**
     * Integer value of enumerator.
     */
    private int intValue;
    /**
     * Collection of enumerator values.
     */
    private static HashMap<Integer, ReleaseRequestReason> mappings;

    /**
     * Returns collection of enumerator values.
     * 
     * @return Enumerator values.
     */
    private static java.util.HashMap<Integer, ReleaseRequestReason>
            getMappings() {
        if (mappings == null) {
            synchronized (ReleaseRequestReason.class) {
                if (mappings == null) {
                    mappings = new HashMap<Integer, ReleaseRequestReason>();
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
    ReleaseRequestReason(final int value) {
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
    public static ReleaseRequestReason forValue(final int value) {
        return getMappings().get(value);
    }
}
