package gurux.dlms.objects.enums;

/**
 * Enumerates token status codes.<br>
 * Online help:<br>
 * https://www.gurux.fi/Gurux.DLMS.Objects.GXDLMSTokenGateway
 */
public enum TokenStatusCode {
    /**
     * Token format result OK.
     */
    FORMAT_OK,
    /**
     * Authentication result OK.
     */
    AUTHENTICATION_OK,
    /**
     * Validation result OK.
     */
    VALIDATION_OK,
    /**
     * Token execution result OK.
     */
    TOKEN_EXECUTION_OK,
    /**
     * Token format failure.
     */
    TOKEN_FORMAT_FAILURE,
    /**
     * Authentication failure.
     */
    AUTHENTICATION_FAILURE,
    /**
     * Validation result failure.
     */
    VALIDATION_RESULT_FAILURE,
    /**
     * Token execution result failure.
     */
    TOKEN_EXECUTION_RESULT_FAILURE,
    /**
     * Token received and not yet processed.
     */
    TOKEN_RECEIVED;

    /**
     * Get integer value for enumerator.
     * 
     * @return Enumerator integer value.
     */
    public int getValue() {
        return this.ordinal();
    }

    /**
     * Returns enumerator value from an integer value.
     * 
     * @param value
     *            Integer value.
     * @return Enumeration value.
     */
    public static TokenStatusCode forValue(int value) {
        return values()[value];
    }
}