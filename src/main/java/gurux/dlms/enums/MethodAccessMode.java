package gurux.dlms.enums;

public enum MethodAccessMode {
    /*
     * No access.
     */
    NO_ACCESS(0),
    /*
     * access.
     */
    ACCESS(1),
    /*
     * Authenticated access.
     */
    AUTHENTICATED_ACCESS(2);

    private int intValue;
    private static java.util.HashMap<Integer, MethodAccessMode> mappings;

    private static java.util.HashMap<Integer, MethodAccessMode> getMappings() {
        synchronized (MethodAccessMode.class) {
            if (mappings == null) {
                mappings = new java.util.HashMap<Integer, MethodAccessMode>();
            }
        }
        return mappings;
    }

    MethodAccessMode(final int value) {
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
    public static MethodAccessMode forValue(final int value) {
        return getMappings().get(value);
    }
}