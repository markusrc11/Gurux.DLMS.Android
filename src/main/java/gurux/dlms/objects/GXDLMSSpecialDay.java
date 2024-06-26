package gurux.dlms.objects;

import gurux.dlms.GXDate;

public class GXDLMSSpecialDay {
    private int index;
    private GXDate date;
    private int dayId;

    public final int getIndex() {
        return index;
    }

    public final void setIndex(final int value) {
        index = value;
    }

    public final GXDate getDate() {
        return date;
    }

    public final void setDate(final GXDate value) {
        date = value;
    }

    public final int getDayId() {
        return dayId;
    }

    public final void setDayId(final int value) {
        dayId = value;
    }
}