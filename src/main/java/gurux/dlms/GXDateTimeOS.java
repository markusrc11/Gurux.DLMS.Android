package gurux.dlms;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * GXDateTimeOS is used to write date time as a octet string.
 */
public class GXDateTimeOS extends GXDateTime {

    /**
     * Constructor
     */
    public GXDateTimeOS() {
        super();
    }

    /**
     * Constructor
     * 
     * @param value
     *            Date value.
     */
    public GXDateTimeOS(final GXDateTime value) {
        super(value);
    }

    /**
     * Constructor.
     * 
     * @param value
     *            Date value.
     */
    public GXDateTimeOS(final Date value) {
        super(value);
    }

    /**
     * Constructor.
     * 
     * @param value
     *            Date value.
     */
    public GXDateTimeOS(final Calendar value) {
        super(value);
    }

    /**
     * Constructor.
     * 
     * @param value
     *            Date time value as a string.
     */
    public GXDateTimeOS(final String value) {
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
    public GXDateTimeOS(final String value, final Locale locale) {
        super(value, locale);
    }
}