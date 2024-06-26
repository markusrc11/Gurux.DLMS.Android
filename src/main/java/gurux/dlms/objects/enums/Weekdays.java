package gurux.dlms.objects.enums;

import java.util.HashSet;
import java.util.Set;

/*
 * Defines the weekdays.
 */
public enum Weekdays {
    /**
     * Indicates Monday.
     */
    MONDAY(0x1),
    /**
     * Indicates Tuesday.
     */
    TUESDAY(0x2),
    /**
     * Indicates Wednesday.
     */
    WEDNESDAY(0x4),
    /**
     * Indicates Thursday.
     */
    THURSDAY(0x8),
    /**
     * Indicates Friday.
     */
    FRIDAY(0x10),
    /**
     * Indicates Saturday.
     */
    SATURDAY(0x20),
    /**
     * Indicates Sunday.
     */
    SUNDAY(0x40);

    private int value;

    /*
     * Constructor.
     */
    Weekdays(final int forValue) {
        value = forValue;
    }

    /*
     * Get integer value for enumerator.
     */
    public int getValue() {
        return value;
    }

    /**
     * @return Get enumeration constant values.
     */
    private static Weekdays[] getEnumConstants() {
        return new Weekdays[] { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,
                SATURDAY, SUNDAY };

    }

    /**
     * Converts the integer value to enumerated value.
     * 
     * @param value
     *            The integer value, which is read from the device.
     * @return The enumerated value, which represents the integer.
     */
    public static java.util.Set<Weekdays> forValue(final int value) {
        Set<Weekdays> types = new HashSet<Weekdays>();
        Weekdays[] enums = getEnumConstants();
        for (int pos = 0; pos != enums.length; ++pos) {
            if ((enums[pos].value & value) == enums[pos].value) {
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
    public static int toInteger(final Set<Weekdays> value) {
        int tmp = 0;
        for (Weekdays it : value) {
            tmp |= it.getValue();
        }
        return tmp;
    }
}
