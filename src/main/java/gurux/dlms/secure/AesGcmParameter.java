package gurux.dlms.secure;

import gurux.dlms.GXDLMSTranslatorStructure;
import gurux.dlms.enums.Security;
import gurux.dlms.internal.GXCommon;
import gurux.dlms.objects.enums.SecuritySuite;

public class AesGcmParameter {

    private int tag;
    private Security security;

    /**
     * Invocation counter.
     */
    private long invocationCounter;

    /**
     * System title.
     */
    private byte[] systemTitle;
    /**
     * Block cipher key.
     */
    private byte[] blockCipherKey;
    /**
     * Authentication key.
     */
    private byte[] authenticationKey;
    /**
     * Count type.
     */
    private int type;
    /**
     * Counted tag.
     */
    private byte[] countTag;

    /**
     * Recipient system title.
     */
    private byte[] recipientSystemTitle;
    /**
     * Date time.
     */
    private byte[] dateTime;
    /**
     * Other information.
     */
    private byte[] otherInformation;

    /**
     * Key parameters.
     */
    private int keyParameters;

    /**
     * Key ciphered data.
     */
    private byte[] keyCipheredData;

    /**
     * Ciphered content.
     */
    private byte[] cipheredContent;

    /**
     * Shared secret is generated when connection is made.
     */
    private byte[] sharedSecret;

    /**
     * Used security suite.
     */
    private SecuritySuite securitySuite = SecuritySuite.AES_GCM_128;

    private GXDLMSTranslatorStructure xml;

    /**
     * Constructor.
     * 
     * @param forTag
     *            Tag.
     * @param forSecurity
     *            Security level.
     * @param forInvocationCounter
     *            Invocation counter.
     * @param forSystemTitle
     *            System title.
     * @param forBlockCipherKey
     *            Block cipher key. A.k.a EK.
     * @param forAuthenticationKey
     *            Authentication key.
     */
    public AesGcmParameter(final int forTag, final Security forSecurity,
            final long forInvocationCounter, final byte[] forSystemTitle,
            final byte[] forBlockCipherKey, final byte[] forAuthenticationKey) {
        tag = forTag;
        security = forSecurity;
        invocationCounter = forInvocationCounter;
        systemTitle = forSystemTitle;
        blockCipherKey = forBlockCipherKey;
        authenticationKey = forAuthenticationKey;
        type = CountType.PACKET;
    }

    /**
     * Constructor.
     * 
     * @param forTag
     *            Tag.
     * @param forSecurity
     *            Security level.
     * @param forSecuritySuite
     *            Security suite.
     * @param forInvocationCounter
     *            Invocation counter.
     * @param kdf
     *            KDF.
     * @param forAuthenticationKey
     *            Authentication key.
     * @param forOriginatorSystemTitle
     *            Originator system title.
     * @param forRecipientSystemTitle
     *            Recipient system title.
     * @param forDateTime
     *            Date and time.
     * @param forOtherInformation
     *            Other information.
     */
    public AesGcmParameter(final int forTag, final Security forSecurity,
            final SecuritySuite forSecuritySuite,
            final long forInvocationCounter, final byte[] kdf,
            final byte[] forAuthenticationKey,
            final byte[] forOriginatorSystemTitle,
            final byte[] forRecipientSystemTitle, final byte[] forDateTime,
            final byte[] forOtherInformation) {
        tag = forTag;
        security = forSecurity;
        invocationCounter = forInvocationCounter;
        securitySuite = forSecuritySuite;
        blockCipherKey = kdf;
        authenticationKey = forAuthenticationKey;
        systemTitle = forOriginatorSystemTitle;
        recipientSystemTitle = forRecipientSystemTitle;
        type = CountType.PACKET;
        dateTime = forDateTime;
        otherInformation = forOtherInformation;
    }

