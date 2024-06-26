package gurux.dlms.internal;

import gurux.dlms.GXDLMSTranslatorStructure;
import gurux.dlms.enums.DataType;

/**
 * This class is used in DLMS data parsing.
 */
public class GXDataInfo {
    /**
     * Last array index.
     */
    private int index;
    /**
     * Items count in array.
     */
    private int count;
    /**
     * Object data type.
     */
    private DataType type = DataType.NONE;
    /**
     * Is data parsed to the end.
     */
    private boolean complete = true;

    private GXDLMSTranslatorStructure xml;

    /**
     * @return Last array index.
     */
    public final int getIndex() {
        return index;
    }

    /**
     * @param value
     *            Last array index.
     */
    public final void setIndex(final int value) {
        this.index = value;
    }

    /**
     * @return Items count in array.
     */
    public final int getCount() {
        return count;
    }

    /**
     * @param value
     *            Items count in array.
     */
    public final void setCount(final int value) {
        count = value;
    }

    /**
     * @return Object data type.
     */
    public final DataType getType() {
        return type;
    }

    /**
     * @param value
     *            Object data type.
     */
    public final void setType(final DataType value) {
        type = value;
    }

    /**
     * @return Is data parsed to the end.
     */
    public final boolean isComplete() {
        return complete;
    }

    /**
     * @param value
     *            Is data parsed to the end.
     */
    public final void setComplete(final boolean value) {
        complete = value;
    }

    public final void setXml(final GXDLMSTranslatorStructure value) {
        xml = value;
    }

    public final GXDLMSTranslatorStructure getXml() {
        return xml;
    }

    public final void clear() {
        index = 0;
        count = 0;
        type = DataType.NONE;
        complete = true;
    }
}
