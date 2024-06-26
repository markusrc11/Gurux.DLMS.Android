package gurux.dlms.manufacturersettings;

public class GXObisValueItem {
    private String uiValue;
    private Object value;

    /**
     * Constructor.
     */
    public GXObisValueItem() {
    }

    /**
     * Constructor.
     * 
     * @param devValue
     *            Device value.
     * @param userValue
     *            Value that is shown to the user.
     */
    public GXObisValueItem(final Object devValue, final String userValue) {
        setValue(devValue);
        setUIValue(userValue);
    }

    /**
     * @return Value that is read from or written to the Device.
     */
    public final Object getValue() {
        return value;
    }

    /**
     * @param val
     *            Value that is read from or written to the Device.
     */
    public final void setValue(final Object val) {
        value = val;
    }

    /**
     * @return Value that is shown to the user.
     */
    public final String getUIValue() {
        return uiValue;
    }

    /**
     * @param val
     *            Value that is shown to the user.
     */
    public final void setUIValue(final String val) {
        uiValue = val;
    }
}