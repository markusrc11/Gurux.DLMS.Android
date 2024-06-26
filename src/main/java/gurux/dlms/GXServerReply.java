package gurux.dlms;

public class GXServerReply {

    /**
     * Connection info.
     */
    private GXDLMSConnectionEventArgs connectionInfo;

    /**
     * Server received data.
     */
    private byte[] data;

    /**
     * Server reply message.
     */
    private byte[] reply;

    /**
     * Message count to send.
     */
    private int count;

    /**
     * Constructor.
     * 
     * @param value
     *            Received data.
     */
    public GXServerReply(byte[] value) {
        data = value;
    }

    /**
     * @return the data
     */
    public final byte[] getData() {
        return data;
    }

    /**
     * @param value
     *            The data to set.
     */
    public final void setData(final byte[] value) {
        data = value;
    }

    /**
     * @return The reply message.
     */
    public final byte[] getReply() {
        return reply;
    }

    /**
     * @param value
     *            the replyMessages to set
     */
    public final void setReply(final byte[] value) {
        reply = value;
    }

    /**
     * @return Connection info.
     */
    public final GXDLMSConnectionEventArgs getConnectionInfo() {
        return connectionInfo;
    }

    /**
     * @param value
     *            Connection info.
     */
    public final void setConnectionInfo(final GXDLMSConnectionEventArgs value) {
        connectionInfo = value;
    }

    /**
     * @return Is GBT streaming in progress.
     */
    public final boolean isStreaming() {
        return getCount() != 0;
    }

    /**
     * @return Message count to send.
     */
    public final int getCount() {
        return count;
    }

    /**
     * @param value
     *            Message count to send.
     */
    public final void setCount(final int value) {
        count = value;
    }
}
