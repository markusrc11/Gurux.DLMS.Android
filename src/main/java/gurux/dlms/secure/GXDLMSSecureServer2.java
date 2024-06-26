package gurux.dlms.secure;

import gurux.dlms.GXDLMSServer2;
import gurux.dlms.enums.InterfaceType;
import gurux.dlms.objects.GXDLMSAssociationLogicalName;
import gurux.dlms.objects.GXDLMSAssociationShortName;
import gurux.dlms.objects.GXDLMSHdlcSetup;
import gurux.dlms.objects.GXDLMSTcpUdpSetup;

/**
 * Implements secured DLMS server.
 */
public abstract class GXDLMSSecureServer2 extends GXDLMSServer2 {
    /**
     * Ciphering settings.
     */
    private GXCiphering ciphering;

    /**
     * Constructor.
     * 
     * @param ln
     *            Association logical name.
     * @param type
     *            Interface type.
     */
    public GXDLMSSecureServer2(final GXDLMSAssociationLogicalName ln,
            final InterfaceType type) {
        super(ln, type);
        ciphering = new GXCiphering("ABCDEFGH".getBytes());
        setCipher(ciphering);
    }

    /**
     * Constructor.
     * 
     * @param sn
     *            Association short name.
     * @param type
     *            Interface type.
     */
    public GXDLMSSecureServer2(final GXDLMSAssociationShortName sn,
            final InterfaceType type) {
        super(sn, type);
        ciphering = new GXCiphering("ABCDEFGH".getBytes());
        setCipher(ciphering);
    }

    /**
     * Constructor.
     * 
     * @param ln
     *            Association logical name.
     * @param hdlc
     *            HDLC settings.
     */
    public GXDLMSSecureServer2(final GXDLMSAssociationLogicalName ln,
            final GXDLMSHdlcSetup hdlc) {
        super(ln, hdlc);
        ciphering = new GXCiphering("ABCDEFGH".getBytes());
        setCipher(ciphering);
    }

    /**
     * Constructor.
     * 
     * @param sn
     *            Association short name.
     * @param hdlc
     *            HDLC settings.
     */
    public GXDLMSSecureServer2(final GXDLMSAssociationShortName sn,
            final GXDLMSHdlcSetup hdlc) {
        super(sn, hdlc);
        ciphering = new GXCiphering("ABCDEFGH".getBytes());
        setCipher(ciphering);
    }

    /**
     * Constructor.
     * 
     * @param ln
     *            Association logical name.
     * @param wrapper
     *            Wrapper settings.
     */
    public GXDLMSSecureServer2(final GXDLMSAssociationLogicalName ln,
            final GXDLMSTcpUdpSetup wrapper) {
        super(ln, wrapper);
        ciphering = new GXCiphering("ABCDEFGH".getBytes());
        setCipher(ciphering);
    }

    /**
     * Constructor.
     * 
     * @param sn
     *            Association short name.
     * @param wrapper
     *            Wrapper settings.
     */
    public GXDLMSSecureServer2(final GXDLMSAssociationShortName sn,
            final GXDLMSTcpUdpSetup wrapper) {
        super(sn, wrapper);
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
