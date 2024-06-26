package gurux.dlms.objects.enums;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Charge configuration enumeration types.
 */
public enum ChargeConfiguration {

    /**
     * Percentage based collection.
     */
    PERCENTAGE_BASED_COLLECTION(0x1),
    /**
     * Continuous collection.
     */
    CONTINUOUS_COLLECTION(0x2);

    /**
     * Integer value of enumerator.
     */
    private int intValue;

    /**
     * Collection of enumerator values.
     */
    private static java.util.HashMap<Integer, ChargeConfiguration> mappings;

    /**
     * Returns collection of enumerator values.
     * 
     * @return Enumerator values.
     */
    private static HashMap<Integer, ChargeConfiguration> getMappings() {
        synchronized (ChargeConfiguration.class) {
            if (mappings == null) {
                mappings = new HashMap<Integer, ChargeConfiguration>();
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
    ChargeConfiguration(final int value) {
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
     * @return Get enumeration constant values.
     */
    private static ChargeConfiguration[] getEnumConstants() {
        return new ChargeConfiguration[] { PERCENTAGE_BASED_COLLECTION,
                CONTINUOUS_COLLECTION };

    }

    /**
     * Returns enumerator value from an integer value.
     * 
     * @param value
     *            Integer value.
     * @return Enumeration value.
     */
    public static java.util.Set<ChargeConfiguration> forValue(final int value) {
        java.util.Set<ChargeConfiguration> types =
                new HashSet<ChargeConfiguration>();
        if (value != 0) {
            types = new HashSet<ChargeConfiguration>();
            ChargeConfiguration[] enums = getEnumConstants();
            for (int pos = 0; pos != enums.length; ++pos) {
                if ((enums[pos].intValue & value) == enums[pos].intValue) {
                    types.add(enums[pos]);
                }
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
            toInteger(final java.util.Set<ChargeConfiguration> value) {
        int tmp = 0;
        for (ChargeConfiguration it : value) {
            tmp |= it.getValue();
        }
        return tmp;
    }
}