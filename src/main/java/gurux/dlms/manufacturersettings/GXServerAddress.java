package gurux.dlms.manufacturersettings;

public class GXServerAddress {
    private int physicalAddress;
    private HDLCAddressType hdlcAddress = HDLCAddressType.DEFAULT;
    private String formula;
    private int logicalAddress;
    private boolean selected;

    /**
     * Constructor.
     */
    public GXServerAddress() {
    }

    /**
     * Constructor.
     * 
     * @param address
     *            HDLC address type.
     * @param value
     *            Physical address.
     */
    public GXServerAddress(final HDLCAddressType address, final int value) {
        setHDLCAddress(address);
        setPhysicalAddress(value);
    }

    /**
     * @return Is server address enabled.
     */
    public final boolean getSelected() {
        return selected;
    }

    /**
     * @param value
     *            Is server address enabled.
     */
    public final void setSelected(final boolean value) {
        selected = value;
    }

    public final HDLCAddressType getHDLCAddress() {
        return hdlcAddress;
    }

    public final void setHDLCAddress(final HDLCAddressType value) {
        hdlcAddress = value;
    }

    public final String getFormula() {
        return formula;
    }

    public final void setFormula(final String value) {
        formula = value;
    }

    public final int getPhysicalAddress() {
        return physicalAddress;
    }

    public final void setPhysicalAddress(final int value) {
        physicalAddress = value;
    }

    public final int getLogicalAddress() {
        return logicalAddress;
    }

    public final void setLogicalAddress(final int value) {
        logicalAddress = value;
    }
}