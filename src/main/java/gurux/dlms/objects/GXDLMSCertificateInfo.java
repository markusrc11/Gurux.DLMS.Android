package gurux.dlms.objects;

import gurux.dlms.objects.enums.CertificateEntity;
import gurux.dlms.objects.enums.CertificateType;

public class GXDLMSCertificateInfo {
    /**
     * Used certificate entity.
     */
    private CertificateEntity entity = CertificateEntity.SERVER;

    /**
     * Used certificate type.
     */
    private CertificateType type = CertificateType.DIGITAL_SIGNATURE;

    /**
     * Certificate serial number.
     */
    private String serialNumber;

    /**
     * Certificate issuer.
     */
    private String issuer;
    /**
     * Certificate subject.
     */
    private String subject;

    /**
     * Certificate subject alt name.
     */
    private String subjectAltName;

    /**
     * @return Used certificate entity.
     */
    public final CertificateEntity getEntity() {
        return entity;
    }

    /**
     * @param value
     *            Used certificate entity.
     */
    public final void setEntity(final CertificateEntity value) {
        entity = value;
    }

    /**
     * @return Used certificate type.
     */
    public final CertificateType getType() {
        return type;
    }

    /**
     * @param value
     *            Used certificate type.
     */
    public final void setType(final CertificateType value) {
        type = value;
    }

    /**
     * @return Certificate serial number.
     */
    public final String getSerialNumber() {
        return serialNumber;
    }

    /**
     * @param value
     *            Certificate serial number.
     */
    public final void setSerialNumber(final String value) {
        serialNumber = value;
    }

    /**
     * @return Certificate issuer.
     */
    public final String getIssuer() {
        return issuer;
    }

    /**
     * @param value
     *            Certificate issuer.
     */
    public final void setIssuer(final String value) {
        issuer = value;
    }

    /**
     * @return Certificate subject.
     */
    public final String getSubject() {
        return subject;
    }

    /**
     * @param value
     *            Certificate subject.
     */
    public final void setSubject(final String value) {
        subject = value;
    }

    /**
     * @return Certificate subject alt name.
     */
    public final String getSubjectAltName() {
        return subjectAltName;
    }

    /**
     * @param value
     *            Certificate subject alt name.
     */
    public final void setSubjectAltName(final String value) {
        subjectAltName = value;
    }

}