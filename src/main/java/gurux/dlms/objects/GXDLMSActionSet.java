package gurux.dlms.objects;

public class GXDLMSActionSet {
    private GXDLMSActionItem actionUp;
    private GXDLMSActionItem actionDown;

    /**
     * Constructor.
     */
    public GXDLMSActionSet() {
        setActionUp(new GXDLMSActionItem());
        setActionDown(new GXDLMSActionItem());
    }

    public final GXDLMSActionItem getActionUp() {
        return actionUp;
    }

    public final void setActionUp(final GXDLMSActionItem value) {
        actionUp = value;
    }

    public final GXDLMSActionItem getActionDown() {
        return actionDown;
    }

    public final void setActionDown(final GXDLMSActionItem value) {
        actionDown = value;
    }
}
