package gurux.dlms.objects.enums;

public enum MessageType {
    COSEM_APDU(0), COSEM_APDU_XML(1), MANUFACTURER_SPESIFIC(128);
    // (128...255) manufacturer specific

    private int intValue;
    private static java.util.HashMap<Integer, MessageType> mappings;

    private static java.util.HashMap<Integer, MessageType> getMappings() {
        if (mappings == null) {
            synchronized (MessageType.class) {
                if (mappings == null) {
                    mappings = new java.util.HashMap<Integer, MessageType>();
                }
            }
        }
        return mappings;
    }

    MessageType(final int value) {
        intValue = value;
        getMappings().put(value, this);
    }

    public int getValue() {
        return intValue;
    }

    public static MessageType forValue(final int value) {
        MessageType ret = getMappings().get(value);
        if (ret == null) {
            throw new IllegalArgumentException(
                    "Invalid message type enum value.");
        }
        return ret;
    }
}