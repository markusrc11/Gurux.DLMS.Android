package gurux.dlms.manufacturersettings;

public enum HDLCAddressType {
    /*
     * Default HDLC addressing is used.
     */
    DEFAULT,
    /*
     * Serial number is used to generate HDLC address.
     */
    SERIAL_NUMBER,
    /*
     * Custom HDLC addressing is used.
     */
    CUSTOM;

    /*
     * Get integer value for enum.
     */
    public int getValue() {
        return this.ordinal();
    }

    /*
     * Convert integer for enum value.
     */
    public static HDLCAddressType forValue(final int value) {
        return values()[value];
    }
}