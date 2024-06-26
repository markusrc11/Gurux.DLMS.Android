package gurux.dlms.objects.enums;

import java.util.HashMap;

/**
 * Enumerates account credit status modes.<br>
 * Online help:<br>
 * https://www.gurux.fi/Gurux.DLMS.Objects.GXDLMSAccount
 */
public enum AccountCreditStatus {

    /**
     * In credit.
     */
    IN_CREDIT(0x1),

    /**
     * Low credit.
     */
    LOW_CREDIT(0x2),

    /**
     * Next credit enabled.
     */
    NEXT_CREDIT_ENABLED(0x4),

    /**
     * Next credit selectable.
     */
    NEXT_CREDIT_SELECTABLE(0x8),

    /**
     * Credit reference list.
     */
    CREDIT_REFERENCE_LIST(0x10),

    /**
     * Selectable credit in use.
     */
    SELECTABLE_CREDIT_IN_USE(0x20),

    /**
     * Out of credit.
     */
    OUT_OF_CREDIT(0x40),

    /**
     * Reserved.
     */
    RESERVED(0x80);

    /**
     * Integer value of enumerator.
     */
    private int intValue;

    /**
     * Collection of enumerator values.
     */
    private static java.util.HashMap<Integer, AccountCreditStatus> mappings;

    /**
     * Returns collection of enumerator values.
     * 
     * @return Enumerator values.
     */
    private static HashMap<Integer, AccountCreditStatus> getMappings() {
        synchronized (AccountCreditStatus.class) {
            if (mappings == null) {
                mappings = new HashMap<Integer, AccountCreditStatus>();
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
    AccountCreditStatus(final int value) {
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
    public static AccountCreditStatus forValue(final int value) {
        AccountCreditStatus ret = getMappings().get(value);
        if (ret == null) {
            throw new IllegalArgumentException(
                    "Invalid account credit status enum value.");
        }
        return ret;
    }
}