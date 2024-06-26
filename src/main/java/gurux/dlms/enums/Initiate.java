
package gurux.dlms.enums;

/**
 * Initiate describes onitiate errors.
 */
public enum Initiate {
    /**
     * Other error.
     */
    OTHER(0),
    /**
     * Dlms version is too low.
     */
    DLMS_VERSION_TOO_LOW(1),
    /**
     * Incompatible conformance.
     */
    INCOMPATIBLE_CONFORMANCE(2),
    /**
     * PDU size is too short.
     */
    PDU_SIZE_TOO_SHORT(3),
    /**
     * Refused by the VDE handler.
     */
    REFUSED_BY_THE_VDE_HANDLER(4);

    private int value;
    private static java.util.HashMap<Integer, Initiate> mappings;

    private static java.util.HashMap<Integer, Initiate> getMappings() {
        synchronized (Initiate.class) {
            if (mappings == null) {
                mappings = new java.util.HashMap<Integer, Initiate>();
            }
        }
        return mappings;
    }

    Initiate(final int mode) {
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
    public static Initiate forValue(final int value) {
        return getMappings().get(value);
    }
}