package com.houde.cell.dto;

import lombok.Data;

/**
 * 购物车，加减库存使用
 * Created by houde
 * 2019-03-06 17:08
 */
@Data
public class CartDTO {
    /**
     * 商品Id.
     */
    private String productId;

    /**
     * 数量.
     */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
