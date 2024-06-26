package gurux.dlms.secure;

/**
 * Enumerate values that are add to counted GMAC.
 */
public final class CountType {
    /**
     * Constructor.
     */
    private CountType() {

    }

    /**
     * Total packet is created.
     */
    public static final byte PACKET = -1;
    /**
     * Counted Tag is added.
     */
    public static final byte TAG = 0x1;
    /**
     * Data is added.
     */
    public static final byte DATA = 0x2;
}