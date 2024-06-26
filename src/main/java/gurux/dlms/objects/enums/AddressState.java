package gurux.dlms.objects.enums;

/*
 * Defines whether or not the device has been assigned an address 
 * since last power up of the device.
 */
public enum AddressState {
    /*
     * Not assigned an address yet-
     */
    NONE,
    /*
     * Assigned an address either by manual setting, or by automated method.
     */
    ASSIGNED
}
