package gurux.dlms.objects;

import gurux.dlms.objects.enums.ApplicationContextName;

public class GXApplicationContextName {
    private int jointIsoCtt;
    private int country;
    private int countryName;
    private int identifiedOrganization;
    private int dlmsUA;
    private int applicationContext;
    private ApplicationContextName contextId;

    /**
     * Constructor.
     */
    public GXApplicationContextName() {
        jointIsoCtt = 2;
        country = 16;
        countryName = 756;
        identifiedOrganization = 5;
        dlmsUA = 8;
        applicationContext = 1;
        contextId = ApplicationContextName.LOGICAL_NAME;
    }

    public final int getJointIsoCtt() {
        return jointIsoCtt;
    }

    public final void setJointIsoCtt(final int value) {
        jointIsoCtt = value;
    }

    public final int getCountry() {
        return country;
    }

    public final void setCountry(final int value) {
        country = value;
    }

    public final int getCountryName() {
        return countryName;
    }

    public final void setCountryName(final int value) {
        countryName = value;
    }

    public final int getIdentifiedOrganization() {
        return identifiedOrganization;
    }

    public final void setIdentifiedOrganization(final int value) {
        identifiedOrganization = value;
    }

    public final int getDlmsUA() {
        return dlmsUA;
    }

    public final void setDlmsUA(final int value) {
        dlmsUA = value;
    }

    public final int getApplicationContext() {
        return applicationContext;
    }

    public final void setApplicationContext(final int value) {
        applicationContext = value;
    }

    public final ApplicationContextName getContextId() {
        return contextId;
    }

    public final void setContextId(final ApplicationContextName value) {
        contextId = value;
    }

    @Override
    public final String toString() {
        return String.valueOf(jointIsoCtt) + " " + String.valueOf(country) + " "
                + String.valueOf(countryName) + " "
                + String.valueOf(identifiedOrganization) + " "
                + String.valueOf(dlmsUA) + " "
                + String.valueOf(applicationContext) + " "
                + String.valueOf(contextId);
    }
}