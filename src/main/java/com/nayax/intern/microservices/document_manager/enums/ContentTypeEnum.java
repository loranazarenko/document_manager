package com.nayax.intern.microservices.document_manager.enums;

public enum ContentTypeEnum {
    XLS(1),
    XLSX(2),
    CSV(3);

    private int numVal;

    ContentTypeEnum(int numVal) {
        this.numVal = numVal;
    }

    public int getNumVal() {
        return numVal;
    }


}
