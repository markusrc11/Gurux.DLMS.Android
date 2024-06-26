package gurux.dlms.objects.enums;

/**
 * Global key types.
 */
public enum GlobalKeyType {
    /**
     * Global unicast encryption key. <br>
     * Client and server uses this message to send Ephemeral Public Key to other
     * party.
     */
    UNICAST_ENCRYPTION,
    /**
     * Global broadcast encryption key.
     */
    BROADCAST_ENCRYPTION,
    /**
     * Authentication key.
     */
    AUTHENTICATION,
    /**
     * Key Encrypting Key, also known as Master key.
     */
    KEK;
}
