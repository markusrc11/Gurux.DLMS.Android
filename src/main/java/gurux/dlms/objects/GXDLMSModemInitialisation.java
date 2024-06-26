package gurux.dlms.objects;

public class GXDLMSModemInitialisation {
    private String request;
    private String response;
    private int delay;

    public final String getRequest() {
        return request;
    }

    public final void setRequest(final String value) {
        request = value;
    }

    public final String getResponse() {
        return response;
    }

    public final void setResponse(final String value) {
        response = value;
    }

    public final int getDelay() {
        return delay;
    }

    public final void setDelay(final int value) {
        delay = value;
    }

    @Override
    public final String toString() {
        return request + " " + response + " " + delay;
    }
}