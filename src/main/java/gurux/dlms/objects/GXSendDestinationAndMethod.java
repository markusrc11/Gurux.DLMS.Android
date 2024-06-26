package gurux.dlms.objects;

import gurux.dlms.objects.enums.MessageType;
import gurux.dlms.objects.enums.ServiceType;

public class GXSendDestinationAndMethod {
    private ServiceType service = ServiceType.TCP;
    private String destination;
    private MessageType message = MessageType.COSEM_APDU;

    public final ServiceType getService() {
        return service;
    }

    public final void setService(final ServiceType value) {
        service = value;
    }

    public final String getDestination() {
        return destination;
    }

    public final void setDestination(final String value) {
        destination = value;
    }

    public final MessageType getMessage() {
        return message;
    }

    public final void setMessage(final MessageType value) {
        message = value;
    }
}