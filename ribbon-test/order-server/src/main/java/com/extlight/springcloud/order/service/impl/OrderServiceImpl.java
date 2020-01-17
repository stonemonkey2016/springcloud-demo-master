package com.extlight.springcloud.order.service.impl;

import com.extlight.springcloud.common.model.Order;
import com.extlight.springcloud.common.vo.Result;
import com.extlight.springcloud.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

/**
 * @descrption:
 * @author: bubbles
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private RestTemplate restTemplate;
    //@Autowired
    //private DiscoveryClient client;


    @Override
    public void placeOrder(Order order) throws Exception {

        // 获取商品服务地址列表
        //List<ServiceInstance> list = this.client.getInstances(("ribbon-test-goods"));
        //String uri = "";
        //for(ServiceInstance instance: list){
        //    if(instance.getUri() != null && !"".equals(instance.getUri())){
        //        uri = instance.getUri().toString();
        //        break;
        //    }
        //}
        //System.out.println("uri=["+ uri +"]");  //  uri = "http://127.0.0.1:2004";

        //Result result = restTemplate.getForObject(new URI(uri + "/goods/goodsInfo/" +
        //        order.getGoodsId()), Result.class);


        Result result = restTemplate.getForObject("http://ribbon-test-goods/goods/goodsInfo/" + order.getGoodsId(), Result.class);
        if(result != null && result.getCode() == 200){
            System.out.println("=====下订单====");
            System.out.println(result.getData());
        }

    }
}















