package com.faith.dao;

import java.util.List;
import com.faith.entity.orderDetails;

public interface OrderDetailsDao {
    public List<orderDetails> searchGoodsByDetail(int orderId);
    public List<orderDetails> searchOrderbyGoodsId(int goodsId);

}
