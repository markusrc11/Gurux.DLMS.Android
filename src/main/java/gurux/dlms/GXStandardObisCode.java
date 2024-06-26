package gurux.dlms;

/**
 * OBIS Code class is used to find out default description to OBIS Code.
 */
class GXStandardObisCode {
    private String[] obis;
    private String dataType;
    private String uiDataType;
    private String interfaces;
    private String description;

    /**
     * Constructor.
     */
    GXStandardObisCode() {
        dataType = "";
        uiDataType = "";
    }

    /*
     * Constructor.
     */
    GXStandardObisCode(final String[] forObis, final String desc,
            final String forInterfaces, final String forDataType) {
        obis = new String[6];
        if (forObis != null) {
            System.arraycopy(forObis, 0, obis, 0, 6);
        }
        this.setDescription(desc);
        this.setInterfaces(forInterfaces);
        setDataType(forDataType);
    }

    /*
     * OBIS code.
     */
    public final String[] getOBIS() {
        return obis;
    }

    public final void setOBIS(final String[] value) {
        obis = value;
    }

    /**
     * @return OBIS code description.
     */
    public final String getDescription() {
        return description;
    }

    public final void setDescription(final String value) {
        description = value;
    }

    /*
     * Interfaces that are using this OBIS code.
     */
    public final String getInterfaces() {
        return interfaces;
    }

    public final void setInterfaces(final String value) {
        interfaces = value;
    }

    /**
     * @return Standard data types.
     */
    public final String getDataType() {
        return dataType;
    }

    public final void setDataType(final String value) {
        dataType = value;
    }

    /**
     * @return Standard data types.
     */
    public final String getUIDataType() {
        return uiDataType;
    }

    public final void setUIDataType(final String value) {
        uiDataType = value;
    }

    /**
     * @return Convert to string.
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (String s : obis) {
            if (builder.length() != 0) {
                builder.append(".");
            }
            builder.append(s);
        }
        return builder.toString() + " " + getDescription();
    }
}
