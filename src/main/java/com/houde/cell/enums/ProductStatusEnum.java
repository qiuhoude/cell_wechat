package com.houde.cell.enums;

import lombok.Getter;

/**
 *  商品状态
 * Created by houde
 * 2019-03-05 15:27
 */
@Getter
public enum ProductStatusEnum {
    UP(0, "在架"),
    DOWN(1, "下架");

    private Integer code;
    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
