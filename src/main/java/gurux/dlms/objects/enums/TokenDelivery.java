package gurux.dlms.objects.enums;

/**
 * Enumerates token delivery methods.<br>
 * Online help:<br>
 * https://www.gurux.fi/Gurux.DLMS.Objects.GXDLMSTokenGateway
 */
public enum TokenDelivery {
    /**
     * Via remote communications.
     */
    REMOTE,
    /**
     * Via local communications.
     */
    LOCAL,
    /**
     * Via manual entry.
     */
    MANUAL;

    /**
     * Get integer value for enumerator.
     * 
     * @return Enumerator integer value.
     */
    public int getValue() {
        return this.ordinal();
    }

    /**
     * Returns enumerator value from an integer value.
     * 
     * @param value
     *            Integer value.
     * @return Enumeration value.
     */
    public static TokenDelivery forValue(int value) {
        return values()[value];
    }
}