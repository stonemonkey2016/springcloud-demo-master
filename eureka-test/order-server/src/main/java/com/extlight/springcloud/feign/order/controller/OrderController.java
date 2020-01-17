package com.extlight.springcloud.feign.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.extlight.springcloud.common.model.Order;
import com.extlight.springcloud.common.vo.Result;
import com.extlight.springcloud.feign.order.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@RequestMapping("/place")
	public Result placeOrder(Order order) throws Exception {
		// http://127.0.0.1:8100/order/place?goodsId=1
		// http://order:8100/order/place?goodsId=1
		this.orderService.placeOrder(order);
		return Result.success();
	}
}
