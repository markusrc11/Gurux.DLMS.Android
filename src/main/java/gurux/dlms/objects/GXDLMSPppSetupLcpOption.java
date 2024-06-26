
package gurux.dlms.objects;

import gurux.dlms.objects.enums.PppSetupLcpOptionType;

public class GXDLMSPppSetupLcpOption {
    private PppSetupLcpOptionType type;
    private Object data;
    private int length;

    public final PppSetupLcpOptionType getType() {
        return type;
    }

    public final void setType(final PppSetupLcpOptionType value) {
        type = value;
    }

    public final int getLength() {
        return length;
    }

    public final void setLength(final int value) {
        length = value;
    }

    public final Object getData() {
        return data;
    }

    public final void setData(final Object value) {
        data = value;
    }

    @Override
    public final String toString() {
        return getType().toString() + " " + String.valueOf(getData());
    }
}