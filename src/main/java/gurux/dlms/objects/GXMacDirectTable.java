package gurux.dlms.objects;

/**
 * MAC direct table element.
 */
public class GXMacDirectTable {
    /**
     * SID of switch through which the source service node is connected.
     */
    private short sourceSId;

    /**
     * NID allocated to the source service node.
     */
    private short sourceLnId;
    /**
     * LCID allocated to this connection at the source.
     */
    private short sourceLcId;

    /**
     * SID of the switch through which the destination service node is
     * connected.
     */
    private short destinationSId;
    /**
     * NID allocated to the destination service node.
     */
    private short destinationLnId;

    /**
     * LCID allocated to this connection at the destination.
     */
    private short destinationLcId;
    /**
     * Entry DID is the EUI-48 of the direct switch.
     */
    private byte[] did;

    /**
     * @return SID of switch through which the source service node is connected.
     */
    public final short getSourceSId() {
        return sourceSId;
    }

    /**
     * @param value
     *            SID of switch through which the source service node is
     *            connected.
     */
    public final void setSourceSId(final short value) {
        sourceSId = value;
    }

    /**
     * @return NID allocated to the source service node.
     */
    public final short getSourceLnId() {
        return sourceLnId;
    }

    /**
     * @param value
     *            NID allocated to the source service node.
     */
    public final void setSourceLnId(final short value) {
        sourceLnId = value;
    }

    /**
     * @return LCID allocated to this connection at the source.
     */
    public final short getSourceLcId() {
        return sourceLcId;
    }

    /**
     * @param value
     *            LCID allocated to this connection at the source.
     */
    public final void setSourceLcId(final short value) {
        sourceLcId = value;
    }

    /**
     * @return SID of the switch through which the destination service node is
     *         connected.
     */
    public final short getDestinationSId() {
        return destinationSId;
    }

    /**
     * @param value
     *            SID of the switch through which the destination service node
     *            is connected.
     */
    public final void setDestinationSId(final short value) {
        destinationSId = value;
    }

    /**
     * @return NID allocated to the destination service node.
     */
    public final short getDestinationLnId() {
        return destinationLnId;
    }

    /**
     * @param value
     *            NID allocated to the destination service node.
     */
    public final void setDestinationLnId(final short value) {
        destinationLnId = value;
    }

    /**
     * @return LCID allocated to this connection at the destination.
     */
    public final short getDestinationLcId() {
        return destinationLcId;
    }

    /**
     * @param value
     *            LCID allocated to this connection at the destination.
     */
    public final void setDestinationLcId(final short value) {
        destinationLcId = value;
    }

    /**
     * @return Entry DID is the EUI-48 of the direct switch.
     */
    public final byte[] getDid() {
        return did;
    }

    /**
     * @param value
     *            Entry DID is the EUI-48 of the direct switch.
     */
    public final void setDid(final byte[] value) {
        did = value;
    }

}