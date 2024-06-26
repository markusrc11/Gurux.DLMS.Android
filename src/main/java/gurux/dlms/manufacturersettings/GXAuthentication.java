package gurux.dlms.manufacturersettings;

import java.io.UnsupportedEncodingException;

import gurux.dlms.enums.Authentication;

/**
 * Authentication class is used to give authentication information to the
 * server.
 */
public class GXAuthentication {
    private int clientAddress;
    private Authentication type = Authentication.LOW;
    private byte[] password;
    private String name;

    public GXAuthentication() {
    }

    public GXAuthentication(final String value) {
        name = value;
    }

    @Override
    public final String toString()
    {
        if (name == null || name == "")
        {
            return getType().toString();
        }
        return name;
    }

    /**
     * Constructor.
     * 
     * @param forType
     *            Authentication type
     * @param forClientAddress
     *            Client Id.
     */
    public GXAuthentication(final Authentication forType,
            final int forClientAddress) {
        this(forType, (byte[]) null, forClientAddress);
    }

    /**
     * Constructor.
     * 
     * @param forType
     *            Authentication type
     * @param pw
     *            Used password.
     * @param forClientAddress
     *            Client Id.
     */
    public GXAuthentication(final Authentication forType, final byte[] pw,
            final int forClientAddress) {
        setType(forType);
        setPassword(pw);
        setClientAddress(forClientAddress);
    }

    /**
     * Constructor.
     * 
     * @param forType
     *            Authentication type
     * @param pw
     *            Used password.
     * @param forClientAddress
     *            Client Id.
     */
    public GXAuthentication(final Authentication forType, final String pw,
            final int forClientAddress) {
        setType(forType);
        try {
            setPassword(pw.getBytes("ASCII"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e.getMessage());
        }
        setClientAddress(forClientAddress);
    }

    /**
     * @return Authentication type.
     */
    public final Authentication getType() {
        return type;
    }

    /**
     * @param value
     *            Authentication type.
     */
    public final void setType(final Authentication value) {
        type = value;
    }

    /**
     * @return Client address.
     */
    public final int getClientAddress() {
        return clientAddress;
    }

    /**
     * @param value
     *            Client address.
     */
    public final void setClientAddress(final int value)
    {
        clientAddress = value;
    }

    /**
     * @return Used password.
     */
    public final byte[] getPassword()
    {
        return password;
    }

    /**
     * @param value
     *            Used password.
     */
    public final void setPassword(final byte[] value)
    {
        password = value;
    }

    /**
     * @return Authentication name.
     */
    public String getName() {
        return name;
    }

    /**
     * @param value
     *            Authentication name.
     */
    public void setName(final String value) {
        name = value;
    }
}