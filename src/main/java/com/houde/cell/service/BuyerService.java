package com.houde.cell.service;

import com.houde.cell.dto.OrderDTO;

/**
 * 买家
 * Created by houde
 * 2019-03-12 21:33
 */
public interface BuyerService {
    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid, String orderId);
}
