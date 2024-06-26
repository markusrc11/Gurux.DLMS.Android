package gurux.dlms.objects.enums;

import java.util.HashMap;

public enum PppSetupIPCPOptionType {
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
    private static HashMap<Integer, PppSetupIPCPOptionType> mappings;

    private static HashMap<Integer, PppSetupIPCPOptionType> getMappings() {
        if (mappings == null) {
            synchronized (PppSetupIPCPOptionType.class) {
                mappings = new HashMap<Integer, PppSetupIPCPOptionType>();
            }
        }
        return mappings;
    }

    PppSetupIPCPOptionType(final int value) {
        intValue = value;
        getMappings().put(value, this);
    }

    public int getValue() {
        return intValue;
    }

    public static PppSetupIPCPOptionType forValue(final int value) {
        PppSetupIPCPOptionType ret = getMappings().get(value);
        if (ret == null) {
            throw new IllegalArgumentException(
                    "Invalid PPP setup IP CP option type enum value.");
        }
        return ret;
    }
}