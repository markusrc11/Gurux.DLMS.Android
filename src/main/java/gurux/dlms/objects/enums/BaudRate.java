package gurux.dlms.objects.enums;

/**
 * Defines the baud rates.
 */
public enum BaudRate {
    /**
     * Baudrate is 300.
     */
    BAUDRATE_300,

    /**
     * Baudrate is 600.
     */
    BAUDRATE_600,

    /**
     * Baudrate is 1200.
     */
    BAUDRATE_1200,

    /**
     * Baudrate is 2400.
     */
    BAUDRATE_2400,

    /**
     * Baudrate is 4800.
     */
    BAUDRATE_4800, /**
                    * Baudrate is 9600.
                    */
    BAUDRATE_9600,

    /**
     * Baudrate is 19200.
     */
    BAUDRATE_19200,

    /**
     * Baudrate is 38400.
     */
    BAUDRATE_38400,

    /**
     * Baudrate is 57600.
     */
    BAUDRATE_57600,

    /**
     * Baudrate is 115200.
     */
    BAUDRATE_115200;

    @Override
    public String toString() {
        String str;
        switch (this.ordinal()) {
        case 0: // BAUDRATE_300
            str = "Baudrate300";
            break;
        case 1: // BAUDRATE_600
            str = "Baudrate600";
            break;
        case 2: // BAUDRATE_1200
            str = "Baudrate1200";
            break;
        case 3: // BAUDRATE_2400
            str = "Baudrate2400";
            break;
        case 4: // BAUDRATE_4800
            str = "Baudrate4800";
            break;
        case 5: // BAUDRATE_9600
            str = "Baudrate9600";
            break;
        case 6: // BAUDRATE_19200
            str = "Baudrate19200";
            break;
        case 7: // BAUDRATE_38400
            str = "Baudrate38400";
            break;
        case 8: // BAUDRATE_57600
            str = "Baudrate57600";
            break;
        case 9: // BAUDRATE_115200
            str = "Baudrate115200";
            break;
        default:
            str = "Unknown";
        }
        return str;
    }
}
