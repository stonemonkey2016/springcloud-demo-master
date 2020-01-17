package com.extlight.springcloud.feign.goods.service.impl;

import com.extlight.springcloud.common.model.Goods;
import com.extlight.springcloud.feign.goods.service.GoodsService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @descrption:
 * @author: bubbles
 */
@Service
public class GoodsServiceImpl implements GoodsService {

    // 模拟数据库
    private static Map<String,Goods> data;

    static {
        data = new HashMap<>();
        data.put("1", new Goods("1", "手机", "国产手机", 2002));
        data.put("2", new Goods("2", "电脑", "台式电脑", 2002));
    }


    @Override
    public Goods findGoodsById(String goodsId) {
        return data.get(goodsId);
    }
}
