package gurux.dlms.objects;

import java.util.HashSet;
import java.util.Set;

import gurux.dlms.objects.enums.CreditCollectionConfiguration;

/**
 * Online help:<br>
 * https://www.gurux.fi/Gurux.DLMS.Objects.GXDLMSAccount
 */
public class GXCreditChargeConfiguration {

    /**
     * Credit reference.<br>
     * Online help:<br>
     * https://www.gurux.fi/Gurux.DLMS.Objects.GXDLMSAccount
     */
    private String creditReference;

    /**
     * Charge reference.<br>
     * Online help:<br>
     * https://www.gurux.fi/Gurux.DLMS.Objects.GXDLMSAccount
     */
    private String chargeReference;

    /**
     * Collection configuration.<br>
     * Online help:<br>
     * https://www.gurux.fi/Gurux.DLMS.Objects.GXDLMSAccount
     */
    private Set<CreditCollectionConfiguration> collectionConfiguration;

    /**
     * Constructor.
     */
    public GXCreditChargeConfiguration() {
        collectionConfiguration = new HashSet<CreditCollectionConfiguration>();
    }

    /**
     * Online help:<br>
     * https://www.gurux.fi/Gurux.DLMS.Objects.GXDLMSAccount
     * 
     * @return Credit reference.
     */
    public final String getCreditReference() {
        return creditReference;
    }

    /**
     * Online help:<br>
     * https://www.gurux.fi/Gurux.DLMS.Objects.GXDLMSAccount
     * 
     * @param value
     *            Credit reference.
     */
    public final void setCreditReference(final String value) {
        creditReference = value;
    }

    /**
     * Online help:<br>
     * https://www.gurux.fi/Gurux.DLMS.Objects.GXDLMSAccount
     * 
     * @return Charge reference.
     */
    public final String getChargeReference() {
        return chargeReference;
    }

    /**
     * Online help:<br>
     * https://www.gurux.fi/Gurux.DLMS.Objects.GXDLMSAccount
     * 
     * @param value
     *            Charge reference.
     */
    public final void setChargeReference(final String value) {
        chargeReference = value;
    }

    /**
     * Online help:<br>
     * https://www.gurux.fi/Gurux.DLMS.Objects.GXDLMSAccount
     * 
     * @return Collection configuration.
     */
    public final Set<CreditCollectionConfiguration>
            getCollectionConfiguration() {
        return collectionConfiguration;
    }

    /**
     * Online help:<br>
     * https://www.gurux.fi/Gurux.DLMS.Objects.GXDLMSAccount
     * 
     * @param value
     *            Collection configuration.
     */
    public final void setCollectionConfiguration(
            final Set<CreditCollectionConfiguration> value) {
        if (value == null) {
            throw new IllegalArgumentException("CollectionConfiguration");
        }
        collectionConfiguration = value;
    }

    /**
     * Converts the enumerated value to integer value.
     * 
     * @param value
     *            The enumerated value.
     * @return The integer value.
     */
    public static int
            toInteger(final Set<CreditCollectionConfiguration> value) {
        if (value == null) {
            return 0;
        }
        int tmp = 0;
        for (CreditCollectionConfiguration it : value) {
            tmp |= it.getValue();
        }
        return tmp;
    }
}