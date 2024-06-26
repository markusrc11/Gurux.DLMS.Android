package gurux.dlms.manufacturersettings;

import gurux.dlms.enums.DataType;

public class GXDLMSAttribute extends GXDLMSAttributeSettings {
    /**
     * Constructor.
     * 
     * @param index
     *            Attribute index.
     */
    public GXDLMSAttribute(final int index) {
        this(index, DataType.NONE, DataType.NONE, 0);
    }

    /**
     * Constructor.
     */
    public GXDLMSAttribute() {
        this(0, DataType.NONE, DataType.NONE, 0);
    }

    /**
     * Constructor.
     * 
     * @param index
     *            Attribute index.
     * @param uiType
     *            UI Data type.
     */
    public GXDLMSAttribute(final int index, final DataType uiType) {
        this(index, DataType.NONE, uiType, 0);
    }

    /**
     * Constructor.
     * 
     * @param index
     *            Attribute index.
     * @param type
     *            Data type.
     * @param uiType
     *            UI data type.
     */
    public GXDLMSAttribute(final int index, final DataType type,
            final DataType uiType) {
        this(index, type, uiType, 0);
    }

    /**
     * Constructor.
     * 
     * @param index
     *            Attribute index.
     * @param type
     *            Data type.
     * @param uiType
     *            UI data type.
     * @param order
     *            Order.
     */
    public GXDLMSAttribute(final int index, final DataType type,
            final DataType uiType, final int order) {
        setIndex(index);
        setType(type);
        setUIType(uiType);
        setOrder(order);
    }
}