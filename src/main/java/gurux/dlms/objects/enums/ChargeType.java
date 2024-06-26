package gurux.dlms.objects.enums;

/**
 * Enumerates account credit status modes.<br>
 * Online help:<br>
 * https://www.gurux.fi/Gurux.DLMS.Objects.GXDLMSCharge
 */
public enum ChargeType {

    /**
     * Consumption based collection.
     */
    CONSUMPTION_BASED_COLLECTION,
    /**
     * Time based collection.
     */
    TIME_BASED_COLLECTION,
    /**
     * Payment based collection.
     */
    PAYMENT_EVENT_BASED_COLLECTION;

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
    public static ChargeType forValue(int value) {
        return values()[value];
    }
}