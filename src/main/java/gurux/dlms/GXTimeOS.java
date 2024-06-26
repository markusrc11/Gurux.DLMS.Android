package gurux.dlms;

import java.util.Date;
import java.util.Locale;

/**
 * GXTimeOS is used to write time as a octet string.
 */
public class GXTimeOS extends GXTime {
    /**
     * Constructor.
     */
    public GXTimeOS() {
        super();
    }

    /**
     * Constructor.
     * 
     * @param forvalue
     *            Date value.
     */
    public GXTimeOS(final Date forvalue) {
        super(forvalue);
    }

    /**
     * Constructor.
     * 
     * @param forvalue
     *            Date value.
     */
    public GXTimeOS(final GXDateTime forvalue) {
        super(forvalue);
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
    public GXTimeOS(final int hour, final int minute, final int second,
            final int millisecond) {
        super(hour, minute, second, millisecond);
    }

    /**
     * Constructor
     * 
     * @param value
     *            Date time value as a string.
     */
    public GXTimeOS(final String value) {
        super(value);
    }

    /**
     * Constructor
     * 
     * @param value
     *            Date time value as a string.
     * @param locale
     *            Used locale.
     */
    public GXTimeOS(final String value, final Locale locale) {
        super(value, locale);
    }
}