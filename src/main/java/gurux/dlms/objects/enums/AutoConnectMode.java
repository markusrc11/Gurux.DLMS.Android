package gurux.dlms.objects.enums;

/**
 * Defines the mode controlling the auto dial functionality concerning the
 * timing.
 */
public enum AutoConnectMode {
    /**
     * No auto dialing,
     */
    NO_AUTO_DIALLING(0),

    /**
     * Auto dialing allowed any time,
     */
    AUTO_DIALLING_ALLOWED_ANYTIME(1),

    /**
     * Auto dialing allowed within the validity time of the calling window.
     */
    AUTO_DIALLING_ALLOWED_CALLING_WINDOW(2),

    /**
     * Regular auto dialing allowed within the validity time of the calling
     * window; alarm initiated auto dialing allowed any time,
     */
    REGULAR_AUTO_DIALLING_ALLOWED_CALLING_WINDOW(3),

    /**
     * SMS sending via Public Land Mobile Network (PLMN),
     */
    SMS_SENDING_PLMN(4),

    /**
     * SMS sending via PSTN.
     */
    SMS_SENDING_PSTN(5),

    /**
     * Email sending.
     */
    EMAIL_SENDING(6),

    /**
     * The device is permanently connected to the communication network.
     */
    PERMANENTLY_CONNECT(101),
    /**
     * The device is permanently connected to the communication network. No
     * connection possible outside the calling window.
     */
    CONNECT_WITH_CALLING_WINDOW(102),
    /**
     * The device is permanently connected to the communication network.
     * Connection is possible as soon as the connect method is invoked.
     */
    CONNECT_INVOKED(103),
    /**
     * The device is usually disconnected. It connects to the communication
     * network as soon as the connect method is invoked
     */
    DISCONNECT_CONNECT_INVOKED(104),

    /**
     * (200..255) manufacturer specific modes
     */
    MANUFACTURE_SPESIFIC(200);

    private int value;
    private static java.util.HashMap<Integer, AutoConnectMode> mappings;

    private static java.util.HashMap<Integer, AutoConnectMode> getMappings() {
        synchronized (AutoConnectMode.class) {
            if (mappings == null) {
                mappings = new java.util.HashMap<Integer, AutoConnectMode>();
            }
        }
        return mappings;
    }

    /*
     * Constructor.
     */
    AutoConnectMode(final int forValue) {
        if (forValue > 200 && forValue < 255) {
            this.value = 200;
        } else {
            this.value = forValue;
        }
        getMappings().put(this.value, this);
    }

    /*
     * Get integer value for enumeration.
     */
    public int getValue() {
        return value;
    }

    /*
     * Convert integer for enumeration value.
     */
    public static AutoConnectMode forValue(final int value) {
        if (value > 200 && value < 255) {
            return MANUFACTURE_SPESIFIC;
        }
        return getMappings().get(value);
    }
}
