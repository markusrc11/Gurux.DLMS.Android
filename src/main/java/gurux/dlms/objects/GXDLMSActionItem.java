package gurux.dlms.objects;

public class GXDLMSActionItem {
    private String logicalName;
    private int scriptSelector;

    public final String getLogicalName() {
        return logicalName;
    }

    public final void setLogicalName(final String value) {
        logicalName = value;
    }

    public final int getScriptSelector() {
        return scriptSelector;
    }

    public final void setScriptSelector(final int value) {
        scriptSelector = value;
    }

    @Override
    public final String toString() {
        return logicalName + " " + String.valueOf(scriptSelector);
    }
}