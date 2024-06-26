package gurux.dlms.secure;

import gurux.dlms.GXDLMSServer;
import gurux.dlms.enums.InterfaceType;

/**
 * Implements secured DLMS server.
 */
public abstract class GXDLMSSecureServer extends GXDLMSServer {
    /**
     * Ciphering settings.
     */
    private GXCiphering ciphering;

    /**
     * Constructor.
     * 
     * @param logicalNameReferencing
     *            Is logical name referencing used.
     * @param type
     *            Interface type.
     */
    public GXDLMSSecureServer(final boolean logicalNameReferencing,
            final InterfaceType type) {
        super(logicalNameReferencing, type);
        ciphering = new GXCiphering("ABCDEFGH".getBytes());
        setCipher(ciphering);
    }

    public final GXCiphering getCiphering() {
        return ciphering;
    }

    /**
     * @return Key Encrypting Key, also known as Master key.
     */
    public final byte[] getKek() {
        return getSettings().getKek();
    }

    /**
     * @param value
     *            Key Encrypting Key, also known as Master key.
     */
    public final void setKek(final byte[] value) {
        getSettings().setKek(value);
    }
}
