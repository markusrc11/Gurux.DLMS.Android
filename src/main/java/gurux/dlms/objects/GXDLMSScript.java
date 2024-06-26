package gurux.dlms.objects;

import java.util.List;

/**
 * Script of script table.
 */
public class GXDLMSScript {
    /**
     * Script identifier.
     */
    private int id;

    /**
     * Script actions.
     */
    private List<GXDLMSScriptAction> actions;

    /**
     * Constructor.
     */
    public GXDLMSScript() {
        actions = new java.util.ArrayList<GXDLMSScriptAction>();
    }

    /**
     * @return Script identifier.
     */
    public final int getId() {
        return id;
    }

    /**
     * @param value
     *            Script identifier.
     */
    public final void setId(final int value) {
        id = value;
    }

    /**
     * @return Script actions.
     */
    public final List<GXDLMSScriptAction> getActions() {
        return actions;
    }
}
