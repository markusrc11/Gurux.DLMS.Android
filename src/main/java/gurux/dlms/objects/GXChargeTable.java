package gurux.dlms.objects;

/**
 * Online help:<br>
 * https://www.gurux.fi/Gurux.DLMS.Objects.GXDLMSCharge
 */
public class GXChargeTable {
    /**
     * Index.<br>
     * Online help:<br>
     * https://www.gurux.fi/Gurux.DLMS.Objects.GXDLMSCharge
     */
    private String index;

    /**
     * Charge per unit.<br>
     * Online help:<br>
     * https://www.gurux.fi/Gurux.DLMS.Objects.GXDLMSCharge
     */
    private short chargePerUnit;

    /**
     * Online help:<br>
     * https://www.gurux.fi/Gurux.DLMS.Objects.GXDLMSCharge
     * 
     * @return Index.
     */
    public final String getIndex() {
        return index;
    }

    /**
     * Online help:<br>
     * https://www.gurux.fi/Gurux.DLMS.Objects.GXDLMSCharge
     * 
     * @param value
     *            Index.
     */
    public final void setIndex(final String value) {
        index = value;
    }

    /**
     * Online help:<br>
     * https://www.gurux.fi/Gurux.DLMS.Objects.GXDLMSCharge
     * 
     * @return Charge per unit.
     */
    public final short getChargePerUnit() {
        return chargePerUnit;
    }

    /**
     * Online help:<br>
     * https://www.gurux.fi/Gurux.DLMS.Objects.GXDLMSCharge
     * 
     * @param value
     *            Charge per unit.
     */
    public final void setChargePerUnit(final short value) {
        chargePerUnit = value;
    }

}