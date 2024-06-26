package gurux.dlms.objects.enums;

import java.util.HashMap;

/**
 * Enumerates payment Modes.<br>
 * Online help:<br>
 * https://www.gurux.fi/Gurux.DLMS.Objects.GXDLMSAccount
 */
public enum PaymentMode {
    /**
     * Credit mode.
     */
    CREDIT(1),
    /**
     * Prepayment mode.
     */
    PREPAYMENT(2);

    /**
     * Integer value of enumerator.
     */
    private int intValue;

    /**
     * Collection of enumerator values.
     */
    private static java.util.HashMap<Integer, PaymentMode> mappings;

    /**
     * Returns collection of enumerator values.
     * 
     * @return Enumerator values.
     */
    private static HashMap<Integer, PaymentMode> getMappings() {
        synchronized (PaymentMode.class) {
            if (mappings == null) {
                mappings = new HashMap<Integer, PaymentMode>();
            }
        }
        return mappings;
    }

    /**
     * Constructor.
     * 
     * @param value
     *            Integer value of enumerator.
     */
    PaymentMode(final int value) {
        intValue = value;
        getMappings().put(value, this);
    }

    /**
     * Get integer value for enumerator.
     * 
     * @return Enumerator integer value.
     */
    public int getValue() {
        return intValue;
    }

    /**
     * Returns enumerator value from an integer value.
     * 
     * @param value
     *            Integer value.
     * @return Enumeration value.
     */
    public static PaymentMode forValue(final int value) {
        PaymentMode ret = getMappings().get(value);
        if (ret == null) {
            throw new IllegalArgumentException(
                    "Invalid payment mode enum value.");
        }
        return ret;
    }
}