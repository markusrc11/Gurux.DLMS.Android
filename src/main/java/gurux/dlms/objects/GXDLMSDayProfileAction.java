package gurux.dlms.objects;

import gurux.dlms.GXTime;

/**
 * Activity Calendar's Day Profile Action is defined on the standard.
 */
public class GXDLMSDayProfileAction {
    private GXTime time;
    private String logicalName;
    private int selector;

    /**
     * Constructor.
     */
    public GXDLMSDayProfileAction() {

    }

    /**
     * Constructor.
     * 
     * @param startTime
     *            Start time.
     * @param scriptLogicalName
     *            Logical name.
     * @param scriptSelector
     *            Script selector.
     */
    public GXDLMSDayProfileAction(final GXTime startTime,
            final String scriptLogicalName, final int scriptSelector) {
        setStartTime(startTime);
        setScriptLogicalName(scriptLogicalName);
        setScriptSelector(scriptSelector);
    }

    /**
     * @return Defines the time when the script is to be executed.
     */
    public final GXTime getStartTime() {
        return time;
    }

    /**
     * @param value
     *            Defines the time when the script is to be executed.
     */
    public final void setStartTime(final GXTime value) {
        time = value;
    }

    /**
     * @return Defines the logical name of the "Script table" object.
     */
    public final String getScriptLogicalName() {
        return logicalName;
    }

    /**
     * @param value
     *            Defines the logical name of the "Script table" object.
     */
    public final void setScriptLogicalName(final String value) {
        logicalName = value;
    }

    /**
     * @return Defines the script_identifier of the script to be executed.
     */
    public final int getScriptSelector() {
        return selector;
    }

    /**
     * @param value
     *            Defines the script_identifier of the script to be executed.
     */
    public final void setScriptSelector(final int value) {
        selector = value;
    }

    @Override
    public final String toString() {
        return time.toString() + " " + logicalName;
    }
}