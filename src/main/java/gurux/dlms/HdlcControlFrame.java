package gurux.dlms;

import gurux.dlms.enums.AssociationResult;

/**
 * HDLC control frame types.
 */
enum HdlcControlFrame {
    /**
     * Receive is ready.
     */
    RECEIVE_READY(0),
    /**
     * Receive is not ready.
     */
    RECEIVE_NOT_READY(0x1),
    /**
     * Frame is rejected.
     */
    REJECT(2),
    /**
     * Frame is selective rejected. Not all meters support this.
     */
    SELECTIVE_REJECT(3);

    private final int intValue;
    private static java.util.HashMap<Integer, HdlcControlFrame> mappings;

    private static java.util.HashMap<Integer, HdlcControlFrame> getMappings() {
        synchronized (AssociationResult.class) {
            if (mappings == null) {
                mappings = new java.util.HashMap<Integer, HdlcControlFrame>();
            }
        }
        return mappings;
    }

    HdlcControlFrame(final int value) {
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
    public static HdlcControlFrame forValue(final int value) {
        return getMappings().get(value);
    }
}