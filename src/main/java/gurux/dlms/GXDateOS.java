package gurux.dlms;

import java.util.Date;
import java.util.Locale;

/**
 * GXDateOS is used to write date as a octet string.
 */
public class GXDateOS extends GXDate {
    /**
     * Constructor.
     */
    public GXDateOS() {
        super();
    }

    /**
     * Constructor.
     * 
     * @param forvalue
     *            Date value.
     */
    public GXDateOS(final Date forvalue) {
        super(forvalue);
    }

    /**
     * Constructor.
     * 
     * @param value
     *            Date value.
     */
    public GXDateOS(final GXDateTime value) {
        super(value);
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
    public GXDateOS(final int year, final int month, final int day) {
        super(year, month, day);
    }

    /**
     * Constructor
     * 
     * @param value
     *            Date time value as a string.
     */
    public GXDateOS(final String value) {
        super(value, null);
    }

    /**
     * Constructor
     * 
     * @param value
     *            Date time value as a string.
     * @param locale
     *            Used locale.
     */
    public GXDateOS(final String value, final Locale locale) {
        super(value, locale);
    }
}