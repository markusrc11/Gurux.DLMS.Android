
package gurux.dlms.enums;

/**
 * Key agreement.
 */
public enum KeyAgreement {
    /**
     * The Ephemeral Unified Model C(2e, 0s, ECC CDH) scheme.
     */
    EPHEMERAL_UNIFIED_MODEL,

    /**
     * The One-Pass Diffie-Hellman C(1e, 1s, ECC CDH) scheme.
     */
    ONE_PASS_DIFFIE_HELLMAN,

    /**
     * the Static Unified Model C(0e, 2s, ECC CDH) scheme.
     */
    STATIC_UNIFIED_MODEL
}