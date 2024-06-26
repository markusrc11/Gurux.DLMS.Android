package gurux.dlms.objects.enums;

/**
 * Defines the GSM status.
 */
public enum GsmStatus {
    /**
     * Not registered.
     */
    NONE,
    /**
     * Registered, home network.
     */
    HOME_NETWORK,
    /**
     * Not registered, but MT is currently searching a new operator to register
     * to.
     */
    SEARCHING,
    /**
     * Registration denied.
     */
    DENIED,
    /**
     * Unknown.
     */
    UNKNOWN,
    /**
     * Registered, roaming.
     */
    ROAMING;
}
