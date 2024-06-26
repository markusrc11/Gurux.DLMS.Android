
package gurux.dlms.enums;

/**
 * Access describes access errors.
 */
public enum Access {
    /**
     * Other error.
     */
    OTHER(0),
    /**
     * Scope of access violated.
     */
    SCOPE_OF_ACCESS_VIOLATED(1),
    /**
     * Object access is invalid.
     */
    OBJECT_ACCESS_INVALID(2),
    /**
     * Hardware fault.
     */
    HARDWARE_FAULT(3),
    /**
     * Object is unavailable.
     */
    OBJECT_UNAVAILABLE(4);

    private int value;
    private static java.util.HashMap<Integer, Access> mappings;

    private static java.util.HashMap<Integer, Access> getMappings() {
        synchronized (Access.class) {
            if (mappings == null) {
                mappings = new java.util.HashMap<Integer, Access>();
            }
        }
        return mappings;
    }

    Access(final int mode) {
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
    public static Access forValue(final int value) {
        return getMappings().get(value);
    }
}