    /**
     * Constructor.
     * 
     * @param forsystemTitle
     *            System title.
     * @param forblockCipherKey
     *            Block cipher key.
     * @param forauthenticationKey
     *            Authentication key.
     */
    public AesGcmParameter(final byte[] forsystemTitle,
            final byte[] forblockCipherKey, final byte[] forauthenticationKey) {
        systemTitle = forsystemTitle;
        blockCipherKey = forblockCipherKey;
        authenticationKey = forauthenticationKey;
        type = CountType.PACKET;
    }

    public final int getTag() {
        return tag;
    }

    public final Security getSecurity() {
        return security;
    }

    public final void setSecurity(final Security value) {
        security = value;
    }

    /**
     * @return Invocation counter.
     */
    public final long getInvocationCounter() {
        return invocationCounter;
    }

    /**
     * @param value
     *            Invocation counter.
     */
    public final void setInvocationCounter(final long value) {
        invocationCounter = value;
    }

    public final byte[] getSystemTitle() {
        return systemTitle;
    }

    public final void setSystemTitle(final byte[] value) {
        systemTitle = value;
    }

    public final byte[] getBlockCipherKey() {
        return blockCipherKey;
    }

    public final void setBlockCipherKey(final byte[] value) {
        blockCipherKey = value;
    }

    public final byte[] getAuthenticationKey() {
        return authenticationKey;
    }

    public final void setAuthenticationKey(final byte[] value) {
        authenticationKey = value;
    }

    public final int getType() {
        return type;
    }

    public final void setType(final int value) {
        type = value;
    }

    public final byte[] getCountTag() {
        return countTag;
    }

    public final void setCountTag(final byte[] value) {
        countTag = value;
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Security: ");
        sb.append(getSecurity());
        sb.append(" InvocationCounter: ");
        sb.append(getInvocationCounter());
        sb.append(" SystemTitle: ");
        sb.append(GXCommon.toHex(systemTitle, true));
        sb.append(" AuthenticationKey: ");
        sb.append(GXCommon.toHex(authenticationKey, true));
        sb.append(" BlockCipherKey: ");
        sb.append(GXCommon.toHex(blockCipherKey, true));
        return sb.toString();
    }

    /**
     * @return Optional Date time.
     */
    public byte[] getDateTime() {
        return dateTime;
    }

    /**
     * @param value
     *            Date time.
     */
    public final void setDateTime(final byte[] value) {
        dateTime = value;
    }

    /**
     * @return Optional other information.
     */
    public byte[] getOtherInformation() {
        return otherInformation;
    }

    /**
     * @param value
     *            Other information.
     */
    public final void setOtherInformation(final byte[] value) {
        otherInformation = value;
    }

    /**
     * @return Recipient system title.
     */
    public byte[] getRecipientSystemTitle() {
        return recipientSystemTitle;
    }

    /**
     * @param value
     *            Recipient system title.
     */
    public final void setRecipientSystemTitle(final byte[] value) {
        recipientSystemTitle = value;
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
     * @return Key parameters.
     */
    public int getKeyParameters() {
        return keyParameters;
    }

    /**
     * @param value
     *            Key parameters.
     */
    public void setKeyParameters(final int value) {
        keyParameters = value;
    }

    /**
     * @return Key ciphered data.
     */
    public byte[] getKeyCipheredData() {
        return keyCipheredData;
    }

    /**
     * @param value
     *            Key ciphered data.
     */
    public void setKeyCipheredData(final byte[] value) {
        keyCipheredData = value;
    }

    /**
     * @return Ciphered content.
     */
    public byte[] getCipheredContent() {
        return cipheredContent;
    }

    /**
     * @param value
     *            Ciphered content.
     */
    public void setCipheredContent(final byte[] value) {
        cipheredContent = value;
    }

    public final void setXml(final GXDLMSTranslatorStructure value) {
        xml = value;
    }

    public final GXDLMSTranslatorStructure getXml() {
        return xml;
    }
}
