package gurux.dlms.enums;

/**
 * Used security model.
 */
public enum Security {
    /**
     * Transport security is not used.
     */
    NONE(0),

    /**
     * Authentication security is used.
     */
    AUTHENTICATION(0x10),

    /**
     * Encryption security is used.
     */
    ENCRYPTION(0x20),

    /**
     * Authentication and Encryption security are used.
     */
    AUTHENTICATION_ENCRYPTION(0x30);

    private int intValue;
    private static java.util.HashMap<Integer, Security> mappings;

    private static java.util.HashMap<Integer, Security> getMappings() {
        if (mappings == null) {
            synchronized (Security.class) {
                if (mappings == null) {
                    mappings = new java.util.HashMap<Integer, Security>();
                }
            }
        }
        return mappings;
    }

    Security(final int value) {
        intValue = value;
        getMappings().put(value, this);
    }

    public int getValue() {
        return intValue;
    }

    public static Security forValue(final int value) {
        Security tmp = getMappings().get(value);
        if (tmp == null) {
            throw new IllegalArgumentException(
                    "Invalid security integer value.");
        }
        return tmp;
    }

    @Override
    public String toString() {
        String str;
        Security value = Security.forValue(getValue());
        switch (value) {
        case NONE:
            str = "NONE";
            break;
        case AUTHENTICATION:
            str = "AUTHENTICATION";
            break;
        case ENCRYPTION:
            str = "ENCRYPTION";
            break;
        case AUTHENTICATION_ENCRYPTION:
            str = "AUTHENTICATION_ENCRYPTION";
            break;
        default:
            throw new IllegalArgumentException("Security");
        }
        return str;
    }

    public static Security valueOfString(final String value) {
        Security v;
        if ("NONE".equalsIgnoreCase(value)) {
            v = Security.NONE;
        } else if ("AUTHENTICATION".equalsIgnoreCase(value)) {
            v = Security.AUTHENTICATION;
        } else if ("ENCRYPTION".equalsIgnoreCase(value)) {
            v = Security.ENCRYPTION;
        } else if ("AUTHENTICATION_ENCRYPTION".equalsIgnoreCase(value)) {
            v = Security.AUTHENTICATION_ENCRYPTION;
        } else {
            throw new IllegalArgumentException(value);
        }
        return v;
    }
}