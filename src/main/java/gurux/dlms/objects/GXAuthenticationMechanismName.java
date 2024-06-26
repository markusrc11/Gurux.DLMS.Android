package gurux.dlms.objects;

import gurux.dlms.enums.Authentication;

public class GXAuthenticationMechanismName {
    private int jointIsoCtt;
    private int country;
    private int countryName;
    private int identifiedOrganization;
    private int dlmsUA;
    private int authenticationMechanismName;
    private Authentication mechanismId;

    /*
     * Constructor.
     */
    public GXAuthenticationMechanismName() {
        mechanismId = Authentication.NONE;
        jointIsoCtt = 2;
        country = 16;
        countryName = 756;
        identifiedOrganization = 5;
        dlmsUA = 8;
        authenticationMechanismName = 2;
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

    public final int getAuthenticationMechanismName() {
        return authenticationMechanismName;
    }

    public final void setAuthenticationMechanismName(final int value) {
        authenticationMechanismName = value;
    }

    public final Authentication getMechanismId() {
        return mechanismId;
    }

    public final void setMechanismId(final Authentication value) {
        mechanismId = value;
    }

    @Override
    public final String toString() {
        return String.valueOf(jointIsoCtt) + " " + String.valueOf(country) + " "
                + String.valueOf(countryName) + " "
                + String.valueOf(identifiedOrganization) + " "
                + String.valueOf(dlmsUA) + " "
                + String.valueOf(authenticationMechanismName) + " "
                + String.valueOf(mechanismId);
    }
}