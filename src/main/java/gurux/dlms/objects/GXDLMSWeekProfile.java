package gurux.dlms.objects;

import gurux.dlms.internal.GXCommon;

public class GXDLMSWeekProfile {
    private byte[] name;
    private int monday;
    private int tuesday;
    private int wednesday;
    private int thursday;
    private int friday;
    private int saturday;
    private int sunday;

    /**
     * Constructor.
     */
    public GXDLMSWeekProfile() {
    }

    public final byte[] getName() {
        return name;
    }

    public final void setName(final String value) {
        if (value == null) {
            name = null;
        } else {
            name = value.getBytes();
        }
    }

    public final void setName(final byte[] value) {
        name = value;
    }

    public final int getMonday() {
        return monday;
    }

    public final void setMonday(final int value) {
        monday = value;
    }

    public final int getTuesday() {
        return tuesday;
    }

    public final void setTuesday(final int value) {
        tuesday = value;
    }

    public final int getWednesday() {
        return wednesday;
    }

    public final void setWednesday(final int value) {
        wednesday = value;
    }

    public final int getThursday() {
        return thursday;
    }

    public final void setThursday(final int value) {
        thursday = value;
    }

    public final int getFriday() {
        return friday;
    }

    public final void setFriday(final int value) {
        friday = value;
    }

    public final int getSaturday() {
        return saturday;
    }

    public final void setSaturday(final int value) {
        saturday = value;
    }

    public final int getSunday() {
        return sunday;
    }

    public final void setSunday(final int value) {
        sunday = value;
    }

    @Override
    public final String toString() {
        if (name == null) {
            return null;
        }
        return GXCommon.toHex(name);
    }
}
