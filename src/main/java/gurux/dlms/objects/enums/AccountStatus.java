package gurux.dlms.objects.enums;

import java.util.HashMap;

/**
 * Enumerates account status modes.<br>
 * Online help:<br>
 * https://www.gurux.fi/Gurux.DLMS.Objects.GXDLMSAccount
 */
public enum AccountStatus {
    /**
     * New (inactive) account.
     */
    NEW_INACTIVE_ACCOUNT(1),
    /**
     * Account active.
     */
    ACTIVE(2),
    /**
     * Account closed.
     */
    CLOSED(3);

    /**
     * Integer value of enumerator.
     */
    private int intValue;

    /**
     * Collection of enumerator values.
     */
    private static java.util.HashMap<Integer, AccountStatus> mappings;

    /**
     * Returns collection of enumerator values.
     * 
     * @return Enumerator values.
     */
    private static HashMap<Integer, AccountStatus> getMappings() {
        synchronized (AccountStatus.class) {
            if (mappings == null) {
                mappings = new HashMap<Integer, AccountStatus>();
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
    AccountStatus(final int value) {
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
    public static AccountStatus forValue(final int value) {
        AccountStatus ret = getMappings().get(value);
        if (ret == null) {
            throw new IllegalArgumentException(
                    "Invalid account status enum value.");
        }
        return ret;
    }
}