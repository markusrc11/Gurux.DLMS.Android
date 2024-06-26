package gurux.dlms.objects;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.SignatureException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import gurux.dlms.GXDLMSSettings;
import gurux.dlms.ValueEventArgs;

public interface IGXDLMSBase {

    /**
     * Returns collection of attributes to read. If attribute is static and
     * already read or device is returned HW error it is not returned.
     * 
     * @param all
     *            All are attributes get.
     * @return Collection of attributes to read.
     */
    int[] getAttributeIndexToRead(boolean all);

    /**
     * @return Amount of attributes.
     */
    int getAttributeCount();

    /**
     * @return Amount of methods.
     */
    int getMethodCount();

    /**
     * Returns value of given attribute.
     * 
     * @param settings
     *            DLMS settings.
     * @param e
     *            Get parameter.
     * @return Returned value.
     */
    Object getValue(GXDLMSSettings settings, ValueEventArgs e);

    /**
     * Set value of given attribute.
     * 
     * @param settings
     *            DLMS settings.
     * @param e
     *            Set parameter.
     */
    void setValue(GXDLMSSettings settings, ValueEventArgs e);

    /**
     * Server calls invoke method.
     * 
     * @param settings
     *            Server settings.
     * @param e
     *            Invoke parameter.
     * @return Reply for the client.
     * @throws NoSuchPaddingException
     *             No such padding exception.
     * @throws InvalidAlgorithmParameterException
     *             Invalid algorithm parameter exception.
     * @throws InvalidKeyException
     *             Invalid key exception.
     * @throws BadPaddingException
     *             Bad padding exception.
     * @throws SignatureException
     *             Signature exception.
     * @throws IllegalBlockSizeException
     *             Illegal block size exception.
     */
    byte[] invoke(GXDLMSSettings settings, ValueEventArgs e)
            throws InvalidKeyException, NoSuchPaddingException,
            InvalidAlgorithmParameterException, IllegalBlockSizeException,
            BadPaddingException, SignatureException;

    /**
     * Load object content from XML.
     * 
     * @param reader
     *            XML reader.
     * @throws XMLStreamException
     *             XML stream exception.
     */
    void load(GXXmlReader reader) throws XMLStreamException;

    /**
     * Save object content to XML.
     * 
     * @param writer
     *            XML writer.
     * @throws XMLStreamException
     *             XML stream exception.
     */
    void save(GXXmlWriter writer) throws XMLStreamException;

    /**
     * Handle actions after Load.
     * 
     * @param reader
     *            XML reader.
     */
    void postLoad(GXXmlReader reader);
}
