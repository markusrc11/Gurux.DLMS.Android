package gurux.dlms.objects;

/**
 * Activity Calendar's Day profile is defined on the standard.
 */
public class GXDLMSDayProfile {
    private int dayId;
    private GXDLMSDayProfileAction[] daySchedules;

    /**
     * Constructor.
     */
    public GXDLMSDayProfile() {
    }

    /**
     * Constructor.
     * 
     * @param day
     *            Integer value of the day.
     * @param schedules
     *            Collection of schedules.
     */
    public GXDLMSDayProfile(final int day,
            final GXDLMSDayProfileAction[] schedules) {
        setDayId(day);
        setDaySchedules(schedules);
    }

    /**
     * @return User defined identifier, identifying the current day_profile.
     */
    public final int getDayId() {
        return dayId;
    }

    /**
     * @param value
     *            User defined identifier, identifying the current day_profile.
     */
    public final void setDayId(final int value) {
        dayId = value;
    }

    public final GXDLMSDayProfileAction[] getDaySchedules() {
        return daySchedules;
    }

    public final void setDaySchedules(final GXDLMSDayProfileAction[] value) {
        daySchedules = value;
    }

    @Override
    public final String toString() {
        String str = String.valueOf(dayId);
        for (GXDLMSDayProfileAction it : daySchedules) {
            str += " " + it.toString();
        }
        return str;
    }
}