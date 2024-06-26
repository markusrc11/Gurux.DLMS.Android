package gurux.dlms.objects.enums;

public enum AutoAnswerStatus {
    INACTIVE(0), ACTIVE(1), LOCKED(2);

    private int intValue;
    private static java.util.HashMap<Integer, AutoAnswerStatus> mappings;

    private static java.util.HashMap<Integer, AutoAnswerStatus> getMappings() {
        synchronized (AutoAnswerStatus.class) {
            if (mappings == null) {
                mappings = new java.util.HashMap<Integer, AutoAnswerStatus>();
            }
        }
        return mappings;
    }

    AutoAnswerStatus(final int value) {
        intValue = value;
        getMappings().put(value, this);
    }

    /*
     * Get integer value for enum.
     */
    public int getValue() {
        return intValue;
    }

    /*
     * Convert integer for enum value.
     */
    public static AutoAnswerStatus forValue(final int value) {
        AutoAnswerStatus ret = getMappings().get(value);
        if (ret == null) {
            throw new IllegalArgumentException(
                    "Invalid auto answer status enum value.");
        }
        return ret;
    }
}