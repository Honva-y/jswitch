package com.tejchen.jswitchserver.base;

import lombok.Getter;
import lombok.Setter;

public enum  BizResult {

    SUCCESS("100000", "成功"),
    FAIL("100001", "请求失败"),
    DATA_ALREADY_EXIST("100002", "数据已存在"),
    DATA_NOT_EXIST("100003", "数据不存在"),
    ;

    @Getter
    @Setter
    private String code;

    @Getter
    @Setter
    private String message;

    BizResult(String code, String message) {
        this.code = code;
        this.message = message;
    }

}
