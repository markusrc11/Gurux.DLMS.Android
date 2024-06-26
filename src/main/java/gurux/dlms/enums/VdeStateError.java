
package gurux.dlms.enums;

/**
 * VdeState error describes Vde state errors.
 */
public enum VdeStateError {
    /**
     * Other error.
     */
    OTHER(0),
    /**
     * No DLMS context.
     */
    NO_DLMS_CONTEXT(1),
    /**
     * Loading dataset error.
     */
    LOADING_DATASET(2),
    /**
     * Status No change.
     */
    STATUS_NO_CHANGE(3),
    /**
     * Status Inoperable.
     */
    STATUS_INOPERABLE(4);

    private int value;
    private static java.util.HashMap<Integer, VdeStateError> mappings;

    private static java.util.HashMap<Integer, VdeStateError> getMappings() {
        synchronized (VdeStateError.class) {
            if (mappings == null) {
                mappings = new java.util.HashMap<Integer, VdeStateError>();
            }
        }
        return mappings;
    }

    VdeStateError(final int mode) {
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
    public static VdeStateError forValue(final int value) {
        return getMappings().get(value);
    }
}