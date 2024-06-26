package gurux.dlms.objects;

import gurux.dlms.enums.ObjectType;

public class GXDLMSMonitoredValue {
    private ObjectType objectType;
    private String logicalName;
    private int attributeIndex;

    public GXDLMSMonitoredValue() {
        objectType = ObjectType.NONE;
    }

    public final void update(final GXDLMSObject value, final int index) {
        objectType = value.getObjectType();
        logicalName = value.getLogicalName();
        attributeIndex = index;
    }

    public final ObjectType getObjectType() {
        return objectType;
    }

    public final void setObjectType(final ObjectType value) {
        objectType = value;
    }

    public final String getLogicalName() {
        return logicalName;
    }

    public final void setLogicalName(final String value) {
        logicalName = value;
    }

    public final int getAttributeIndex() {
        return attributeIndex;
    }

    public final void setAttributeIndex(final int value) {
        attributeIndex = value;
    }

    @Override
    public final String toString() {
        return String.valueOf(objectType) + " " + logicalName + " "
                + String.valueOf(attributeIndex);
    }
}