package gurux.dlms.secure;

import gurux.dlms.GXDLMSNotify;
import gurux.dlms.enums.InterfaceType;

/**
 * This class is used to send data notify and push messages to the clients.
 */
public class GXDLMSSecureNotify extends GXDLMSNotify {

    /**
     * Ciphering settings.
     */
    private GXCiphering ciphering;

    /**
     * Constructor.
     * 
     * @param useLogicalNameReferencing
     *            Is Logical Name referencing used.
     * @param clientAddress
     *            Server address.
     * @param serverAddress
     *            Client address.
     * @param interfaceType
     *            Object type.
     */
    public GXDLMSSecureNotify(final boolean useLogicalNameReferencing,
            final int clientAddress, final int serverAddress,
            final InterfaceType interfaceType) {
        super(useLogicalNameReferencing, clientAddress, serverAddress,
                interfaceType);
        ciphering = new GXCiphering("ABCDEFGH".getBytes());
        setCipher(ciphering);
    }

    /**
     * @return Ciphering settings.
     */
    public final GXCiphering getCiphering() {
        return ciphering;
    }
}
