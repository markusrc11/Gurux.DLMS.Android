package gurux.dlms.secure;

import java.security.KeyPair;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import gurux.dlms.GXByteBuffer;
import gurux.dlms.GXICipher;
import gurux.dlms.asn.GXx509CertificateCollection;
import gurux.dlms.enums.Security;
import gurux.dlms.objects.enums.CertificateType;
import gurux.dlms.objects.enums.SecuritySuite;

/**
 * Gurux DLMS/COSEM Transport security (Ciphering) settings.
 */
public class GXCiphering implements GXICipher {
    private Security security = Security.NONE;
    private byte[] authenticationKey;
    /**
     * Dedicated key.
     */
    private byte[] dedicatedKey;

    /**
     * Certificates.
     */
    private GXx509CertificateCollection certificates;

    /**
     * Ephemeral key pair.
     */
    private KeyPair ephemeralKeyPair;

    /**
     * System title.
     */
    private byte[] systemTitle;

    /**
     * recipient system title.
     */
    private byte[] recipientSystemTitle;

    /**
     * Block cipher key.
     */
    private byte[] blockCipherKey;
    /**
     * Invocation Counter.
     */
    private long invocationCounter = 0;

    /**
     * Used security suite.
     */
    private SecuritySuite securitySuite = SecuritySuite.AES_GCM_128;

    /**
     * Signing key pair.
     */
    private KeyPair signingKeyPair;

    /**
     * Client key agreement key pair.
     */
    private KeyPair keyAgreementKeyPair;

    /**
     * Target (Server or client) Public key.
     */
    private List<Map.Entry<CertificateType, PublicKey>> publicKeys;

    /**
     * Shared secret is generated when connection is made.
     */
    private byte[] sharedSecret;

    /**
     * Constructor. Default values are from the Green Book.
     * 
     * @param title
     *            Used system title.
     */
    public GXCiphering(final byte[] title) {
        publicKeys = new ArrayList<Map.Entry<CertificateType, PublicKey>>();
        certificates = new GXx509CertificateCollection();
        setSecurity(Security.NONE);
        setSystemTitle(title);
        setBlockCipherKey(new byte[] { 0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06,
                0x07, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, 0x0E, 0x0F });
        setAuthenticationKey(new byte[] { (byte) 0xD0, (byte) 0xD1, (byte) 0xD2,
                (byte) 0xD3, (byte) 0xD4, (byte) 0xD5, (byte) 0xD6, (byte) 0xD7,
                (byte) 0xD8, (byte) 0xD9, (byte) 0xDA, (byte) 0xDB, (byte) 0xDC,
                (byte) 0xDD, (byte) 0xDE, (byte) 0xDF });
    }

    public static byte[] decrypt(final GXICipher c, final AesGcmParameter p,
            final GXByteBuffer data) {
        byte[] tmp;
        p.setSharedSecret(c.getSharedSecret());
        tmp = GXDLMSChippering.decryptAesGcm(c, p, data);
        c.setSharedSecret(p.getSharedSecret());
        return tmp;
    }

    /**
     * Cipher PDU.
     * 
     * @param p
     *            Aes GCM Parameter.
     * @param data
     *            Plain text.
     * @return Secured data.
     */
    public static byte[] encrypt(final AesGcmParameter p, final byte[] data) {
        if (p.getSecurity() != Security.NONE) {
            byte[] tmp = GXDLMSChippering.encryptAesGcm(p, data);
            p.setInvocationCounter(p.getInvocationCounter() + 1);
            return tmp;
        }
        return data;
    }

    @Override
    public final void reset() {
        setSecurity(Security.NONE);
        setInvocationCounter(0);
    }

    @Override
    public final boolean isCiphered() {
        return security != Security.NONE;
    }

    /**
     * @param value
     *            Invocation Counter.
     */
    public final void setInvocationCounter(final long value) {
        invocationCounter = value;
    }

    /**
     * @return .
     */
    public final long getInvocationCounter() {
        return invocationCounter;
    }

    /**
     * @return Used security.
     */
    public final Security getSecurity() {
        return security;
    }

    /**
     * @param value
     *            Used security.
     */
    public final void setSecurity(final Security value) {
        security = value;
    }

