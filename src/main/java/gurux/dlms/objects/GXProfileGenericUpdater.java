package gurux.dlms.objects;

import gurux.dlms.GXDLMSServerBase;
import gurux.dlms.internal.AutoResetEvent;

/*
 * This class is reserved for internal use. Do not use.
 */
final class GXProfileGenericUpdater extends Thread {
    private GXDLMSServerBase server;
    private GXDLMSProfileGeneric target;

    private AutoResetEvent receivedEvent;

    public AutoResetEvent getReceivedEvent() {
        return receivedEvent;
    }

    /*
     * Constructor.
     */
    GXProfileGenericUpdater(final GXDLMSServerBase svr,
            final GXDLMSProfileGeneric pg) {
        receivedEvent = new AutoResetEvent(false);
        target = pg;
        server = svr;
    }

    public void run() {
        do {
            try {
                target.capture(server);
            } catch (Exception ex) {
                System.out.printf(ex.getMessage());
            }
        } while (!receivedEvent.waitOne(target.getCapturePeriod() * 1000));
    }
}