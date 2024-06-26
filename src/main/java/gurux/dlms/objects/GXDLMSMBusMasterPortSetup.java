package gurux.dlms.objects;

import gurux.dlms.GXDLMSSettings;
import gurux.dlms.ValueEventArgs;
import gurux.dlms.enums.DataType;
import gurux.dlms.enums.ErrorCode;
import gurux.dlms.enums.ObjectType;
import gurux.dlms.internal.GXCommon;
import gurux.dlms.objects.enums.BaudRate;

/**
 * Online help: <br>
 * https://www.gurux.fi/Gurux.DLMS.Objects.GXDLMSMBusMasterPortSetup
 */
public class GXDLMSMBusMasterPortSetup extends GXDLMSObject
        implements IGXDLMSBase {
    private BaudRate commSpeed;

    /**
     * Constructor.
     */
    public GXDLMSMBusMasterPortSetup() {
        super(ObjectType.MBUS_MASTER_PORT_SETUP);
        commSpeed = BaudRate.BAUDRATE_2400;
    }

    /**
     * Constructor.
     * 
     * @param ln
     *            Logical Name of the object.
     */
    public GXDLMSMBusMasterPortSetup(final String ln) {
        super(ObjectType.MBUS_MASTER_PORT_SETUP, ln, 0);
        commSpeed = BaudRate.BAUDRATE_2400;
    }

    /**
     * Constructor.
     * 
     * @param ln
     *            Logical Name of the object.
     * @param sn
     *            Short Name of the object.
     */
    public GXDLMSMBusMasterPortSetup(final String ln, final int sn) {
        super(ObjectType.MBUS_MASTER_PORT_SETUP, ln, sn);
        commSpeed = BaudRate.BAUDRATE_2400;
    }

    /**
     * @return The communication speed supported by the port.
     */
    public final BaudRate getCommSpeed() {
        return commSpeed;
    }

    /**
     * @param value
     *            The communication speed supported by the port.
     */
    public final void setCommSpeed(final BaudRate value) {
        commSpeed = value;
    }

    @Override
    public final Object[] getValues() {
        return new Object[] { getLogicalName(), commSpeed };
    }

    @Override
    public final int[] getAttributeIndexToRead(final boolean all) {
        java.util.ArrayList<Integer> attributes =
                new java.util.ArrayList<Integer>();
        // LN is static and read only once.
        if (all || getLogicalName() == null
                || getLogicalName().compareTo("") == 0) {
            attributes.add(1);
        }
        // CommSpeed
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
            return DataType.ENUM;
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
            return getLogicalName();
        }
        if (e.getIndex() == 2) {
            return commSpeed.ordinal();
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
            commSpeed = BaudRate.values()[((Number) e.getValue()).intValue()];
        } else {
            e.setError(ErrorCode.READ_WRITE_DENIED);
        }
    }

    @Override
    public final void load(final GXXmlReader reader) throws XMLStreamException {
        commSpeed =
                BaudRate.values()[reader.readElementContentAsInt("CommSpeed")];
    }

    @Override
    public final void save(final GXXmlWriter writer) throws XMLStreamException {
        if (commSpeed != BaudRate.BAUDRATE_2400) {
            writer.writeElementString("CommSpeed", commSpeed.ordinal());
        }
    }

    @Override
    public final void postLoad(final GXXmlReader reader) {
        // Not needed for this object.
    }
}