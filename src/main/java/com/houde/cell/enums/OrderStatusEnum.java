package com.houde.cell.enums;

import lombok.Getter;

/**
 * Created by houde
 * 2019-03-06 10:57
 */
@Getter
public enum OrderStatusEnum implements CodeEnum {
    NEW(0, "新订单"),
    FINISHED(1, "完结"),
    CANCEL(2, "已取消");
    private Integer code;

    private String message;

    private OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
