package gurux.dlms.objects;

public class GXDLMSGSMCellInfo {
    /**
     * Four-byte cell ID.
     */
    private long cellId;

    /**
     * Bit Error Rate.
     */
    private int ber;

    /**
     * Two byte location area code (LAC).
     */
    private int locationId;
    /**
     * Signal quality.
     */
    private int signalQuality;

    /**
     * Mobile Country Code.
     */
    private int mobileCountryCode;

    /**
     * Mobile Network Code.
     */
    private int mobileNetworkCode;

    /**
     * Absolute radio frequency channel number.
     */
    private long channelNumber;

    /**
     * @return Four-byte cell ID.
     */
    public final long getCellId() {
        return cellId;
    }

    /**
     * @param value
     *            Four-byte cell ID.
     */
    public final void setCellId(final long value) {
        cellId = value;
    }

    /**
     * @return Two byte location area code (LAC).
     */
    public final int getLocationId() {
        return locationId;
    }

    /**
     * @param value
     *            Two byte location area code (LAC).
     */
    public final void setLocationId(final int value) {
        locationId = value;
    }

    /**
     * @return Signal quality.
     */
    public final int getSignalQuality() {
        return signalQuality;
    }

    /**
     * @param value
     *            Signal quality.
     */
    public final void setSignalQuality(final int value) {
        signalQuality = value;
    }

    /**
     * @return Bit Error Rate.
     */
    public final int getBer() {
        return ber;
    }

    /**
     * @param value
     *            Bit Error Rate.
     */
    public final void setBer(final int value) {
        ber = value;
    }

    /**
     * @return Mobile Country Code.
     */
    public int getMobileCountryCode() {
        return mobileCountryCode;
    }

    /**
     * @param value
     *            Mobile Country Code.
     */
    public void setMobileCountryCode(final int value) {
        mobileCountryCode = value;
    }

    /**
     * @return Absolute radio frequency channel number.
     */
    public long getChannelNumber() {
        return channelNumber;
    }

    /**
     * @param value
     *            Absolute radio frequency channel number.
     */
    public void setChannelNumber(final long value) {
        channelNumber = value;
    }

    /**
     * @return Mobile Network Code.
     */
    public int getMobileNetworkCode() {
        return mobileNetworkCode;
    }

    /**
     * @param value
     *            Mobile Network Code.
     */
    public void setMobileNetworkCode(final int value) {
        mobileNetworkCode = value;
    }

}