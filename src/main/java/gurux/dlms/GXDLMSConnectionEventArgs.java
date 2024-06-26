package gurux.dlms;

public class GXDLMSConnectionEventArgs {
    /**
     * Server ID that client try to use to make connection.
     */
    private long serverID;

    public final long getServerID() {
        return serverID;
    }

    public final void setServerID(final long value) {
        serverID = value;
    }
}