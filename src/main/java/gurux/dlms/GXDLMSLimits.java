package gurux.dlms;

/**
 * GXDLMSLimits contains commands for retrieving and setting the limits of field
 * length and window size, when communicating with the server.
 */
public class GXDLMSLimits {
    static final int DEFAULT_MAX_INFO_TX = 128;
    static final int DEFAULT_MAX_INFO_RX = 128;
    static final int DEFAULT_WINDOWS_SIZE_TX = 1;
    static final int DEFAULT_WINDOWS_SIZE_RX = 1;

    /**
     * The maximum information field length in transmit. DefaultValue is 128.
     */
    private int maxInfoTX;
    /**
     * The maximum information field length in receive. DefaultValue is 62.
     */
    private int maxInfoRX;
    /**
     * The window size in transmit. DefaultValue is 1.
     */
    private int windowSizeTX;
    /**
     * The window size in receive. DefaultValue is 1.
     */
    private int windowSizeRX;

    private GXDLMSSettings settings;

    /**
     * Is Max Info TX and RX count for frame size or PDU size.
     */
    private boolean useFrameSize = false;

    /*
     * Constructor.
     */
    GXDLMSLimits(GXDLMSSettings parent) {
        settings = parent;
        setMaxInfoTX(DEFAULT_MAX_INFO_TX);
        setMaxInfoRX(DEFAULT_MAX_INFO_RX);
        setWindowSizeTX(DEFAULT_WINDOWS_SIZE_TX);
        setWindowSizeRX(DEFAULT_WINDOWS_SIZE_RX);
    }

    /**
     * Gets maximum information field length in transmit. DefaultValue is 128.
     * 
     * @return Maximum information field length in transmit.
     */
    public final int getMaxInfoTX() {
        return maxInfoTX;
    }

    /**
     * Sets maximum information field length in transmit.
     * 
     * @param value
     *            Maximum information field length in transmit.
     */
    public final void setMaxInfoTX(final int value) {
        maxInfoTX = value;
    }

    /**
     * Get the maximum information field length in receive. DefaultValue is 62.
     * 
     * @return The maximum information field length in receive.
     */
    public final int getMaxInfoRX() {
        return maxInfoRX;
    }

    /**
     * Set the maximum information field length in receive.
     * 
     * @param value
     *            The maximum information field length in receive.
     */
    public final void setMaxInfoRX(final int value) {
        maxInfoRX = value;
    }

    /**
     * Get The window size in transmit. DefaultValue is 1.
     * 
     * @return The window size in transmit.
     */
    public final int getWindowSizeTX() {
        return windowSizeTX;
    }

    /**
     * Set the window size in transmit.
     * 
     * @param value
     *            The window size in transmit.
     */
    public final void setWindowSizeTX(final int value) {
        windowSizeTX = value;
    }

    /**
     * Get the window size in receive. DefaultValue is 1.
     * 
     * @return The window size in receive.
     */
    public final int getWindowSizeRX() {
        return windowSizeRX;
    }

    /**
     * Set the window size in receive.
     * 
     * @param value
     *            The window size in receive.
     */
    public final void setWindowSizeRX(final int value) {
        windowSizeRX = value;
    }

    /**
     * Get the HDLC sender frame sequence number.
     * 
     * @return sender frame.
     */
    public final short getSenderFrame() {
        return settings.senderFrame;
    }

    /**
     * Set the HDLC sender frame sequence number.
     * 
     * @param value
     *            sender frame.
     */
    public final void setSenderFrame(final short value) {
        settings.senderFrame = value;
    }

    /**
     * Get the HDLC receiver frame sequence number.
     * 
     * @return receiver frame.
     */
    public final short getReceiverFrame() {
        return settings.receiverFrame;
    }

    /**
     * Set HDLC receiver frame sequence number.
     * 
     * @param value
     *            receiver frame.
     */
    public final void setReceiverFrame(final short value) {
        settings.receiverFrame = value;
    }

    /**
     * @return Is Max Info TX and RX count for frame size or PDU size.
     */
    public boolean isUseFrameSize() {
        return useFrameSize;
    }

    /**
     * @param value
     *            Is Max Info TX and RX count for frame size or PDU size.
     */
    public void setUseFrameSize(final boolean value) {
        useFrameSize = value;
    }
}