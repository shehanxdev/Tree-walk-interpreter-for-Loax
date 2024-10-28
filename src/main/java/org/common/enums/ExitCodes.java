package org.common.enums;

public enum ExitCodes {
    INVALID_USAGE(64);


    private final int code;

    ExitCodes(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
