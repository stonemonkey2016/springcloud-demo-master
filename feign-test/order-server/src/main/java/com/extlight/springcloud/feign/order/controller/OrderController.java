package com.extlight.springcloud.feign.order.controller;

import com.extlight.springcloud.feign.common.model.Order;
import com.extlight.springcloud.feign.common.vo.Result;
import com.extlight.springcloud.feign.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @descrption:
 * @author: bubbles
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/place")
    public Result placeOrder(Order order) throws Exception {
        // http://127.0.0.1:3004/order/place?goodsId=1
        // http://feign-test-order:3004/order/place?goodsId=1
        orderService.placeOrder(order);
        return Result.success();
    }
}




