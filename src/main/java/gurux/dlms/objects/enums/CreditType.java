package gurux.dlms.objects.enums;

/**
 * Enumerates credit types.<br>
 * Online help:<br>
 * https://www.gurux.fi/Gurux.DLMS.Objects.GXDLMSCredit
 */
public enum CreditType {
    /**
     * Token credit.
     */
    TOKEN,
    /**
     * Reserved credit.
     */
    RESERVED,
    /**
     * Emergency credit.
     */
    EMERGENCY,
    /**
     * TimeBased credit.
     */
    TIME_BASED,
    /**
     * Consumption based credit.
     */
    CONSUMPTION_BASED;

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
    public static CreditType forValue(int value) {
        return values()[value];
    }
}