
package gurux.dlms.enums;

/**
 * Definition describes definition errors.
 */
public enum Definition {
    /**
     * Other error.
     */
    OTHER(0),
    /**
     * Object is Undefined.
     */
    OBJECT_UNDEFINED(1),
    /**
     * Object class inconsistent.
     */
    OBJECT_CLASS_INCONSISTENT(2),
    /**
     * Object attribute inconsistent.
     */
    OBJECT_ATTRIBUTE_INCONSISTENT(3);

    private int value;
    private static java.util.HashMap<Integer, Definition> mappings;

    private static java.util.HashMap<Integer, Definition> getMappings() {
        synchronized (Definition.class) {
            if (mappings == null) {
                mappings = new java.util.HashMap<Integer, Definition>();
            }
        }
        return mappings;
    }

    Definition(final int mode) {
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
    public static Definition forValue(final int value) {
        return getMappings().get(value);
    }
}