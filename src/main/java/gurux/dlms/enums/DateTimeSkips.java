package gurux.dlms.enums;

import java.util.HashSet;
import java.util.Set;

/*
 * DataType enumerates skipped fields from date time.
 */
public enum DateTimeSkips {
    /**
     * Year part of date time is skipped.
     */
    YEAR(1),

    /**
     * Month part of date time is skipped.
     */
    MONTH(2),

    /**
     * Day part is skipped.
     */
    DAY(4),

    /**
     * Day of week part of date time is skipped.
     */
    DAY_OF_WEEK(8),

    /**
     * Hours part of date time is skipped.
     */
    HOUR(0x10),

    /**
     * Minute part of date time is skipped.
     */
    MINUTE(0x20),

    /**
     * Second part of date time is skipped.
     */
    SECOND(0x40),

    /**
     * Hundreds of seconds part of date time is skipped.
     */
    MILLISECOND(0x80),

    /**
     * Devitation is not used.
     */
    DEVITATION(0x100),

    /**
     * Status is not used.
     */
    STATUS(0x200);

    private int value;

    /*
     * Constructor.
     */
    DateTimeSkips(final int forValue) {
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
    private static DateTimeSkips[] getEnumConstants() {
        return new DateTimeSkips[] { YEAR, MONTH, DAY, DAY_OF_WEEK, HOUR,
                MINUTE, SECOND, MILLISECOND, DEVITATION, STATUS };

    }

    /**
     * Converts the integer value to enumerated value.
     * 
     * @param value
     *            The integer value, which is read from the device.
     * @return The enumerated value, which represents the integer.
     */
    public static java.util.Set<DateTimeSkips> forValue(final int value) {
        Set<DateTimeSkips> types = new HashSet<DateTimeSkips>();
        DateTimeSkips[] enums = getEnumConstants();
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
    public static int toInteger(final Set<DateTimeSkips> value) {
        int tmp = 0;
        for (DateTimeSkips it : value) {
            tmp |= it.getValue();
        }
        return tmp;
    }
}
