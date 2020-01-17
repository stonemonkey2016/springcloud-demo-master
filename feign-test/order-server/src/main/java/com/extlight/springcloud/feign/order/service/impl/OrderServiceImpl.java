package com.extlight.springcloud.feign.order.service.impl;

import com.extlight.springcloud.feign.common.client.GoodsServiceClient;
import com.extlight.springcloud.feign.common.model.Order;
import com.extlight.springcloud.feign.common.vo.Result;
import com.extlight.springcloud.feign.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @descrption:
 * @author: bubbles
 */
@Service
public class OrderServiceImpl implements OrderService {

    // @Autowired
    // private RestTemplate restTemplate;

    @Autowired
    private GoodsServiceClient goodsServiceClient;

    @Override
    public void placeOrder(Order order) throws Exception {

        // Result result = restTemplate.getForObject("http://ribbon-test-goods/goods/goodsInfo/" + order.getGoodsId(), Result.class);

        Result result = goodsServiceClient.goodsInfo(order.getGoodsId());
        if (result != null && result.getCode() == 200) {
            System.out.println("=====下订单====");
            System.out.println(result.getData());
        }

    }
}















