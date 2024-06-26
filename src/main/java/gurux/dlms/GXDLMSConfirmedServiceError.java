package gurux.dlms;

import gurux.dlms.enums.Access;
import gurux.dlms.enums.ApplicationReference;
import gurux.dlms.enums.Definition;
import gurux.dlms.enums.HardwareResource;
import gurux.dlms.enums.Initiate;
import gurux.dlms.enums.LoadDataSet;
import gurux.dlms.enums.Task;
import gurux.dlms.enums.VdeStateError;

/**
 * DLMS specific exception class that has error description available from
 * GetDescription method.
 */
public class GXDLMSConfirmedServiceError extends RuntimeException {
    /**
     * Serial version UID.
     */
    private static final long serialVersionUID = 1L;
    private ConfirmedServiceError confirmedServiceError;
    private ServiceError serviceError;
    private byte serviceErrorValue;

    /*
     * Constructor for Confirmed ServiceError.
     */
    GXDLMSConfirmedServiceError(final ConfirmedServiceError service,
            final ServiceError type, final int value) {
        super("ServiceError " + getConfirmedServiceError(service)
                + " exception. " + getServiceError(type) + " "
                + getServiceErrorValue(type, (byte) value));
        confirmedServiceError = service;
        serviceError = type;
        serviceErrorValue = (byte) value;
    }

    /**
     * @return the Confirmed service error.
     */
    public final ConfirmedServiceError getConfirmedServiceError() {
        return confirmedServiceError;
    }

    /**
     * @return the serviceErrorValue
     */
    public final byte getServiceErrorValue() {
        return serviceErrorValue;
    }

    /**
     * @return the serviceError
     */
    public final ServiceError getServiceError() {
        return serviceError;
    }

    private static String
            getConfirmedServiceError(final ConfirmedServiceError stateError) {
        switch (stateError) {
        case INITIATE_ERROR:
            return "Initiate Error";
        case READ:
            return "Read";
        case WRITE:
            return "Write";
        default:
            break;
        }
        return "";
    }

    private static String getServiceError(final ServiceError error) {
        switch (error) {
        case APPLICATION_REFERENCE:
            return "Application reference";
        case HARDWARE_RESOURCE:
            return "Hardware resource";
        case VDE_STATE_ERROR:
            return "Vde state error";
        case SERVICE:
            return "Service";
        case DEFINITION:
            return "Definition";
        case ACCESS:
            return "Access";
        case INITIATE:
            return "Initiate";
        case LOAD_DATASET:
            return "Load dataset";
        case TASK:
            return "Task";
        case OTHER_ERROR:
            return "Other Error";
        default:
            break;
        }
        return "";
    }

    private static String getServiceErrorValue(final ServiceError error,
            final byte value) {
        switch (error) {
        case APPLICATION_REFERENCE:
            return ApplicationReference.forValue(value).toString();
        case HARDWARE_RESOURCE:
            return HardwareResource.forValue(value).toString();
        case VDE_STATE_ERROR:
            return VdeStateError.forValue(value).toString();
        case SERVICE:
            return Service.forValue(value).toString();
        case DEFINITION:
            return Definition.forValue(value).toString();
        case ACCESS:
            return Access.forValue(value).toString();
        case INITIATE:
            return Initiate.forValue(value).toString();
        case LOAD_DATASET:
            return LoadDataSet.forValue(value).toString();
        case TASK:
            return Task.forValue(value).toString();
        case OTHER_ERROR:
            return String.valueOf(value);
        default:
            break;
        }
        return "";
    }

}