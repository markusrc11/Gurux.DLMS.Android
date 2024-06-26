package gurux.dlms.enums;

/**
 * InterfaceType enumerates the usable types of connection in GuruxDLMS.
 */
public enum InterfaceType {
    /**
     * By default, the interface type is HDLC.
     */
    HDLC,
    /**
     * The interface type is TCP/IP or UDP wrapper, can be used with devices
     * that support IEC 62056-47.
     */
    WRAPPER,
    /**
     * Plain PDU is returned.
     */
    PDU,
    /**
     * Wireless M-Bus frame.
     */
    WIRELESS_MBUS;
    /**
     * @return Get integer value for enumeration.
     */
    public int getValue() {
        return this.ordinal();
    }

    /*
     * Convert integer for enumeration value.
     */
    public static InterfaceType forValue(final int value) {
        return values()[value];
    }
}