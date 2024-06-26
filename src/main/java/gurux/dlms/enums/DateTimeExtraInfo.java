package gurux.dlms.enums;

import java.util.HashSet;
import java.util.Set;

/*
 *  Date time extra info.
 */
public enum DateTimeExtraInfo {
    // Daylight savings begin.
    DST_BEGIN(0x1),
    // Daylight savings end.
    DST_END(0x2),
    // Last day of month.
    LAST_DAY(0x4),
    // 2nd last day of month
    LAST_DAY2(0x8);

    private int value;

    /*
     * Constructor.
     */
    DateTimeExtraInfo(final int forValue) {
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
    private static DateTimeExtraInfo[] getEnumConstants() {
        return new DateTimeExtraInfo[] { DST_BEGIN, DST_END, LAST_DAY,
                LAST_DAY2 };

    }

    /**
     * Converts the integer value to enumerated value.
     * 
     * @param value
     *            The integer value, which is read from the device.
     * @return The enumerated value, which represents the integer.
     */
    public static java.util.Set<DateTimeExtraInfo> forValue(final int value) {
        Set<DateTimeExtraInfo> types = new HashSet<DateTimeExtraInfo>();
        DateTimeExtraInfo[] enums = getEnumConstants();
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
    public static int toInteger(final Set<DateTimeExtraInfo> value) {
        int tmp = 0;
        for (DateTimeExtraInfo it : value) {
            tmp |= it.getValue();
        }
        return tmp;
    }
}
