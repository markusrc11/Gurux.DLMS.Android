package gurux.dlms.objects;

public class GXDLMSQualityOfService {
    private int precedence;
    private int delay;
    private int reliability;
    private int peakThroughput;
    private int meanThroughput;

    public final int getPrecedence() {
        return precedence;
    }

    public final void setPrecedence(final int value) {
        precedence = value;
    }

    public final int getDelay() {
        return delay;
    }

    public final void setDelay(final int value) {
        delay = value;
    }

    public final int getReliability() {
        return reliability;
    }

    public final void setReliability(final int value) {
        reliability = value;
    }

    public final int getPeakThroughput() {
        return peakThroughput;
    }

    public final void setPeakThroughput(final int value) {
        peakThroughput = value;
    }

    public final int getMeanThroughput() {
        return meanThroughput;
    }

    public final void setMeanThroughput(final int value) {
        meanThroughput = value;
    }
}
