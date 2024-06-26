/**
 * Reserved for internal use.
 */

package gurux.dlms.enums;

import java.util.HashSet;
import java.util.Set;

/**
 * RequestTypes enumerates the replies of the server to a client's request,
 * indicating the request type.
 */
public enum RequestTypes {
    /**
     * More data blocks are available for the request.
     */
    DATABLOCK(1),

    /**
     * More data frames are available for the request.
     */
    FRAME(2),

    /**
     * More data is available for GBT.
     */
    GBT(4);

    /**
     * Integer value of enumerator.
     */
    private int intValue;

    /**
     * Collection of enumerator values.
     */
    private static java.util.HashMap<Integer, RequestTypes> mappings;

    /**
     * Returns collection of enumerator values.
     * 
     * @return Enumerator values.
     */
    private static java.util.HashMap<Integer, RequestTypes> getMappings() {
        if (mappings == null) {
            synchronized (RequestTypes.class) {
                if (mappings == null) {
                    mappings = new java.util.HashMap<Integer, RequestTypes>();
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
    RequestTypes(final int value) {
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
     * @return Get enumeration constant values.
     */
    private static RequestTypes[] getEnumConstants() {
        return new RequestTypes[] { DATABLOCK, FRAME, GBT };

    }

    /**
     * Returns enumerator value from an integer value.
     * 
     * @param value
     *            Integer value.
     * @return Enumeration value.
     */
    public static java.util.Set<RequestTypes> forValue(final int value) {
        Set<RequestTypes> types = new HashSet<RequestTypes>();
        RequestTypes[] enums = getEnumConstants();
        for (int pos = 0; pos != enums.length; ++pos) {
            if ((enums[pos].intValue & value) == enums[pos].intValue) {
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
    public static int toInteger(final Set<RequestTypes> value) {
        int tmp = 0;
        for (RequestTypes it : value) {
            tmp |= it.getValue();
        }
        return tmp;
    }
}