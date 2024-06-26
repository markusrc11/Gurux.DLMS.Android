package gurux.dlms;

/**
 * GXDLMSGateway contains information that is needed if gateway is used between
 * the client and the meter.
 */
public class GXDLMSGateway {
    /**
     * Gateway network ID.
     */
    private short networkId;

    /**
     * Physical device address.
     */
    private byte[] physicalDeviceAddress;

    /**
     * Constructor.
     */
    public GXDLMSGateway() {
    }

    /**
     * @return Gateway network ID.
     */
    public final short getNetworkId() {
        return networkId;
    }

    /**
     * @param value
     *            Gateway network ID.
     */
    public final void setNetworkId(final short value) {
        networkId = value;
    }

    /**
     * @return Physical device address.
     */
    public final byte[] getPhysicalDeviceAddress() {
        return physicalDeviceAddress;
    }

    /**
     * @param value
     *            Physical device address.
     */
    public final void setPhysicalDeviceAddress(final byte[] value) {
        physicalDeviceAddress = value;
    }
}