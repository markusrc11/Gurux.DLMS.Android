
package gurux.dlms;

final class TranslatorGeneralTags {

    /**
     * Constructor.
     */
    private TranslatorGeneralTags() {

    }

    static final int APPLICATION_CONTEXT_NAME = 0xA1;
    static final int NEGOTIATED_QUALITY_OF_SERVICE = 0xBE00;
    static final int PROPOSED_DLMS_VERSION_NUMBER = 0xBE01;
    static final int PROPOSED_MAX_PDU_SIZE = 0xBE02;
    static final int PROPOSED_CONFORMANCE = 0xBE03;
    static final int VAA_NAME = 0xBE04;
    static final int NEGOTIATED_CONFORMANCE = 0xBE05;
    static final int NEGOTIATED_DLMS_VERSION_NUMBER = 0xBE06;
    static final int NEGOTIATED_MAX_PDU_SIZE = 0xBE07;
    static final int CONFORMANCE_BIT = 0xBE08;
    static final int PROPOSED_QUALITY_OF_SERVICE = 0xBE09;
    static final int SENDER_ACSE_REQUIREMENTS = 0x8A;
    static final int RESPONDER_ACSE_REQUIREMENT = 0x88;
    static final int RESPONDING_MECHANISM_NAME = 0x89;
    static final int CALLING_MECHANISM_NAME = 0x8B;
    static final int CALLING_AUTHENTICATION = 0xAC;
    static final int RESPONDING_AUTHENTICATION = 0x80;
    static final int ASSOCIATION_RESULT = 0xA2;
    static final int RESULT_SOURCE_DIAGNOSTIC = 0xA3;
    static final int ACSE_SERVICE_USER = 0xA301;
    static final int ACSE_SERVICE_PROVIDER = 0xA302;
    static final int CALLING_AP_TITLE = 0xA6;
    static final int RESPONDING_AP_TITLE = 0xA4;
    static final int DEDICATED_KEY = 0xA8;
    static final int CALLING_AE_INVOCATION_ID = 0xA9;
    static final int CALLED_AE_INVOCATION_ID = 0xA5;
    static final int CALLING_AE_QUALIFIER = 0xA7;
    static final int CHAR_STRING = 0xAA;
    static final int USER_INFORMATION = 0xAB;
    static final int RESPONDING_AE_INVOCATION_ID = 0xAD;
}
