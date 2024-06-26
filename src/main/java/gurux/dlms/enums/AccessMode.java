
package gurux.dlms.enums;

public enum AccessMode {
    /**
     * No access.
     */
    NO_ACCESS(0),
    /*
     * The client is allowed only reading from the server.
     */
    READ(1),
    /*
     * The client is allowed only writing to the server.
     */
    WRITE(2),
    /*
     * The client is allowed both reading from the server and writing to it.
     */
    READ_WRITE(3),

    AUTHENTICATED_READ(4),

    AUTHENTICATED_WRITE(5),

    AUTHENTICATED_READ_WRITE(6);

    private int value;
    private static java.util.HashMap<Integer, AccessMode> mappings;

    private static java.util.HashMap<Integer, AccessMode> getMappings() {
        synchronized (AccessMode.class) {
            if (mappings == null) {
                mappings = new java.util.HashMap<Integer, AccessMode>();
            }
        }
        return mappings;
    }

    AccessMode(final int mode) {
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
    public static AccessMode forValue(final int value) {
        return getMappings().get(value);
    }
}