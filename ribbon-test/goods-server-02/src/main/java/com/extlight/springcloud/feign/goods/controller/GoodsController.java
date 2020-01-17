package com.extlight.springcloud.feign.goods.controller;

import com.extlight.springcloud.common.model.Goods;
import com.extlight.springcloud.common.vo.Result;
import com.extlight.springcloud.feign.goods.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @descrption:
 * @author: bubbles
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @RequestMapping("/goodsInfo/{goodsId}")
    public Result goodsInfo(@PathVariable String goodsId) {

        Goods goods = this.goodsService.findGoodsById(goodsId);
        return Result.success(goods);
    }
}

