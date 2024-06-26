package gurux.dlms.objects;

/**
 * Online help:<br>
 * https://www.gurux.fi/Gurux.DLMS.Objects.GXDLMSCharge
 */
public class GXCommodity {
    /**
     * Executed object.<br>
     * Online help:<br>
     * https://www.gurux.fi/Gurux.DLMS.Objects.GXDLMSCharge
     */
    private GXDLMSObject target;

    /**
     * Attribute index.<br>
     * Online help:<br>
     * https://www.gurux.fi/Gurux.DLMS.Objects.GXDLMSCharge
     */
    private int index;

    /**
     * @return Executed object.
     */
    public final GXDLMSObject getTarget() {
        return target;
    }

    /**
     * @param value
     *            Executed object.
     */
    public final void setTarget(GXDLMSObject value) {
        target = value;
    }

    /**
     * @return Attribute index.
     */
    public final int getIndex() {
        return index;
    }

    /**
     * @param value
     *            Attribute index.
     */
    public final void setIndex(int value) {
        index = value;
    }

}