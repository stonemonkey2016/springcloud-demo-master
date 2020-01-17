package com.extlight.springcloud.order.service;

import com.extlight.springcloud.common.model.Order;

/**
 * @descrption:
 * @author: bubbles
 */
public interface OrderService {

    void placeOrder(Order order) throws Exception;
}
