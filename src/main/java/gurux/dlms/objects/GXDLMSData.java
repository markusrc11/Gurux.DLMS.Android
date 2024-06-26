package gurux.dlms.objects;

import gurux.dlms.GXDLMSConverter;
import gurux.dlms.GXDLMSSettings;
import gurux.dlms.ValueEventArgs;
import gurux.dlms.enums.DataType;
import gurux.dlms.enums.ErrorCode;
import gurux.dlms.enums.ObjectType;
import gurux.dlms.internal.GXCommon;

/**
 * Online help:<br>
 * https://www.gurux.fi/Gurux.DLMS.Objects.GXDLMSData
 */
public class GXDLMSData extends GXDLMSObject implements IGXDLMSBase {
    /**
     * Value of data object.<br>
     * Online help:<br>
     * https://www.gurux.fi/Gurux.DLMS.Objects.GXDLMSData
     */
    private Object value;

    /**
     * Constructor.
     */
    public GXDLMSData() {
        this(null, 0);
    }

    /**
     * Constructor.
     * 
     * @param ln
     *            Logical Name of the object.
     */
    public GXDLMSData(final String ln) {
        this(ln, 0);
    }

    /**
     * Constructor.
     * 
     * @param ln
     *            Logical Name of the object.
     * @param sn
     *            Short Name of the object.
     */
    public GXDLMSData(final String ln, final int sn) {
        super(ObjectType.DATA, ln, sn);
    }

    /**
     * Online help:<br>
     * https://www.gurux.fi/Gurux.DLMS.Objects.GXDLMSData
     * 
     * @return Value of data object.
     */
    public final Object getValue() {
        return value;
    }

    /**
     * Online help:<br>
     * https://www.gurux.fi/Gurux.DLMS.Objects.GXDLMSData
     * 
     * @param forValue
     *            Value of data object.
     */
    public final void setValue(final Object forValue) {
        value = forValue;
    }

    @Override
    public final Object[] getValues() {
        return new Object[] { getLogicalName(), getValue() };
    }

    /*
     * Returns collection of attributes to read. If attribute is static and
     * already read or device is returned HW error it is not returned.
     */
    @Override
    public final int[] getAttributeIndexToRead(final boolean all) {
        java.util.ArrayList<Integer> attributes =
                new java.util.ArrayList<Integer>();
        // LN is static and read only once.
        if (all || getLogicalName() == null
                || getLogicalName().compareTo("") == 0) {
            attributes.add(1);
        }
        // Value
        if (all || canRead(2)) {
            attributes.add(2);
        }
        return GXDLMSObjectHelpers.toIntArray(attributes);
    }

    /*
     * Returns amount of attributes.
     */
    @Override
    public final int getAttributeCount() {
        return 2;
    }

    /*
     * Returns amount of methods.
     */
    @Override
    public final int getMethodCount() {
        return 0;
    }

    @Override
    public final DataType getDataType(final int index) {
        if (index == 1) {
            return DataType.OCTET_STRING;
        }
        if (index == 2) {
            return super.getDataType(index);
        }
        throw new IllegalArgumentException(
                "getDataType failed. Invalid attribute index.");
    }

    /*
     * Returns value of given attribute.
     */
    @Override
    public final Object getValue(final GXDLMSSettings settings,
            final ValueEventArgs e) {
        if (e.getIndex() == 1) {
            return GXCommon.logicalNameToBytes(getLogicalName());
        }
        if (e.getIndex() == 2) {
            return getValue();
        }
        e.setError(ErrorCode.READ_WRITE_DENIED);
        return null;
    }

    /*
     * Set value of given attribute.
     */
    @Override
    public final void setValue(final GXDLMSSettings settings,
            final ValueEventArgs e) {
        if (e.getIndex() == 1) {
            setLogicalName(GXCommon.toLogicalName(e.getValue()));
        } else if (e.getIndex() == 2) {
            setValue(e.getValue());
        } else {
            e.setError(ErrorCode.READ_WRITE_DENIED);
        }
    }

    @Override
    public final void load(final GXXmlReader reader) throws XMLStreamException {
        value = reader.readElementContentAsObject("Value", null, this, 2);
    }

    @Override
    public final void save(final GXXmlWriter writer) throws XMLStreamException {
        DataType dt = getDataType(2);
        if (value != null && dt == DataType.NONE) {
            dt = GXDLMSConverter.getDLMSDataType(value);
        }
        writer.writeElementObject("Value", value, dt, getUIDataType(2));
    }

    @Override
    public final void postLoad(final GXXmlReader reader) {
    }
}