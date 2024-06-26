package gurux.dlms.objects.enums;

public enum ClockBase {
    /**
     * Not defined
     */
    NONE,

    /**
     * Internal Crystal
     */
    CRYSTAL,

    /**
     * Mains frequency 50 Hz,
     */
    FREQUENCY50,

    /**
     * Mains frequency 60 Hz,
     */
    FREQUENCY60,

    /**
     * Global Positioning System.
     */
    GPS,

    /**
     * Radio controlled.
     */
    RADIO
}