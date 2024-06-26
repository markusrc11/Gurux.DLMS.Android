package gurux.dlms.objects;

import java.util.HashSet;
import java.util.Set;

import gurux.dlms.GXDLMSSettings;
import gurux.dlms.enums.Conformance;
import gurux.dlms.internal.GXCommon;

public class GXxDLMSContextType {

    /**
     * Server settings.
     */
    private GXDLMSSettings settings;
    /**
     * Conformance.
     */
    private Set<Conformance> conformance;
    /**
     * Maximum receive PDU size.
     */
    private int maxReceivePduSize;
    /**
     * Maximum Send PDU size.
     */
    private int maxSendPduSize;
    /**
     * DLMS Version Number.
     */
    private int dlmsVersionNumber;
    /**
     * Quality Of Service.
     */
    private int qualityOfService;
    /**
     * CypheringInfo.
     */
    private byte[] cypheringInfo;

    /**
     * Constructor.
     */
    public GXxDLMSContextType() {
        conformance = new HashSet<Conformance>();
    }

    /**
     * @return Conformance
     */
    public final Set<Conformance> getConformance() {
        if (settings != null) {
            return settings.getProposedConformance();
        }
        return conformance;
    }

    /**
     * @param value
     *            Conformance
     */
    public final void setConformance(final Set<Conformance> value) {
        if (settings != null) {
            settings.setProposedConformance(value);
        }
        conformance = value;
    }

    public final int getMaxReceivePduSize() {
        if (settings != null) {
            settings.getMaxServerPDUSize();
        }
        return maxReceivePduSize;
    }

    public final void setMaxReceivePduSize(final int value) {
        if (settings != null) {
            settings.setMaxServerPDUSize(value);
        }
        maxReceivePduSize = value;
    }

    public final int getMaxSendPduSize() {
        if (settings != null) {
            return settings.getMaxServerPDUSize();
        }
        return maxSendPduSize;
    }

    public final void setMaxSendPduSize(final int value) {
        if (settings != null) {
            settings.setMaxServerPDUSize(value);
        }
        maxSendPduSize = value;
    }

    public final int getDlmsVersionNumber() {
        if (settings != null) {
            return settings.getDlmsVersionNumber();
        }
        return dlmsVersionNumber;
    }

    public final void setDlmsVersionNumber(final int value) {
        if (settings != null) {
            settings.setDlmsVersionNumber(value);
        }
        dlmsVersionNumber = value;
    }

    public final int getQualityOfService() {
        return qualityOfService;
    }

    public final void setQualityOfService(final int value) {
        qualityOfService = value;
    }

    public final byte[] getCypheringInfo() {
        return cypheringInfo;
    }

    public final void setCypheringInfo(final byte[] value) {
        cypheringInfo = value;
    }

    public final GXDLMSSettings getSettings() {
        return settings;
    }

    public final void setSettings(final GXDLMSSettings value) {
        settings = value;
    }

    @Override
    public final String toString() {
        return String.valueOf(conformance) + " "
                + String.valueOf(maxReceivePduSize) + " "
                + String.valueOf(maxSendPduSize) + " "
                + String.valueOf(dlmsVersionNumber) + " "
                + String.valueOf(qualityOfService) + " "
                + GXCommon.toHex(cypheringInfo, true);
    }
}
