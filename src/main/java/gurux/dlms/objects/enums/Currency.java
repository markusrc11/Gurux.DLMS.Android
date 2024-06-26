package gurux.dlms.objects.enums;

/**
 * Enumerates payment Modes.<br>
 * Online help:<br>
 * https://www.gurux.fi/Gurux.DLMS.Objects.GXDLMSAccount
 */
public enum Currency {
    /**
     * Time.
     */
    TIME,
    /**
     * Consumption.
     */
    CONSUMPTION,
    /**
     * Monetary.
     */
    MONETARY;

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
    public static Currency forValue(int value) {
        return values()[value];
    }

}