package com.extlight.springcloud.feign.order.service;

import com.extlight.springcloud.feign.common.model.Order;

/**
 * @descrption:
 * @author: bubbles
 */
public interface OrderService {

    void placeOrder(Order order) throws Exception;
}
