package gurux.dlms.manufacturersettings;

import gurux.dlms.enums.ObjectType;

public class GXObisCodeCollection extends java.util.ArrayList<GXObisCode> {
    private static final long serialVersionUID = 1L;

    public final GXObisCode findByLN(final ObjectType type, final String ln,
            final GXObisCode skipItem) {
        for (GXObisCode it : this) {
            if ((it.getObjectType() == type || type == ObjectType.NONE)
                    && it.getLogicalName().equals(ln) && it != skipItem) {
                return it;
            }
        }
        return null;
    }
}