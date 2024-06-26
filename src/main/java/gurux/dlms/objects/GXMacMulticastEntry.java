package gurux.dlms.objects;

public class GXMacMulticastEntry {
    /**
     * LCID of multicast group
     */
    private byte id;
    /**
     * Number of child nodes.
     */
    private short members;

    /**
     * @return LCID of multicast group
     */
    public final byte getId() {
        return id;
    }

    /**
     * @param value
     *            LCID of multicast group
     */
    public final void setId(final byte value) {
        id = value;
    }

    /**
     * @return Number of child nodes.
     */
    public final short getMembers() {
        return members;
    }

    /**
     * @param value
     *            Number of child nodes.
     */
    public final void setMembers(final short value) {
        members = value;
    }
}