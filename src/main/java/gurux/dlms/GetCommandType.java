
package gurux.dlms;

/**
 * Enumerates Get request and response types.
 */
final class GetCommandType {

    /*
     * Constructor.
     */
    private GetCommandType() {

    }

    /**
     * Normal Get.
     */
    static final byte NORMAL = 1;
    /**
     * Next data block.
     */
    static final byte NEXT_DATA_BLOCK = 2;
    /**
     * Get request with list.
     */
    static final byte WITH_LIST = 3;
}
