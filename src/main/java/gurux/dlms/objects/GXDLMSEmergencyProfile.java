package gurux.dlms.objects;

import gurux.dlms.GXDateTime;

public class GXDLMSEmergencyProfile {
    private int id;
    private GXDateTime activationTime;
    private long duration;

    public final int getID() {
        return id;
    }

    public final void setID(final int value) {
        id = value;
    }

    public final GXDateTime getActivationTime() {
        return activationTime;
    }

    public final void setActivationTime(final GXDateTime value) {
        activationTime = value;
    }

    public final long getDuration() {
        return duration;
    }

    public final void setDuration(final long value) {
        duration = value;
    }

    @Override
    public final String toString() {
        return String.valueOf(id) + " " + String.valueOf(activationTime) + " "
                + String.valueOf(duration);
    }
}