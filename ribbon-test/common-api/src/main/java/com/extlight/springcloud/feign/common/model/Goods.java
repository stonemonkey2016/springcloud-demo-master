package com.extlight.springcloud.common.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @descrption:
 * @author: bubbles
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Goods {
    private String goodsId;

    private String name;

    private String descr;

    // 测试端口
    private int port;

}
