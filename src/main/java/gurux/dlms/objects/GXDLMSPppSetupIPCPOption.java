package gurux.dlms.objects;

import gurux.dlms.objects.enums.PppSetupIPCPOptionType;

public class GXDLMSPppSetupIPCPOption {
    private PppSetupIPCPOptionType type;
    private int length;
    private Object data;

    public final PppSetupIPCPOptionType getType() {
        return type;
    }

    public final void setType(final PppSetupIPCPOptionType value) {
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
}