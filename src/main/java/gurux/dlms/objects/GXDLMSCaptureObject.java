package gurux.dlms.objects;

public class GXDLMSCaptureObject {
    /*
     * Constructor.
     */
    public GXDLMSCaptureObject() {

    }

    /**
     * Constructor.
     * 
     * @param aIndex
     *            Attribute index.
     * @param dIndex
     *            Data index.
     */
    public GXDLMSCaptureObject(final int aIndex, final int dIndex) {
        this.attributeIndex = aIndex;
        this.dataIndex = dIndex;
    }

    private int attributeIndex;
    private int dataIndex;

    /**
     * @return Index of DLMS object in the profile generic table.
     */
    public final int getAttributeIndex() {
        return attributeIndex;
    }

    /**
     * @param value
     *            Index of DLMS object in the profile generic table.
     */
    public final void setAttributeIndex(final int value) {
        attributeIndex = value;
    }

    /**
     * @return Data index of DLMS object in the profile generic table.
     */
    public final int getDataIndex() {
        return dataIndex;
    }

    /**
     * @param value
     *            Data index of DLMS object in the profile generic table.
     */
    public final void setDataIndex(final int value) {
        dataIndex = value;
    }
}
