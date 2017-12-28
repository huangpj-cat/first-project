package models;

import java.io.Serializable;

/**
 * 文件处理参数表
 *
 */public class UpayParam implements Serializable {
    private static final long serialVersionUID = 1L;

    private long paramId;
    private String display1;

    private String display2;

    private String paramCode1;

    private String paramCode2;

    private String paramType;

    private String paramValue;

    private String reserved1;

    private String reserved2;

    private String status;

    private String typeDesc;

    public UpayParam() {
    }

    public String getDisplay1() {
        return this.display1;
    }

    public void setDisplay1(String display1) {
        this.display1 = display1;
    }

    public String getDisplay2() {
        return this.display2;
    }

    public void setDisplay2(String display2) {
        this.display2 = display2;
    }

    public String getParamCode1() {
        return this.paramCode1;
    }

    public void setParamCode1(String paramCode1) {
        this.paramCode1 = paramCode1;
    }

    public String getParamCode2() {
        return this.paramCode2;
    }

    public void setParamCode2(String paramCode2) {
        this.paramCode2 = paramCode2;
    }

    public long getParamId() {
        return paramId;
    }

    public void setParamId(long paramId) {
        this.paramId = paramId;
    }

    public String getParamType() {
        return this.paramType;
    }

    public void setParamType(String paramType) {
        this.paramType = paramType;
    }

    public String getParamValue() {
        return this.paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }

    public String getReserved1() {
        return this.reserved1;
    }

    public void setReserved1(String reserved1) {
        this.reserved1 = reserved1;
    }

    public String getReserved2() {
        return this.reserved2;
    }

    public void setReserved2(String reserved2) {
        this.reserved2 = reserved2;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTypeDesc() {
        return this.typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }
}
