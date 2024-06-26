package gurux.dlms.objects;

/**
 * Online help:<br>
 * https://www.gurux.fi/Gurux.DLMS.Objects.GXDLMSAccount
 */
public class GXTokenGatewayConfiguration {
    /**
     * Credit reference.<br>
     * Online help:<br>
     * https://www.gurux.fi/Gurux.DLMS.Objects.GXDLMSAccount
     */
    private String creditReference;

    /**
     * Token proportion.<br>
     * Online help:<br>
     * https://www.gurux.fi/Gurux.DLMS.Objects.GXDLMSAccount
     */
    private byte tokenProportion;

    /**
     * Online help:<br>
     * https://www.gurux.fi/Gurux.DLMS.Objects.GXDLMSAccount
     * 
     * @return Credit reference.
     */
    public final String getCreditReference() {
        return creditReference;
    }

    /**
     * Online help:<br>
     * https://www.gurux.fi/Gurux.DLMS.Objects.GXDLMSAccount
     * 
     * @param value
     *            Credit reference.
     */
    public final void setCreditReference(String value) {
        creditReference = value;
    }

    /**
     * Online help:<br>
     * https://www.gurux.fi/Gurux.DLMS.Objects.GXDLMSAccount
     * 
     * @return Token proportion.
     */
    public final byte getTokenProportion() {
        return tokenProportion;
    }

    /**
     * Online help:<br>
     * https://www.gurux.fi/Gurux.DLMS.Objects.GXDLMSAccount
     * 
     * @param value
     *            Token proportion.
     */
    public final void setTokenProportion(byte value) {
        tokenProportion = value;
    }
}