
package gurux.dlms.objects.enums;

import java.util.HashMap;

public enum PppSetupLcpOptionType {
    MAX_REC_UNIT(1), ASYNC_CONTROL_CHAR_MAP(2), AUTH_PROTOCOL(3),
    MAGIC_NUMBER(5), PROTOCOL_FIELD_COMPRESSION(7),
    ADDRESS_AND_CTRL_COMPRESSION(8), FCS_ALTERNATIVES(9), CALLBACK(13);

    private int intValue;
    private static HashMap<Integer, PppSetupLcpOptionType> mappings;

    private static java.util.HashMap<Integer, PppSetupLcpOptionType>
            getMappings() {
        if (mappings == null) {
            synchronized (PppSetupLcpOptionType.class) {
                if (mappings == null) {
                    mappings = new HashMap<Integer, PppSetupLcpOptionType>();
                }
            }
        }
        return mappings;
    }

    PppSetupLcpOptionType(final int value) {
        intValue = value;
        getMappings().put(value, this);
    }

    public int getValue() {
        return intValue;
    }

    public static PppSetupLcpOptionType forValue(final int value) {
        PppSetupLcpOptionType ret = getMappings().get(value);
        if (ret == null) {
            throw new IllegalArgumentException(
                    "Invalid PPP setup LCP option type enum value.");
        }
        return ret;
    }
}