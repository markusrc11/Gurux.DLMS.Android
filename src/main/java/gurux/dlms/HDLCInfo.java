package gurux.dlms;

/**
 * Reserved for internal use.
 */
final class HDLCInfo {

    /**
     * Constructor.
     */
    private HDLCInfo() {

    }

    static final byte MAX_INFO_TX = 0x5;
    static final byte MAX_INFO_RX = 0x6;
    static final byte WINDOW_SIZE_TX = 0x7;
    static final byte WINDOW_SIZE_RX = 0x8;
}