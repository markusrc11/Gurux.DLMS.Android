package gurux.dlms;

import java.security.KeyPair;
import java.security.PublicKey;
import java.util.List;
import java.util.Map;

import gurux.dlms.asn.GXx509CertificateCollection;
import gurux.dlms.enums.Security;
import gurux.dlms.objects.enums.CertificateType;
import gurux.dlms.objects.enums.SecuritySuite;

public interface GXICipher {

    /**
     * Reset encrypt settings.
     */
    void reset();

    /**
     * @return Is ciphering used.
     */
    boolean isCiphered();

    /**
     * @return Used security.
     */
    Security getSecurity();

    /**
     * @param value
     *            Used security.
     */
    void setSecurity(Security value);

    /**
     * @return Used security suite.
     */
    SecuritySuite getSecuritySuite();

    /**
     * @param value
     *            Used security suite.
     */
    void setSecuritySuite(final SecuritySuite value);

    /**
     * @return System title.
     */
    byte[] getSystemTitle();

    /**
     * @return Recipient system Title.
     */
    byte[] getRecipientSystemTitle();

    /**
     * @param value
     *            Block cipher key.
     */
    void setBlockCipherKey(byte[] value);

    /**
     * @return Block cipher key.
     */
    byte[] getBlockCipherKey();

    /**
     * @return Authentication key.
     */
    byte[] getAuthenticationKey();

    /**
     * @param value
     *            Authentication key.
     */
    void setAuthenticationKey(byte[] value);

    /**
     * @return Invocation counter.
     */
    long getInvocationCounter();

    /**
     * @param value
     *            Invocation counter.
     */
    void setInvocationCounter(long value);

    /**
     * @return Ephemeral key pair.
     */
    KeyPair getEphemeralKeyPair();

    /**
     * @param value
     *            Ephemeral key pair.
     */
    void setEphemeralKeyPair(KeyPair value);

    /**
     * @return Client's key agreement key pair.
     */
    KeyPair getKeyAgreementKeyPair();

    /**
     * @param value
     *            Client's key agreement key pair.
     */
    void setKeyAgreementKeyPair(KeyPair value);

    /**
     * @return Target (Server or client) Public key.
     */
    List<Map.Entry<CertificateType, PublicKey>> getPublicKeys();

    /**
     * @return Available certificates.
     */
    GXx509CertificateCollection getCertificates();

    /**
     * @return Signing key pair.
     */
    KeyPair getSigningKeyPair();

    /**
     * @param value
     *            Signing key pair.
     */
    void setSigningKeyPair(KeyPair value);

    /**
     * @return Shared secret is generated when connection is made.
     */
    byte[] getSharedSecret();

    /**
     * @param value
     *            Shared secret is generated when connection is made.
     */
    void setSharedSecret(byte[] value);

    /**
     * @return Dedicated key.
     */
    byte[] getDedicatedKey();

    /**
     * @param value
     *            Dedicated key.
     */
    void setDedicatedKey(byte[] value);
}
