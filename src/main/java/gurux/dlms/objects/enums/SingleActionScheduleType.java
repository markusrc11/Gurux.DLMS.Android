package gurux.dlms.objects.enums;

import java.util.HashMap;

public enum SingleActionScheduleType {
    /**
     * Size of execution_time = 1. Wildcard in date allowed.
     */
    SingleActionScheduleType1(1),
    /**
     * Size of execution_time = n. All time values are the same, wildcards in
     * date not allowed.
     */
    SingleActionScheduleType2(2),
    /**
     * Size of execution_time = n. All time values are the same, wildcards in
     * date are allowed,
     */
    SingleActionScheduleType3(3),
    /**
     * Size of execution_time = n. Time values may be different, wildcards in
     * date not allowed,
     */
    SingleActionScheduleType4(4),
    /**
     * Size of execution_time = n. Time values may be different, wildcards in
     * date are allowed
     */
    SingleActionScheduleType5(5);

    private int intValue;
    private static HashMap<Integer, SingleActionScheduleType> mappings;

    private static java.util.HashMap<Integer, SingleActionScheduleType>
            getMappings() {
        synchronized (SingleActionScheduleType.class) {
            if (mappings == null) {
                mappings = new HashMap<Integer, SingleActionScheduleType>();
            }
        }
        return mappings;
    }

    SingleActionScheduleType(final int value) {
        intValue = value;
        getMappings().put(value, this);
    }

    public int getValue() {
        return intValue;
    }

    public static SingleActionScheduleType forValue(final int value) {
        SingleActionScheduleType ret = getMappings().get(value);
        if (ret == null) {
            throw new IllegalArgumentException(
                    "Invalid single action schedule type enum value.");
        }
        return ret;
    }
}