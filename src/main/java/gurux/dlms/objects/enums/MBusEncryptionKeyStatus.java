package gurux.dlms.objects.enums;

/**
 * Online help:<br>
 * https://www.gurux.fi/Gurux.DLMS.Objects.GXDLMSMBusClient
 */
public enum MBusEncryptionKeyStatus {
    NO_ENCRYPTION_KEY, ENCRYPTION_KEY_SET, ENCRYPTION_KEY_TRANSFERRED,
    ENCRYPTION_KEY_SET_AND_TRANSFERRED, ENCRYPTION_KEY_INUSE
}