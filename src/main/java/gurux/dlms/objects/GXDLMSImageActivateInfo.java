package gurux.dlms.objects;

import gurux.dlms.GXByteBuffer;
import gurux.dlms.internal.GXCommon;

public class GXDLMSImageActivateInfo {
    private long size;
    private byte[] identification;
    private byte[] signature;

    /**
     * @return Image_size is the size of the Image(s) to be activated. Expressed
     *         in octets;
     */
    public final long getSize() {
        return size;
    }

    /**
     * @param value
     *            Image_size is the size of the Image(s) to be activated.
     *            Expressed in octets;
     */
    public final void setSize(final long value) {
        size = value;
    }

    /**
     * @return Image identification is the identification of the Image(s) to be
     *         activated, and may contain information like manufacturer, device
     *         type, version information, etc.
     */
    public final byte[] getIdentification() {
        return identification;
    }

    /**
     * @param value
     *            Image identification is the identification of the Image(s) to
     *            be activated, and may contain information like manufacturer,
     *            device type, version information, etc.
     */
    public final void setIdentification(final byte[] value) {
        identification = value;
    }

    /**
     * @return Image signature is the signature of the Image(s) to be activated.
     */
    public final byte[] getSignature() {
        return signature;
    }

    /**
     * @param value
     *            Image signature is the signature of the Image(s) to be
     *            activated.
     */
    public final void setSignature(final byte[] value) {
        signature = value;
    }

    /**
     * Constructor.
     */
    public GXDLMSImageActivateInfo() {
        size = 0;
        identification = null;
        signature = null;
    }

    /**
     * Constructor.
     * 
     * @param forSize
     *            Size.
     * @param forIdentification
     *            Identification.
     * @param forSignature
     *            Signature.
     */
    public GXDLMSImageActivateInfo(final long forSize,
            final byte[] forIdentification, final byte[] forSignature) {
        size = forSize;
        identification = forIdentification;
        signature = forSignature;
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (GXByteBuffer.isAsciiString(identification)) {
            sb.append(new String(identification));
        } else {
            sb.append(GXCommon.toHex(identification, true));
        }
        sb.append(" ");
        if (GXByteBuffer.isAsciiString(signature)) {
            sb.append(new String(signature));
        } else {
            sb.append(GXCommon.toHex(signature, true));
        }
        sb.append(" ");
        sb.append(String.valueOf(size));
        return sb.toString();
    }
}