
package gurux.dlms.objects;

import gurux.dlms.enums.DataType;
import gurux.dlms.enums.ObjectType;
import gurux.dlms.internal.GXCommon;
import gurux.dlms.objects.enums.ScriptActionType;

public class GXDLMSScriptAction {

    /**
     * Executed object.
     */
    private GXDLMSObject target;

    private ScriptActionType type;
    private ObjectType objectType;
    private String logicalName;
    private int index;
    private Object parameter;
    private DataType parameterType;

    /**
     * Constructor.
     */
    public GXDLMSScriptAction() {
        type = ScriptActionType.NONE;
        objectType = ObjectType.NONE;
        parameterType = DataType.NONE;
    }

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
    public final void setTarget(final GXDLMSObject value) {
        target = value;
    }

    /**
     * @return Defines which action to be applied to the referenced object.
     */
    public final ScriptActionType getType() {
        return type;
    }

    /**
     * @param value
     *            Defines which action to be applied to the referenced object.
     */
    public final void setType(final ScriptActionType value) {
        type = value;
    }

    /**
     * @return Executed object type.
     * @deprecated use {@link #getTarget} instead.
     */
    public final ObjectType getObjectType() {
        return objectType;
    }

    /**
     * @param value
     *            Executed object type.
     * @deprecated use {@link #setTarget} instead.
     */
    public final void setObjectType(final ObjectType value) {
        objectType = value;
    }

    /**
     * @return Logical name of executed object.
     * @deprecated use {@link #getTarget} instead.
     */
    public final String getLogicalName() {
        return logicalName;
    }

    /**
     * @param value
     *            Logical name of executed object.
     * @deprecated use {@link #setTarget} instead.
     */
    public final void setLogicalName(final String value) {
        logicalName = value;
    }

    /**
     * @return Defines which attribute of the selected object is affected; or
     *         which specific method is to be executed.
     */
    public final int getIndex() {
        return index;
    }

    /**
     * @param value
     *            Defines which attribute of the selected object is affected; or
     *            which specific method is to be executed.
     */
    public final void setIndex(final int value) {
        index = value;
    }

    /**
     * @return Parameter is service specific.
     */
    public final Object getParameter() {
        return parameter;
    }

    /**
     * @param value
     *            Parameter is service specific.
     * @param dataType
     *            Data type.
     */
    public final void setParameter(final Object value,
            final DataType dataType) {
        parameter = value;
        parameterType = dataType;
    }

    /**
     * @return Return parameter type.
     */
    public final DataType getParameterType() {
        return parameterType;
    }

    @Override
    public final String toString() {
        String tmp;
        if (parameter instanceof byte[]) {
            tmp = GXCommon.toHex((byte[]) parameter, true);
        } else {
            tmp = String.valueOf(parameter);
        }
        if (target != null) {
            return type.toString() + " "
                    + String.valueOf(target.getObjectType()) + " "
                    + target.getLogicalName() + " " + String.valueOf(index)
                    + " " + tmp;
        }
        return type.toString() + " " + String.valueOf(objectType) + " "
                + logicalName + " " + String.valueOf(index) + " " + tmp;
    }

}
