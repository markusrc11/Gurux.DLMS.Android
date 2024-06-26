
package gurux.dlms;

/**
 * Enumerates connection state types.
 */
public final class ConnectionState {

    /*
     * Constructor.
     */
    private ConnectionState() {

    }

    /**
     * Connection is not made for the meter.
     */
    public static final byte NONE = 0;
    /**
     * Connection is made for HDLC level.
     */
    public static final byte HDLC = 1;
    /**
     * Connection is made for DLMS level.
     */
    public static final byte DLMS = 2;
}