    /**
     * The SystemTitle is a 8 bytes (64 bit) value that identifies a partner of
     * the communication. First 3 bytes contains the three letters manufacturer
     * ID. The remainder of the system title holds for example a serial number.
     * 
     * @see <a href="http://www.dlms.com/organization/flagmanufacturesids">List
     *      of manufacturer IDs.</a>
     * @return System title.
     */
    public final byte[] getSystemTitle() {
        return systemTitle;
    }

    /**
     * @param value
     *            System title.
     */
    public final void setSystemTitle(final byte[] value) {
        if (value != null && value.length != 8) {
            throw new IllegalArgumentException("Invalid system title.");
        }
        systemTitle = value;
    }

    /**
     * @return Recipient system title.
     */
    public final byte[] getRecipientSystemTitle() {
        return recipientSystemTitle;
    }

    /**
     * @param value
     *            Recipient system title.
     */
    public final void setRecipientSystemTitle(final byte[] value) {
        if (value != null && value.length != 8) {
            throw new IllegalArgumentException(
                    "Invalid recipient system title.");
        }
        recipientSystemTitle = value;
    }

    /**
     * Each block is ciphered with this key.
     * 
     * @return Block cipher key.
     */
    public final byte[] getBlockCipherKey() {
        return blockCipherKey;
    }

    public final void setBlockCipherKey(final byte[] value) {
        if (value != null && value.length != 16) {
            throw new IllegalArgumentException("Invalid Block Cipher Key.");
        }
        blockCipherKey = value;
    }

    /**
     * @return Authentication Key is 16 bytes value.
     */
    public final byte[] getAuthenticationKey() {
        return authenticationKey;
    }

    public final void setAuthenticationKey(final byte[] value) {
        if (value != null && value.length != 16) {
            throw new IllegalArgumentException("Invalid Authentication Key.");
        }
        authenticationKey = value;
    }

    /**
     * @return Available certificates.
     */
    public final GXx509CertificateCollection getCertificates() {
        return certificates;
    }

    /**
     * @return Ephemeral key pair.
     */
    public KeyPair getEphemeralKeyPair() {
        return ephemeralKeyPair;
    }

    /**
     * @param value
     *            Ephemeral key pair.
     */
    public void setEphemeralKeyPair(final KeyPair value) {
        ephemeralKeyPair = value;
    }

    /**
     * @return Signing key pair.
     */
    public final KeyPair getSigningKeyPair() {
        return signingKeyPair;
    }

    /**
     * @param value
     *            Signing key pair.
     */
    public final void setSigningKeyPair(final KeyPair value) {
        signingKeyPair = value;
    }

    /**
     * @return Client's key agreement key pair.
     */
    public final KeyPair getKeyAgreementKeyPair() {
        return keyAgreementKeyPair;
    }

    /**
     * @param value
     *            Client's key agreement key pair.
     */
    public final void setKeyAgreementKeyPair(final KeyPair value) {
        keyAgreementKeyPair = value;
    }

    /**
     * @return Target (Server or client) Public key.
     */
    public final List<Map.Entry<CertificateType, PublicKey>> getPublicKeys() {
        return publicKeys;
    }

    /**
     * @return Used security suite.
     */
    public SecuritySuite getSecuritySuite() {
        return securitySuite;
    }

    /**
     * @param value
     *            Used security suite.
     */
    public void setSecuritySuite(final SecuritySuite value) {
        securitySuite = value;
    }

    /**
     * @return Shared secret is generated when connection is made.
     */
    public byte[] getSharedSecret() {
        return sharedSecret;
    }

    /**
     * @param value
     *            Shared secret is generated when connection is made.
     */
    public void setSharedSecret(final byte[] value) {
        sharedSecret = value;
    }

    /**
     * Generate GMAC password from given challenge.
     * 
     * @param challenge
     *            Client to Server or Server to Client challenge.
     * @return Generated challenge.
     */
    public byte[] generateGmacPassword(final byte[] challenge) {
        AesGcmParameter p = new AesGcmParameter(0x10, Security.AUTHENTICATION,
                invocationCounter, systemTitle, blockCipherKey,
                authenticationKey);
        GXByteBuffer bb = new GXByteBuffer();
        GXDLMSChippering.encryptAesGcm(p, challenge);
        bb.setUInt8(0x10);
        bb.setUInt32(invocationCounter);
        bb.set(p.getCountTag());
        return bb.array();
    }

    @Override
    public byte[] getDedicatedKey() {
        return dedicatedKey;
    }

    @Override
    public void setDedicatedKey(final byte[] value) {
        dedicatedKey = value;
    }
}