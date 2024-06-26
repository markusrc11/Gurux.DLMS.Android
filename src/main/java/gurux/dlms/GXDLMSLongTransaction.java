package gurux.dlms;

/**
 * Long get or set information is saved here.
 */
class GXDLMSLongTransaction {
    /**
     * Executed command.
     */
    private int command;

    /**
     * Targets.
     */
    private ValueEventArgs[] targets;

    /**
     * Extra data from PDU.
     */
    private GXByteBuffer data;

    /**
     * Constructor.
     * 
     * @param forTargets
     *            Targets.
     * @param forCommand
     *            Command.
     * @param forData
     *            Data.
     */
    public GXDLMSLongTransaction(final ValueEventArgs[] forTargets,
            final int forCommand, final GXByteBuffer forData) {
        targets = forTargets;
        command = forCommand;
        data = new GXByteBuffer();
        data.set(forData);
    }

    /**
     * @return Executed command.
     */
    public final int getCommand() {
        return command;
    }

    /**
     * @return Targets.
     */
    public final ValueEventArgs[] getTargets() {
        return targets;
    }

    /**
     * @return data.
     */
    public final GXByteBuffer getData() {
        return data;
    }

    /**
     * @param value
     *            New data.
     */
    public final void setData(final GXByteBuffer value) {
        data.clear();
        data.set(value);
    }
}
