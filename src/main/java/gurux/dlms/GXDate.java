package gurux.dlms;

import java.util.Date;
import java.util.Locale;

import gurux.dlms.enums.DateTimeSkips;

public class GXDate extends GXDateTime {
    /**
     * Constructor.
     */
    public GXDate() {
        super();
        getSkip().add(DateTimeSkips.HOUR);
        getSkip().add(DateTimeSkips.MINUTE);
        getSkip().add(DateTimeSkips.SECOND);
        getSkip().add(DateTimeSkips.MILLISECOND);
    }

    /**
     * Constructor.
     * 
     * @param forvalue
     *            Date value.
     */
    public GXDate(final Date forvalue) {
        super(forvalue);
        getSkip().add(DateTimeSkips.HOUR);
        getSkip().add(DateTimeSkips.MINUTE);
        getSkip().add(DateTimeSkips.SECOND);
        getSkip().add(DateTimeSkips.MILLISECOND);
    }

    /**
     * Constructor.
     * 
     * @param forvalue
     *            Date value.
     */
    public GXDate(final GXDateTime forvalue) {
        super(forvalue.getLocalCalendar());
        getSkip().addAll(forvalue.getSkip());
        getSkip().add(DateTimeSkips.HOUR);
        getSkip().add(DateTimeSkips.MINUTE);
        getSkip().add(DateTimeSkips.SECOND);
        getSkip().add(DateTimeSkips.MILLISECOND);
        getExtra().addAll(forvalue.getExtra());
    }

    /**
     * Constructor.
     * 
     * @param year
     *            Used year.
     * @param month
     *            Used month.
     * @param day
     *            Used day.
     */
    public GXDate(final int year, final int month, final int day) {
        super(year, month, day, -1, -1, -1, -1);
    }

    /**
     * Constructor
     * 
     * @param value
     *            Date time value as a string.
     */
    public GXDate(final String value) {
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
    public GXDate(final String value, final Locale locale) {
        super(value, locale);
        getSkip().add(DateTimeSkips.HOUR);
        getSkip().add(DateTimeSkips.MINUTE);
        getSkip().add(DateTimeSkips.SECOND);
        getSkip().add(DateTimeSkips.MILLISECOND);
    }
}