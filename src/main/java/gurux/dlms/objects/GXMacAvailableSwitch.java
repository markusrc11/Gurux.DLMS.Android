package gurux.dlms.objects;

/**
 * MAC available switch.
 */
public class GXMacAvailableSwitch {
    /**
     * EUI-48 of the subnetwork.
     */
    private byte[] sna;

    /**
     * SID of this switch.
     */
    private short lsId;

    /**
     * Level of this switch in subnetwork hierarchy.
     */
    private byte level;

    /**
     * The received signal level for this switch.
     */
    private byte rxLevel;
    /**
     * The signal to noise ratio for this switch.
     */
    private byte rxSnr;

    /**
     * @return EUI-48 of the subnetwork.
     */
    public final byte[] getSna() {
        return sna;
    }

    /**
     * @param value
     *            EUI-48 of the subnetwork.
     */
    public final void setSna(final byte[] value) {
        sna = value;
    }

    /**
     * @return SID of this switch.
     */
    public final short getLsId() {
        return lsId;
    }

    /**
     * @param value
     *            SID of this switch.
     */
    public final void setLsId(short value) {
        lsId = value;
    }

    /**
     * @return Level of this switch in subnetwork hierarchy.
     */
    public final byte getLevel() {
        return level;
    }

    /**
     * @param value
     *            Level of this switch in subnetwork hierarchy.
     */
    public final void setLevel(final byte value) {
        level = value;
    }

    /**
     * @return The received signal level for this switch;
     */
    public final byte getRxLevel() {
        return rxLevel;
    }

    /**
     * @param value
     *            The received signal level for this switch;
     */
    public final void setRxLevel(final byte value) {
        rxLevel = value;
    }

    /**
     * @return The signal to noise ratio for this switch.
     */
    public final byte getRxSnr() {
        return rxSnr;
    }

    /**
     * @param value
     *            The signal to noise ratio for this switch.
     */
    public final void setRxSnr(final byte value) {
        rxSnr = value;
    }

}