package gurux.dlms;

import java.util.Date;
import java.util.Locale;

import gurux.dlms.enums.DateTimeSkips;

public class GXTime extends GXDateTime {
    /**
     * Constructor.
     */
    public GXTime() {
        super();
        getSkip().add(DateTimeSkips.YEAR);
        getSkip().add(DateTimeSkips.MONTH);
        getSkip().add(DateTimeSkips.DAY);
        getSkip().add(DateTimeSkips.DAY_OF_WEEK);
    }

    /**
     * Constructor.
     * 
     * @param forvalue
     *            Date value.
     */
    public GXTime(final Date forvalue) {
        super(forvalue);
        getSkip().add(DateTimeSkips.YEAR);
        getSkip().add(DateTimeSkips.MONTH);
        getSkip().add(DateTimeSkips.DAY);
        getSkip().add(DateTimeSkips.DAY_OF_WEEK);
    }

    /**
     * Constructor.
     * 
     * @param forvalue
     *            Date value.
     */
    public GXTime(final GXDateTime forvalue) {
        super(forvalue.getLocalCalendar());
        getSkip().addAll(forvalue.getSkip());
        getSkip().add(DateTimeSkips.YEAR);
        getSkip().add(DateTimeSkips.MONTH);
        getSkip().add(DateTimeSkips.DAY);
        getSkip().add(DateTimeSkips.DAY_OF_WEEK);
        getExtra().addAll(forvalue.getExtra());
    }

    /**
     * Constructor.
     * 
     * @param hour
     *            Used hour.
     * @param minute
     *            Used minute.
     * @param second
     *            Used second.
     * @param millisecond
     *            Used millisecond.
     */
    public GXTime(final int hour, final int minute, final int second,
            final int millisecond) {
        super(-1, -1, -1, hour, minute, second, millisecond);
    }

    /**
     * Constructor
     * 
     * @param value
     *            Date time value as a string.
     */
    public GXTime(final String value) {
        this(value, null);
    }

    /**
     * Constructor
     * 
     * @param value
     *            Date time value as a string.
     * @param locale
     *            Used locale.
     */
    public GXTime(final String value, final Locale locale) {
        super(value, locale);
        getSkip().add(DateTimeSkips.YEAR);
        getSkip().add(DateTimeSkips.MONTH);
        getSkip().add(DateTimeSkips.DAY);
        getSkip().add(DateTimeSkips.DAY_OF_WEEK);
    }
}