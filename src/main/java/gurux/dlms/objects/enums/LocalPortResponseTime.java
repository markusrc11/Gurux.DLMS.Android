package gurux.dlms.objects.enums;

/**
 * Defines the minimum time between the reception of a request (end of request
 * telegram) and the transmission of the response (begin of response telegram).
 */
public enum LocalPortResponseTime {
    /**
     * Minimum time is 20 ms.
     */
    ms20(0),
    /**
     * Minimum time is 200 ms.
     */
    ms200(1);

    private int intValue;
    private static java.util.HashMap<Integer, LocalPortResponseTime> mappings;

    private static java.util.HashMap<Integer, LocalPortResponseTime>
            getMappings() {
        synchronized (LocalPortResponseTime.class) {
            if (mappings == null) {
                mappings =
                        new java.util.HashMap<Integer, LocalPortResponseTime>();
            }
        }
        return mappings;
    }

    LocalPortResponseTime(final int value) {
        intValue = value;
        getMappings().put(value, this);
    }

    public int getValue() {
        return intValue;
    }

    public static LocalPortResponseTime forValue(final int value) {
        LocalPortResponseTime ret = getMappings().get(value);
        if (ret == null) {
            throw new IllegalArgumentException(
                    "Invalid local port response time enum value.");
        }
        return ret;
    }
}