package com.extlight.springcloud.common.client;

import com.extlight.springcloud.common.fallback.GoodsServiceClientFallbackFactory;
import com.extlight.springcloud.common.vo.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "GOODS",fallbackFactory = GoodsServiceClientFallbackFactory.class)
public interface GoodsServiceClient {

    @RequestMapping("/goods/goodsInfo/{goodsId}")
    Result goodsInfo(@PathVariable("goodsId") String goodsId);
}

