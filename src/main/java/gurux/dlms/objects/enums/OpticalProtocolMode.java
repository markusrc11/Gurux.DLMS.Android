package gurux.dlms.objects.enums;

import java.util.HashMap;

/**
 * Defines the protocol used by the meter on the port.
 */
public enum OpticalProtocolMode {
    /**
     * Protocol according to IEC 62056-21 (modes A…E),
     */
    DEFAULT(0),
    /**
     * Protocol according to IEC 62056-46. Using this enumeration value all
     * other attributes of this IC are not applicable.
     */
    NET(1),
    /**
     * Protocol not specified. Using this enumeration value, ProposedBaudrate is
     * used for setting the communication speed on the port. All other
     * attributes are not applicable.
     */
    UNKNOWN(2);

    private int intValue;
    private static java.util.HashMap<Integer, OpticalProtocolMode> mappings;

    private static java.util.HashMap<Integer, OpticalProtocolMode>
            getMappings() {
        if (mappings == null) {
            synchronized (OpticalProtocolMode.class) {
                if (mappings == null) {
                    mappings = new HashMap<Integer, OpticalProtocolMode>();
                }
            }
        }
        return mappings;
    }

    OpticalProtocolMode(final int value) {
        intValue = value;
        getMappings().put(value, this);
    }

    public int getValue() {
        return intValue;
    }

    public static OpticalProtocolMode forValue(final int value) {
        OpticalProtocolMode ret = getMappings().get(value);
        if (ret == null) {
            throw new IllegalArgumentException(
                    "Invalid optical protocol mode enum value.");
        }
        return ret;
    }
}