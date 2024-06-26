package gurux.dlms.objects.enums;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Defines behavior under specific conditions.
 */
public enum CreditCollectionConfiguration {
    /**
     * Collect when supply disconnected.
     */
    DISCONNECTED(0x1),
    /**
     * Collect in load limiting periods.
     */
    LOAD_LIMITING(0x2),
    /**
     * Collect in friendly credit periods.
     */
    FRIENDLY_CREDIT(0x4);

    /**
     * Integer value of enumerator.
     */
    private int intValue;

    /**
     * Collection of enumerator values.
     */
    private static java.util.HashMap<Integer, CreditCollectionConfiguration> mappings;

    /**
     * Returns collection of enumerator values.
     * 
     * @return Enumerator values.
     */
    private static HashMap<Integer, CreditCollectionConfiguration>
            getMappings() {
        synchronized (CreditCollectionConfiguration.class) {
            if (mappings == null) {
                mappings =
                        new HashMap<Integer, CreditCollectionConfiguration>();
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
    CreditCollectionConfiguration(final int value) {
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

    static CreditCollectionConfiguration[] getEnumConstants() {
        return new CreditCollectionConfiguration[] { DISCONNECTED,
                LOAD_LIMITING, FRIENDLY_CREDIT };
    }

    /**
     * Returns enumerator value from an integer value.
     * 
     * @param value
     *            Integer value.
     * @return Enumeration value.
     */
    public static Set<CreditCollectionConfiguration> forValue(final int value) {
        Set<CreditCollectionConfiguration> types =
                new HashSet<CreditCollectionConfiguration>();
        CreditCollectionConfiguration[] enums = getEnumConstants();
        for (int pos = 0; pos != enums.length; ++pos) {
            if ((enums[pos].intValue & value) == enums[pos].intValue) {
                types.add(enums[pos]);
            }
        }
        return types;
    }

    /**
     * Converts the enumerated value to integer value.
     * 
     * @param value
     *            The enumerated value.
     * @return The integer value.
     */
    public static int
            toInteger(final Set<CreditCollectionConfiguration> value) {
        if (value == null) {
            return 0;
        }
        int tmp = 0;
        for (CreditCollectionConfiguration it : value) {
            tmp |= it.getValue();
        }
        return tmp;
    }
}