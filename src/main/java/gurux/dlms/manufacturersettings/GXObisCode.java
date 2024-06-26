package gurux.dlms.manufacturersettings;

import gurux.dlms.enums.ObjectType;

public class GXObisCode {
    private int version;
    private int attributeIndex;
    private String logicalName;
    private String description;
    private ObjectType objectType = ObjectType.NONE;
    private GXAttributeCollection attributes;
    private String uiDataType;

    /**
     * Constructor.
     */

    public GXObisCode() {
        attributes = new GXAttributeCollection();
        attributes.setParent(this);
    }

    @Override
    public final String toString() {
        return getObjectType().toString();
    }

    /**
     * Constructor.
     * 
     * @param ln
     *            Logical name.
     * @param type
     *            Object type.
     * @param index
     *            Attribute index.
     */
    public GXObisCode(final String ln, final ObjectType type, final int index) {
        setLogicalName(ln);
        setObjectType(type);
        setAttributeIndex(index);
    }

    /**
     * Constructor.
     * 
     * @param ln
     *            Logical name.
     * @param type
     *            Object type.
     * @param desc
     *            Object description.
     */
    public GXObisCode(final String ln, final ObjectType type,
            final String desc) {
        setLogicalName(ln);
        setObjectType(type);
        setDescription(desc);
    }

    /**
     * @return Attribute index.
     */
    public final int getAttributeIndex() {
        return attributeIndex;
    }

    /**
     * @param value
     *            Attribute index.
     */
    public final void setAttributeIndex(final int value) {
        attributeIndex = value;
    }

    /**
     * @return Logical name of the OBIS item.
     */
    public final String getLogicalName() {
        return logicalName;
    }

    /**
     * @param value
     *            Logical name of the OBIS item.
     */
    public final void setLogicalName(final String value) {
        logicalName = value;
    }

    /**
     * @return Description of the OBIS item.
     */
    public final String getDescription() {
        return description;
    }

    /**
     * @param value
     *            Description of the OBIS item.
     */
    public final void setDescription(final String value) {
        description = value;
    }

    /**
     * @return Object type.
     */
    public final ObjectType getObjectType() {
        return objectType;
    }

    /**
     * @param value
     *            Object type.
     */
    public final void setObjectType(final ObjectType value) {
        objectType = value;
    }

    /**
     * @return Version number.
     */
    public final int getVersion() {
        return version;
    }

    /**
     * @param value
     *            Version number.
     */
    public final void setVersion(final int value) {
        version = value;
    }

    /**
     * @return Object attributes collection.
     */
    public final GXAttributeCollection getAttributes() {
        return attributes;
    }

    /**
     * @param value
     *            Object attributes collection.
     */
    public final void setAttributes(final GXAttributeCollection value) {
        attributes = value;
    }

    /**
     * @return Standard data types.
     */
    public final String getUIDataType() {
        return uiDataType;
    }

    public final void setUIDataType(final String value) {
        uiDataType = value;
    }

}