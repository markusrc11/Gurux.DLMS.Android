package gurux.dlms.enums;

/**
 * Used priority.
 */
public enum Priority {
    /**
     * Normal priority.
     */
    NORMAL(0),

    /**
     * High priority.
     */
    HIGH(1);

    private int intValue;
    private static java.util.HashMap<Integer, Priority> mappings;

    private static java.util.HashMap<Integer, Priority> getMappings() {
        if (mappings == null) {
            synchronized (Priority.class) {
                if (mappings == null) {
                    mappings = new java.util.HashMap<Integer, Priority>();
                }
            }
        }
        return mappings;
    }

    Priority(final int value) {
        intValue = value;
        getMappings().put(value, this);
    }

    public int getValue() {
        return intValue;
    }

    public static Priority forValue(final int value) {
        return getMappings().get(value);
    }
}