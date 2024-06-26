package gurux.dlms.objects.enums;

/**
 * Association Status tells is association (connection) made to Association
 * object.
 */
public enum AssociationStatus {
    /**
     * Association is not made.
     */
    NON_ASSOCIATED,
    /**
     * Association is pending.
     */
    ASSOCIATION_PENDING,
    /**
     * Association is made.
     */
    ASSOCIATED
}