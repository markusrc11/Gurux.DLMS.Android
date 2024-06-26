package gurux.dlms.enums;

/**
 * The AssociationResult enumerates the answers, which the server can give to
 * client's association request.
 */
public enum AssociationResult {
    /**
     * Association request is accepted.
     */
    ACCEPTED(0),
    /**
     * Association request is permanently rejected.
     */
    PERMANENT_REJECTED(1),
    /**
     * Association request is transiently rejected.
     */
    TRANSIENT_REJECTED(2);

    private final int intValue;
    private static java.util.HashMap<Integer, AssociationResult> mappings;

    private static java.util.HashMap<Integer, AssociationResult> getMappings() {
        synchronized (AssociationResult.class) {
            if (mappings == null) {
                mappings = new java.util.HashMap<Integer, AssociationResult>();
            }
        }
        return mappings;
    }

    AssociationResult(final int value) {
        intValue = value;
        getMappings().put(value, this);
    }

    /*
     * Get integer value for enumerator.
     */
    public int getValue() {
        return intValue;
    }

    /*
     * Convert integer for enum value.
     */
    public static AssociationResult forValue(final int value) {
        return getMappings().get(value);
    }
}