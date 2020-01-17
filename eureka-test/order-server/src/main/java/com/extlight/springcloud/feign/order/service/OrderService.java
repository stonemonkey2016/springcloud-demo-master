package com.extlight.springcloud.feign.order.service;

import com.extlight.springcloud.common.model.Order;

public interface OrderService {

	void placeOrder(Order order) throws Exception;
}
