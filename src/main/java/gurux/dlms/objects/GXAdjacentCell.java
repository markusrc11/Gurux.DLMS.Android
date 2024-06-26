package gurux.dlms.objects;

public class GXAdjacentCell {
    /**
     * Four-byte cell ID.
     */
    private long cellId;

    /**
     * Signal quality.
     */
    private short signalQuality;

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
    public final void setCellId(long value) {
        cellId = value;
    }

    /**
     * @return Signal quality.
     */
    public final short getSignalQuality() {
        return signalQuality;
    }

    /**
     * @param value
     *            Signal quality.
     */
    public final void setSignalQuality(final short value) {
        signalQuality = value;
    }
}