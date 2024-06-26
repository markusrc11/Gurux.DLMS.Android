package gurux.dlms.manufacturersettings;

import java.util.ArrayList;

public class GXObisValueItemCollection extends ArrayList<GXObisValueItem> {
    private static final long serialVersionUID = 1L;

    @Override
    public final void add(final int index, final GXObisValueItem item) {
        if (!this.contains(item)) {
            super.add(index, item);
        }
    }

    @Override
    public final boolean add(final GXObisValueItem item) {
        if (!this.contains(item)) {
            return super.add(item);
        }
        return false;
    }

    public final boolean contains(final GXObisValueItem item) {
        for (GXObisValueItem it : this) {
            if (it.getValue().equals(item.getValue())) {
                return true;
            }
        }
        return false;
    }
}