package gurux.dlms;

import gurux.dlms.enums.AssociationResult;

/**
 * HDLC frame types.
 */
enum HdlcFrameType {
    /**
     * I-Frame. Information frames are used to transport user data.
     */
    I_FRAME(0x0),
    /**
     * S-frame. Supervisory Frames are used for flow and error control.
     * Rejected, RNR and RR.
     */
    S_FRAME(0x1),
    /**
     * U-frame. Unnumbered frames are used for link management. Example SNRM and
     * UA.
     */
    U_FRAME(0x3);

    private final int intValue;
    private static java.util.HashMap<Integer, HdlcFrameType> mappings;

    private static java.util.HashMap<Integer, HdlcFrameType> getMappings() {
        synchronized (AssociationResult.class) {
            if (mappings == null) {
                mappings = new java.util.HashMap<Integer, HdlcFrameType>();
            }
        }
        return mappings;
    }

    HdlcFrameType(final int value) {
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
    public static HdlcFrameType forValue(final int value) {
        return getMappings().get(value);
    }
}