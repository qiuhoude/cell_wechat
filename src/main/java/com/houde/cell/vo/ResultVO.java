package com.houde.cell.vo;

import lombok.Data;

/**
 * http请求返回的最外层对象
 * Created by houde
 * 2019-03-05 15:49
 */
@Data
public class ResultVO<T> {
    /**
     * 错误码.
     */
    private Integer code;

    /**
     * 提示信息.
     */
    private String msg;

    /**
     * 具体内容.
     */
    private T data;
}
