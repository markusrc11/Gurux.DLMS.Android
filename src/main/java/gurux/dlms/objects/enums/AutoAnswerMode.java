package gurux.dlms.objects.enums;

public enum AutoAnswerMode {
    /**
     * Line dedicated to the device.
     */
    DEVICE,
    /**
     * Shared line management with a limited number of calls allowed. Once the
     * number of calls is reached, the window status becomes inactive until the
     * next start date, whatever the result of the call,
     */
    CALL,
    /**
     * Shared line management with a limited number of successful calls allowed.
     * Once the number of successful communications is reached, the window
     * status becomes inactive until the next start date,
     */
    CONNECTED,
    /**
     * Currently no modem connected.
     */
    NONE
}
