package com.extlight.springcloud.feign.goods.service;

import com.extlight.springcloud.common.model.Goods;

/**
 * @descrption:
 * @author: bubbles
 */
public interface GoodsService {
    Goods findGoodsById(String goodsId);
}
