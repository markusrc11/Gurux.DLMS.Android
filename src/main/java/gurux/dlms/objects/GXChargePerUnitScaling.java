package gurux.dlms.objects;

/**
 * Online help:<br>
 * https://www.gurux.fi/Gurux.DLMS.Objects.GXDLMSCharge
 */
public class GXChargePerUnitScaling {
    /**
     * Commodity scale.<br>
     * Online help:<br>
     * https://www.gurux.fi/Gurux.DLMS.Objects.GXDLMSCharge
     */
    private short commodityScale;
    /**
     * Price scale.<br>
     * Online help:<br>
     * https://www.gurux.fi/Gurux.DLMS.Objects.GXDLMSCharge
     */
    private short priceScale;

    /**
     * Online help:<br>
     * https://www.gurux.fi/Gurux.DLMS.Objects.GXDLMSCharge
     * 
     * @return Commodity scale.
     */
    public final short getCommodityScale() {
        return commodityScale;
    }

    /**
     * Online help:<br>
     * https://www.gurux.fi/Gurux.DLMS.Objects.GXDLMSCharge
     * 
     * @param value
     *            Commodity scale.
     */
    public final void setCommodityScale(final short value) {
        commodityScale = value;
    }

    /**
     * Online help:<br>
     * https://www.gurux.fi/Gurux.DLMS.Objects.GXDLMSCharge
     * 
     * @return Price scale.
     */
    public final short getPriceScale() {
        return priceScale;
    }

    /**
     * Online help:<br>
     * https://www.gurux.fi/Gurux.DLMS.Objects.GXDLMSCharge
     * 
     * @param value
     *            Price scale.
     */
    public final void setPriceScale(final short value) {
        priceScale = value;
    }
}