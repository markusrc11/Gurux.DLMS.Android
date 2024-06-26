package gurux.dlms.manufacturersettings;

/**
 * Enumerates inactivity modes that are used, when communicating with IEC using
 * serial port connection.
 */
public enum InactivityMode {
    NONE(0),
    /*
     * Keep alive message is sent, only if there is no traffic on the active
     * connection.
     */
    KEEPALIVE(1),
    /*
     * Connection is reopened, if there is no traffic on the active connection.
     */
    REOPEN(2),
    /*
     * Connection is reopened, even if there is traffic on the active
     * connection.
     */
    REOPENACTIVE(3),
    /*
     * Closes connection, if there is no traffic on the active connection.
     */
    DISCONNECT(4);

    private int intValue;
    private static java.util.HashMap<Integer, InactivityMode> mappings;

    private static java.util.HashMap<Integer, InactivityMode> getMappings() {
        synchronized (InactivityMode.class) {
            if (mappings == null) {
                mappings = new java.util.HashMap<Integer, InactivityMode>();
            }
        }
        return mappings;
    }

    InactivityMode(final int value) {
        intValue = value;
        getMappings().put(new Integer(value), this);
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
    public static InactivityMode forValue(final int value) {
        return getMappings().get(new Integer(value));
    }
}