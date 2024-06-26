package gurux.dlms.objects.enums;

/**
 * Security policy Enforces authentication and/or encryption algorithm provided
 * with security suite. This enumeration is used for version 0.
 */
public enum SecurityPolicy0 {
    /**
     * Security is not used.
     */
    NOTHING,
    /**
     * All messages are authenticated.
     */
    AUTHENTICATED,

    /**
     * All messages are encrypted.
     */
    ENCRYPTED,

    /**
     * All messages are authenticated and encrypted.
     */
    AUTHENTICATED_ENCRYPTED
}