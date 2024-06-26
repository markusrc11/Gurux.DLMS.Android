package gurux.dlms.objects;

import gurux.dlms.objects.enums.Ip4SetupIpOptionType;

public class GXDLMSIp4SetupIpOption {
    private Ip4SetupIpOptionType type;
    private short length;
    private byte[] data;

    public final Ip4SetupIpOptionType getType() {
        return type;
    }

    public final void setType(final Ip4SetupIpOptionType value) {
        if (value == null) {
            throw new IllegalArgumentException(
                    "Invalid Ip4 setup IP option type.");
        }
        type = value;
    }

    public final short getLength() {
        return length;
    }

    public final void setLength(final short value) {
        length = value;
    }

    public final byte[] getData() {
        return data;
    }

    public final void setData(final byte[] value) {
        data = value;
    }
}
