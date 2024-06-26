
package gurux.dlms.enums;

/**
 * LoadDataSet describes load dataset errors.
 */
public enum LoadDataSet {
    /**
     * Other error.
     */
    OTHER(0),
    /**
     * Primitive out of sequence.
     */
    PRIMITIVE_OUT_OF_SEQUENCE(1),
    /**
     * Not loadable.
     */
    NOT_LOADABLE(2),
    /**
     * Dataset size is too large.
     */
    DATASET_SIZE_TOO_LARGE(3),
    /**
     * Not awaited segment.
     */
    NOT_AWAITED_SEGMENT(4),
    /**
     * Interpretation failure.
     */
    INTERPRETATION_FAILURE(5),
    /**
     * Storage failure.
     */
    STORAGE_FAILURE(6),
    /**
     * Dataset not ready.
     */
    DATASET_NOT_READY(7);

    private int value;
    private static java.util.HashMap<Integer, LoadDataSet> mappings;

    private static java.util.HashMap<Integer, LoadDataSet> getMappings() {
        synchronized (LoadDataSet.class) {
            if (mappings == null) {
                mappings = new java.util.HashMap<Integer, LoadDataSet>();
            }
        }
        return mappings;
    }

    LoadDataSet(final int mode) {
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
    public static LoadDataSet forValue(final int value) {
        return getMappings().get(value);
    }
}