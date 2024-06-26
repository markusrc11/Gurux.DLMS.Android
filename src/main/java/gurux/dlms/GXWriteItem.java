package gurux.dlms;

import gurux.dlms.enums.DataType;
import gurux.dlms.objects.GXDLMSObject;

public class GXWriteItem {

    /**
     * Constructor.
     */
    public GXWriteItem() {
        dataType = DataType.NONE;
    }

    /**
     * Constructor.
     * 
     * @param object
     *            Object to write.
     * @param attributeIndex
     *            Attribute index.
     */
    public GXWriteItem(final GXDLMSObject object, final int attributeIndex) {
        dataType = DataType.NONE;
        target = object;
        index = attributeIndex;
    }

    /**
     * Written object.
     */
    private GXDLMSObject target;

    /**
     * Attribute index to write.
     */
    private int index;

    /**
     * Data type to write.
     */
    private DataType dataType;

    /**
     * Parameter selector.
     */
    private int selector;
    /**
     * Optional parameters.
     */
    private Object parameters;

    /**
     * @return the selector
     */
    public final int getSelector() {
        return selector;
    }

    /**
     * @param value
     *            the selector to set
     */
    public final void setSelector(final int value) {
        selector = value;
    }

    /**
     * @return the data type
     */
    public final DataType getDataType() {
        return dataType;
    }

    /**
     * @param value
     *            the objectType to set
     */
    public final void setDataType(final DataType value) {
        dataType = value;
    }

    /**
     * @return the parameters
     */
    public final Object getParameters() {
        return parameters;
    }

    /**
     * @param value
     *            the parameters to set
     */
    public final void setParameters(final Object value) {
        parameters = value;
    }

    /**
     * @return the target.
     */
    public final GXDLMSObject getTarget() {
        return target;
    }

    /**
     * @param value
     *            the target to set.
     */
    public final void setTarget(final GXDLMSObject value) {
        target = value;
    }

    /**
     * @return the index.
     */
    public final int getIndex() {
        return index;
    }

    /**
     * @param value
     *            the index to set.
     */
    public final void setIndex(final int value) {
        index = value;
    }
}
