package com.extlight.springcloud.feign.common.client;

import com.extlight.springcloud.feign.common.vo.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @descrption:
 * @author: bubbles
 */
@FeignClient(value="feign-test-goods")
public interface GoodsServiceClient {

    @RequestMapping("/goods/goodsInfo/{goodsId}")
    Result goodsInfo(@PathVariable("goodsId") String goodsId);
}
