package gurux.dlms;

import java.util.HashMap;

/**
 * Enumerates Translator output types.
 */
public enum TranslatorOutputType {
    /**
     * Simple XML format.
     */
    SIMPLE_XML(0),
    /**
     * Standard XML format.
     */
    STANDARD_XML(1);

    /**
     * Integer value of enumerator.
     */
    private int intValue;
    /**
     * Collection of enumerator values.
     */
    private static java.util.HashMap<Integer, TranslatorOutputType> mappings;

    /**
     * Returns collection of enumerator values.
     * 
     * @return Enumerator values.
     */
    private static java.util.HashMap<Integer, TranslatorOutputType>
            getMappings() {
        if (mappings == null) {
            synchronized (TranslatorOutputType.class) {
                if (mappings == null) {
                    mappings = new HashMap<Integer, TranslatorOutputType>();
                }
            }
        }
        return mappings;
    }

    /**
     * Constructor.
     * 
     * @param value
     *            Integer value of enumerator.
     */
    TranslatorOutputType(final int value) {
        intValue = value;
        getMappings().put(value, this);
    }

    /**
     * Get integer value for enumerator.
     * 
     * @return Enumerator integer value.
     */
    public int getValue() {
        return intValue;
    }

    /**
     * Returns enumerator value from an integer value.
     * 
     * @param value
     *            Integer value.
     * @return Enumeration value.
     */
    public static TranslatorOutputType forValue(final int value) {
        return getMappings().get(value);
    }
}
