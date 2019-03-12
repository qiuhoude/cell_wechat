package com.houde.cell.exception;

import com.houde.cell.enums.ResultEnum;

/**
 * 自定义异常
 * Created by houde
 * 2019-03-06 16:57
 */
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
