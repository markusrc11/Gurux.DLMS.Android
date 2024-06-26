package gurux.dlms.objects;

/**
 * XML write settings.
 */
public class GXXmlWriterSettings {
    /**
     * Are attribute values also serialized.
     */
    private boolean values;

    /**
     * Are values saved in old way.
     */
    private boolean old;

    /**
     * Are default values serialized.
     */
    private boolean ignoreDefaultValues;

    /**
     * GXDateTime values are serialised using meter time, not local time.
     */
    private boolean useMeterTime;

    /**
     * Constructor.
     */
    public GXXmlWriterSettings() {
        values = true;
        ignoreDefaultValues = true;
    }

    /**
     * @return Are attribute values also serialized.
     */
    public final boolean getValues() {
        return values;
    }

    /**
     * @param value
     *            Are attribute values also serialized.
     */
    public final void setValues(final boolean value) {
        values = value;
    }

    /**
     * @return Are values saved in old way.
     */
    public final boolean getOld() {
        return old;
    }

    /**
     * @param value
     *            Are Are values saved in old way.
     */
    public final void setOld(final boolean value) {
        old = value;
    }

    /**
     * @return Are default values serialized.
     */
    public boolean isIgnoreDefaultValues() {
        return ignoreDefaultValues;
    }

    /**
     * @param value
     *            Are default values serialized.
     */
    public void setIgnoreDefaultValues(final boolean value) {
        ignoreDefaultValues = value;
    }

    /**
     * @return GXDateTime values are serialised using meter time, not local
     *         time.
     */
    public boolean isUseMeterTime() {
        return useMeterTime;
    }

    /**
     * @param value
     *            GXDateTime values are serialised using meter time, not local
     *            time.
     */
    public void setUseMeterTime(final boolean value) {
        useMeterTime = value;
    }
}
