package gurux.dlms.objects.enums;

/**
 * Enumerates credit status values.<br>
 * Online help:<br>
 * https://www.gurux.fi/Gurux.DLMS.Objects.GXDLMSCredit
 */
public enum CreditStatus {

    /**
     * Enabled state.
     */
    ENABLED,
    /**
     * Selectable state.
     */
    SELECTABLE,
    /**
     * Selected/Invoked state.
     */
    INVOKED,
    /**
     * In use state.
     */
    IN_USE,
    /**
     * Consumed state.
     */
    CONSUMED;

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
    public static CreditStatus forValue(int value) {
        return values()[value];
    }
}