package gurux.dlms.objects;

import gurux.dlms.enums.ObjectType;

public class GXDLMSObjectDefinition {
    private ObjectType objectType;
    private String logicalName;

    /**
     * @return Object type.
     * @deprecated use {@link #getObjectType} instead.
     */
    public final ObjectType getClassId() {
        return objectType;
    }

    /**
     * @param value
     *            Object type.
     * @deprecated use {@link #setObjectType} instead.
     */
    public final void setClassId(final ObjectType value) {
        objectType = value;
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
     * @return Logical Name.
     */
    public final String getLogicalName() {
        return logicalName;
    }

    /**
     * @param value
     *            Logical Name.
     */
    public final void setLogicalName(final String value) {
        logicalName = value;
    }

    /*
     * Constructor
     */
    public GXDLMSObjectDefinition() {

    }

    /*
     * Constructor
     */
    public GXDLMSObjectDefinition(final ObjectType type, final String ln) {
        objectType = type;
        logicalName = ln;
    }

    @Override
    public final String toString() {
        return objectType.toString() + " " + logicalName;
    }
}
