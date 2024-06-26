
package gurux.dlms.objects.enums;

import java.util.HashMap;

public enum GXDLMSPppSetupIPCPOptionType {
    /*
     * 
     */
    IP_COMPRESSION_PROTOCOL(2),
    /*
     * 
     */
    PREF_LOCAL_IP(3),
    /*
     * 
     */
    PREF_PEER_IP(20),
    /*
     * 
     */
    GAO(21),
    /*
     * 
     */
    USIP(22);

    private int intValue;
    private static HashMap<Integer, GXDLMSPppSetupIPCPOptionType> mappings;

    private static HashMap<Integer, GXDLMSPppSetupIPCPOptionType>
            getMappings() {
        if (mappings == null) {
            synchronized (GXDLMSPppSetupIPCPOptionType.class) {
                mappings = new HashMap<Integer, GXDLMSPppSetupIPCPOptionType>();
            }
        }
        return mappings;
    }

    GXDLMSPppSetupIPCPOptionType(final int value) {
        intValue = value;
        getMappings().put(new Integer(value), this);
    }

    public int getValue() {
        return intValue;
    }

    public static GXDLMSPppSetupIPCPOptionType forValue(final int value) {
        return getMappings().get(new Integer(value));
    }
}