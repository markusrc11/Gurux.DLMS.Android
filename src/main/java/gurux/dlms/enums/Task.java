package gurux.dlms.enums;

/**
 * Task describes load task errors.
 */
public enum Task {
    /**
     * Other error.
     */
    OTHER(0),
    /**
     * No remote control.
     */
    NO_REMOTE_CONTROL(1),
    /**
     * Ti is stopped.
     */
    TI_STOPPED(2),
    /**
     * TI is running.
     */
    TI_RUNNING(3),
    /**
     * TI is unusable.
     */
    TI_UNUSABLE(4);

    private int intValue;
    private static java.util.HashMap<Integer, Task> mappings;

    private static java.util.HashMap<Integer, Task> getMappings() {
        if (mappings == null) {
            synchronized (Task.class) {
                if (mappings == null) {
                    mappings = new java.util.HashMap<Integer, Task>();
                }
            }
        }
        return mappings;
    }

    Task(final int value) {
        intValue = value;
        getMappings().put(value, this);
    }

    public int getValue() {
        return intValue;
    }

    public static Task forValue(final int value) {
        return getMappings().get(value);
    }
}