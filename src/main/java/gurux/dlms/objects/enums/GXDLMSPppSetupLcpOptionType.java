
//
// Version:         $Revision$,
//                  $Date$
//                  $Author$
package gurux.dlms.objects.enums;

import java.util.HashMap;

public enum GXDLMSPppSetupLcpOptionType {
    MAX_REC_UNIT(1), ASYNC_CONTROL_CHAR_MAP(2), AUTH_PROTOCOL(3),
    MAGIC_NUMBER(5), PROTOCOL_FIELD_COMPRESSION(7),
    ADDRESS_AND_CTRL_COMPRESSION(8), FCS_ALTERNATIVES(9), CALLBACK(13);

    private int intValue;
    private static HashMap<Integer, GXDLMSPppSetupLcpOptionType> mappings;

    private static java.util.HashMap<Integer, GXDLMSPppSetupLcpOptionType>
            getMappings() {
        if (mappings == null) {
            synchronized (GXDLMSPppSetupLcpOptionType.class) {
                if (mappings == null) {
                    mappings =
                            new HashMap<Integer, GXDLMSPppSetupLcpOptionType>();
                }
            }
        }
        return mappings;
    }

    GXDLMSPppSetupLcpOptionType(final int value) {
        intValue = value;
        getMappings().put(new Integer(value), this);
    }

    public int getValue() {
        return intValue;
    }

    public static GXDLMSPppSetupLcpOptionType forValue(final int value) {
        return getMappings().get(new Integer(value));
    }
}