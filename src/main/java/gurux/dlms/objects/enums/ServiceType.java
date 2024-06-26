package gurux.dlms.objects.enums;

/**
 * Type of service used to push the data.
 */
public enum ServiceType {
    /**
     * Transport service type is TCP/IP.
     */
    TCP(0),
    /**
     * Transport service type is UDP.
     */
    UDP(1),
    /**
     * Transport service type is FTP.
     */
    FTP(2),
    /**
     * Transport service type is SMTP.
     */
    SMTP(3),
    /**
     * Transport service type is SMS.
     */
    SMS(4),
    /**
     * Transport service type is HDLC.
     */
    HDLC(5),
    /**
     * Transport service type is MBUS.
     */
    M_BUS(6),
    /**
     * Transport service type is ZigBee.
     */
    ZIGBEE(7);

    private int intValue;
    private static java.util.HashMap<Integer, ServiceType> mappings;

    private static java.util.HashMap<Integer, ServiceType> getMappings() {
        if (mappings == null) {
            synchronized (ServiceType.class) {
                if (mappings == null) {
                    mappings = new java.util.HashMap<Integer, ServiceType>();
                }
            }
        }
        return mappings;
    }

    ServiceType(final int value) {
        intValue = value;
        getMappings().put(value, this);
    }

    public int getValue() {
        return intValue;
    }

    public static ServiceType forValue(final int value) {
        ServiceType ret = getMappings().get(value);
        if (ret == null) {
            throw new IllegalArgumentException(
                    "Invalid service type enum value.");
        }
        return ret;
    }
}