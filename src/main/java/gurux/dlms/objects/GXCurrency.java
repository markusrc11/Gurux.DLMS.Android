package gurux.dlms.objects;

import gurux.dlms.objects.enums.Currency;

/**
 * Used currency.<br>
 * Online help:<br>
 * https://www.gurux.fi/Gurux.DLMS.Objects.GXDLMSAccount
 */
public class GXCurrency {
    /**
     * Currency name.
     */
    private String name;
    /**
     * Currency scale.
     */
    private short scale;
    /**
     * Currency unit.
     */
    private Currency unit;

    /**
     * Constructor.
     */
    public GXCurrency() {
        unit = Currency.TIME;
    }

    /**
     * @return Currency name.
     */
    public final String getName() {
        return name;
    }

    /**
     * @param value
     *            Currency name.
     */
    public final void setName(final String value) {
        name = value;
    }

    /**
     * @return Currency scale.
     */
    public final short getScale() {
        return scale;
    }

    /**
     * @param value
     *            Currency scale.
     */
    public final void setScale(final short value) {
        scale = value;
    }

    /**
     * @return Currency unit.
     */
    public final Currency getUnit() {
        return unit;
    }

    /**
     * @param value
     *            Currency unit.
     */
    public final void setUnit(final Currency value) {
        unit = value;
    }
}