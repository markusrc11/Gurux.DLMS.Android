package gurux.dlms.objects;

import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.util.Date;

import gurux.dlms.GXDLMSConverter;
import gurux.dlms.GXDateOS;
import gurux.dlms.GXDateTime;
import gurux.dlms.GXDateTimeOS;
import gurux.dlms.GXTimeOS;
import gurux.dlms.enums.DataType;

/**
 * Save COSEM object to the file.
 */
public class GXXmlWriter implements AutoCloseable{

    private int indenting = 0;
    private GXXmlWriterSettings settings;

    public boolean isSkipDefaults() {
        if (settings == null) {
            return false;
        }
        return settings.isIgnoreDefaultValues();
    }

    /**
     * @return GXDateTime values are serialised using meter time, not local
     *         time.
     */
    public boolean isUseMeterTime() {
        if (settings == null) {
            return false;
        }
        return settings.isUseMeterTime();
    }

    /**
     * Constructor.
     * 
     * @param filename
     *            File name.
     * @throws XMLStreamException
     *             Invalid XML stream.
     * @throws FileNotFoundException
     *             File not found.
     */
    public GXXmlWriter(final String filename)
            throws FileNotFoundException, XMLStreamException {
        throw new UnsupportedOperationException("XML writer is not supported at the moment.");
    }

    /**
     * Constructor.
     * 
     * @param s
     *            Stream.
     * @throws XMLStreamException
     *             Invalid XML stream.
     */
    public GXXmlWriter(final OutputStream s) throws XMLStreamException {
        throw new UnsupportedOperationException("XML writer is not supported at the moment.");
    }

    @Override
    public final void close()  {
    }

    /**
     * Append spaces to the buffer.
     * 
     * @throws XMLStreamException
     */
    private void appendSpaces() throws XMLStreamException {
        throw new UnsupportedOperationException("XML writer is not supported at the moment.");
    }

    public final void writeStartDocument() throws XMLStreamException {
        throw new UnsupportedOperationException("XML writer is not supported at the moment.");
    }

    public final void writeStartElement(final String name)
            throws XMLStreamException {
        throw new UnsupportedOperationException("XML writer is not supported at the moment.");
    }

    public final void writeStartElement(final String elementName,
            final String attributeName, final String value,
            final boolean newLine) throws XMLStreamException {
        throw new UnsupportedOperationException("XML writer is not supported at the moment.");
    }

    public final void writeElementString(final String name, final Date value)
            throws XMLStreamException {
        throw new UnsupportedOperationException("XML writer is not supported at the moment.");
    }

    public final void writeElementString(final String name, final long value)
            throws XMLStreamException {
        if (!isSkipDefaults() || value != 0) {
            writeElementString(name, String.valueOf(value));
        }
    }

    public final void writeElementString(final String name, final double value)
            throws XMLStreamException {
        writeElementString(name, value, 0);
    }

    public final void writeElementString(final String name, final double value,
            final double defaultValue) throws XMLStreamException {
        throw new UnsupportedOperationException("XML writer is not supported at the moment.");
    }

    public final void writeElementString(final String name, final int value)
            throws XMLStreamException {
        if (!isSkipDefaults() || value != 0) {
            writeElementString(name, String.valueOf(value));
        }
    }

    public final void writeElementString(final String name, final String value)
            throws XMLStreamException {
        throw new UnsupportedOperationException("XML writer is not supported at the moment.");
    }

    public final void writeElementString(final String name, final boolean value)
            throws XMLStreamException {
        if (!isSkipDefaults() || value) {
            writeElementString(name, value ? "1" : "0");
        }
    }

    public final void writeElementString(final String name,
            final GXDateTime value) throws XMLStreamException {
        throw new UnsupportedOperationException("XML writer is not supported at the moment.");
    }

    private void writeArray(final Object data) throws XMLStreamException {
        throw new UnsupportedOperationException("XML writer is not supported at the moment.");
    }

    public final void writeElementObject(final String name, final Object value)
            throws XMLStreamException {
        writeElementObject(name, value, isSkipDefaults());
    }

    /**
     * Write object value to file.
     * 
     * @param name
     *            Object name.
     * @param value
     *            Object value.
     * @param dt
     *            Data type of serialized value.
     * @param uiType
     *            UI data type of serialized value.
     */
    public final void writeElementObject(final String name, final Object value,
            final DataType dt, final DataType uiType){
        throw new UnsupportedOperationException("XML writer is not supported at the moment.");
    }

    /**
     * Write object value to file.
     * 
     * @param name
     *            Object name.
     * @param value
     *            Object value.
     * @param skipDefaultValue
     *            Is default value serialized.
     * @throws XMLStreamException
     *             Invalid XML stream.
     */
    public final void writeElementObject(final String name, final Object value,
            final boolean skipDefaultValue) throws XMLStreamException {
        if (value != null || !skipDefaultValue) {
            if (skipDefaultValue && value instanceof java.util.Date
                    && (((java.util.Date) value)
                            .compareTo(new java.util.Date(0))) == 0) {
                return;
            }
            if (value instanceof GXDateTimeOS) {
                writeElementObject(name, value, DataType.OCTET_STRING,
                        DataType.DATETIME);
            } else if (value instanceof GXDateOS) {
                writeElementObject(name, value, DataType.OCTET_STRING,
                        DataType.DATE);
            } else if (value instanceof GXTimeOS) {
                writeElementObject(name, value, DataType.OCTET_STRING,
                        DataType.TIME);
            } else {
                DataType dt = GXDLMSConverter.getDLMSDataType(value);
                writeElementObject(name, value, dt, DataType.NONE);
            }
        }
    }

    private void writeEndElement(final boolean addSpaces)
            throws XMLStreamException {
        --indenting;
        if (addSpaces) {
            appendSpaces();
        }
    }

    /**
     * Write End Element tag.
     * 
     * @throws XMLStreamException
     *             Invalid XML stream.
     */
    public final void writeEndElement() throws XMLStreamException {
        writeEndElement(true);
    }

    /**
     * Write End document tag.
     * 
     * @throws XMLStreamException
     *             Invalid XML stream.
     */
    public final void writeEndDocument() throws XMLStreamException {
    }

    /**
     * Write any cached data to the stream.
     * 
     * @throws XMLStreamException
     *             Invalid XML stream.
     */
    public final void flush() throws XMLStreamException {
    }
}
