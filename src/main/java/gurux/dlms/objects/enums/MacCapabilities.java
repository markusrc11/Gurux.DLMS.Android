package gurux.dlms.objects.enums;

import java.util.HashSet;
import java.util.Set;

/**
 * Present functional state of the node.
 */
public enum MacCapabilities {
    /**
     * Switch capable.
     */
    SWITCH_CAPABLE(1),
    /**
     * Packet aggregation.
     */
    PACKET_AGGREGATION(2),
    /**
     * Contention free period.
     */
    CONTENTION_FREE_PERIOD(4),
    /**
     * Direct connection.
     */
    DIRECT_CONNECTION(8),
    /**
     * Multicast.
     */
    MULTICAST(0x10),
    /**
     * PHY Robustness Management.
     */
    PHY_ROBUSTNESS_MANAGEMENT(0x20),
    /**
     * ARQ.
     */
    ARQ(0x40),
    /**
     * Reserved for future use.
     */
    RESERVED_FOR_FUTURE_USE(0x80),
    /**
     * Direct Connection Switching.
     */
    DIRECT_CONNECTION_SWITCHING(0x100),
    /**
     * Multicast Switching Capability.
     */
    MULTICAST_SWITCHING_CAPABILITY(0x200),
    /**
     * PHY Robustness Management Switching Capability.
     */
    PHY_ROBUSTNESS_MANAGEMENT_SWITCHING_CAPABILITY(0x400),
    /**
     * ARQ Buffering Switching Capability.
     */
    ARQ_BUFFERING_SWITCHING_CAPABILITY(0x800);

    private int value;

    /*
     * Constructor.
     */
    MacCapabilities(final int forValue) {
        value = forValue;
    }

    /*
     * Get integer value for enumerator.
     */
    public int getValue() {
        return value;
    }

    /**
     * @return Get enumeration constant values.
     */
    private static MacCapabilities[] getEnumConstants() {
        return new MacCapabilities[] { SWITCH_CAPABLE, PACKET_AGGREGATION,
                CONTENTION_FREE_PERIOD, DIRECT_CONNECTION, MULTICAST,
                PHY_ROBUSTNESS_MANAGEMENT, ARQ, RESERVED_FOR_FUTURE_USE,
                DIRECT_CONNECTION_SWITCHING, MULTICAST_SWITCHING_CAPABILITY,
                PHY_ROBUSTNESS_MANAGEMENT_SWITCHING_CAPABILITY,
                ARQ_BUFFERING_SWITCHING_CAPABILITY };

    }

    /**
     * Converts the integer value to enumerated value.
     * 
     * @param value
     *            The integer value, which is read from the device.
     * @return The enumerated value, which represents the integer.
     */
    public static java.util.Set<MacCapabilities> forValue(final int value) {
        Set<MacCapabilities> types = new HashSet<MacCapabilities>();
        MacCapabilities[] enums = getEnumConstants();
        for (int pos = 0; pos != enums.length; ++pos) {
            if ((enums[pos].value & value) == enums[pos].value) {
                types.add(enums[pos]);
            }
        }
        return types;
    }

    /**
     * Converts the enumerated value to integer value.
     * 
     * @param value
     *            The enumerated value.
     * @return The integer value.
     */
    public static int toInteger(final Set<MacCapabilities> value) {
        int tmp = 0;
        for (MacCapabilities it : value) {
            tmp |= it.getValue();
        }
        return tmp;
    }
}
