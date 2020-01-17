package com.extlight.springcloud.order.controller;

import com.extlight.springcloud.common.model.Order;
import com.extlight.springcloud.common.vo.Result;
import com.extlight.springcloud.order.service.OrderService;
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
        // http://127.0.0.1:2005/order/place?goodsId=1
        // http://ribbon-test-order:2005/order/place?goodsId=1
        orderService.placeOrder(order);
        return Result.success();
    }
}




