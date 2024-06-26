
package gurux.dlms.enums;

import java.util.HashMap;

/**
 * Hardware resource describes hardware errors.
 */
public enum HardwareResource {
    /**
     * Other hardware resource error.
     */
    OTHER(0),

    /**
     * Memory is unavailable.
     */
    MEMORY_UNAVAILABLE(1),

    /**
     * Processor resource is unavailable.
     */
    PROCESSOR_RESOURCE_UNAVAILABLE(2),

    /**
     * Mass storage is unavailable.
     */
    MASS_STORAGE_UNAVAILABLE(3),

    /**
     * Other resource is unavailable.
     */
    OTHER_RESOURCE_UNAVAILABLE(4);

    private int value;
    private static HashMap<Integer, HardwareResource> mappings;

    private static HashMap<Integer, HardwareResource> getMappings() {
        synchronized (HardwareResource.class) {
            if (mappings == null) {
                mappings = new HashMap<Integer, HardwareResource>();
            }
        }
        return mappings;
    }

    HardwareResource(final int mode) {
        this.value = mode;
        getMappings().put(mode, this);
    }

    /*
     * Get integer value for enum.
     */
    public final int getValue() {
        return value;
    }

    /*
     * Convert integer for enum value.
     */
    public static HardwareResource forValue(final int value) {
        return getMappings().get(value);
    }
}