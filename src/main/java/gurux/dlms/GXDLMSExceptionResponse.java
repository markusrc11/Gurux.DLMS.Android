package gurux.dlms;

import gurux.dlms.enums.ExceptionServiceError;
import gurux.dlms.enums.StateError;

/**
 * DLMS specific exception class that has error description available from
 * GetDescription method.
 */
public class GXDLMSExceptionResponse extends RuntimeException {
    /**
     * Serial version UID.
     */
    private static final long serialVersionUID = 1L;
    private final StateError exceptionStateError;
    private final ExceptionServiceError exceptionServiceError;
    private final Object exceptionResponseValue;

    /*
     * Constructor for Confirmed ServiceError.
     */
    GXDLMSExceptionResponse(final StateError error,
            final ExceptionServiceError type, final Object value) {
        super(getStateError(error) + ". " + getServiceError(type));
        exceptionStateError = error;
        exceptionServiceError = type;
        exceptionResponseValue = value;
    }

    /**
     * @return the state error.
     */
    public final StateError getStateError() {
        return exceptionStateError;
    }

    /**
     * @return the service error.
     */
    public final ExceptionServiceError getExceptionServiceError() {
        return exceptionServiceError;
    }

    /**
     * @return the optional value field.
     */
    public final Object getValue() {
        return exceptionResponseValue;
    }

    /**
     * Gets state error description.
     * 
     * @param stateError
     *            State error enumerator value.
     * @return State error as an string.
     */
    private static String getStateError(final StateError stateError) {
        switch (stateError) {
        case SERVICE_NOT_ALLOWED:
            return "Service not allowed";
        case SERVICE_UNKNOWN:
            return "Service unknown";
        default:
        }
        return "";
    }

    /**
     * Gets service error description.
     * 
     * @param serviceError
     *            Service error enumerator value.
     * @return Service error as an string.
     */
    private static String
            getServiceError(final ExceptionServiceError serviceError) {
        switch (serviceError) {
        case OPERATION_NOT_POSSIBLE:
            return "Operation not possible";
        case SERVICE_NOT_SUPPORTED:
            return "Service not supported";
        case OTHER_REASON:
            return "Other reason";
        case PDU_TOO_LONG:
            return "PDU is too long";
        case DECIPHERING_ERROR:
            return "Ciphering failed";
        case INVOCATION_COUNTER_ERROR:
            return "Invocation counter is invalid.";
        default:
        }
        return "";
    }

}