package gurux.dlms.manufacturersettings;

public class GXAttributeCollection
        extends java.util.ArrayList<GXDLMSAttributeSettings> {
    private static final long serialVersionUID = 1L;
    private Object parent;

    /**
     * @return Parent object.
     */
    public final Object getParent() {
        return parent;
    }

    public final void setParent(final Object value) {
        parent = value;
    }

    public final GXDLMSAttributeSettings find(final int index) {
        if (index < 1) {
            throw new IllegalArgumentException("Invalid attribute Index.");
        }
        for (GXDLMSAttributeSettings it : this) {
            if (it.getIndex() == index) {
                return it;
            }
        }
        return null;
    }

    @Override
    public final boolean add(final GXDLMSAttributeSettings item) {
        item.setParent(this);
        return super.add(item);
    }
}